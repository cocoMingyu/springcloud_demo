package com.kn.account.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 * @ Author:kn
 * @ Description:
 * @ Date:Created in 2019/4/22 14:15
 * @ Modified By:
 */
public class CustomIRule extends AbstractLoadBalancerRule {
    //总共被调用的次数，目前要求每台被调用5次
    private static int total;
    ////当前提供服务列表的索引
    private static int index;
    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        } else {
            Server server = null;

            while(server == null) {
                if (Thread.interrupted()) {
                    return null;
                }

                List<Server> upList = lb.getReachableServers();
                List<Server> allList = lb.getAllServers();
                int serverCount = allList.size();
                if (serverCount == 0) {
                    return null;
                }

                if (total<5){
                    total++;
                    server=upList.get(index);
                }else {
                    total=0;
                    index++;
                    if (index>=allList.size()){
                        index=0;
                    }
                }

                if (server == null) {
                    Thread.yield();
                } else {
                    if (server.isAlive()) {
                        return server;
                    }

                    server = null;
                    Thread.yield();
                }
            }

            return server;
        }
    }

    public Server choose(Object key) {
        return this.choose(this.getLoadBalancer(), key);
    }

    public void initWithNiwsConfig(IClientConfig clientConfig) {
    }
}

package com.kn.api.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class User {
  private int id;
  private String useridnet;
  private String businessid;
  private String name;
  private String nickname;
  private String headimgurl;
  private String idcard;
  private String mobile;
  private String wxUnionid;
  private int isrealname;
  private Date createdat;
  private Date updatedat;
  private String years;
  private String signature;
  private String constellation;
  private String address;
  private String themeurl;
  private String password;

}

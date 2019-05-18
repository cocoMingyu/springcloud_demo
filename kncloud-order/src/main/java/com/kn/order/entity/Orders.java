package com.kn.order.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Orders {

  private int id;
  private int orderno;
  private int buyerid;
  private int sellerid;
  private int sellertype;
  private String sellername;
  private int source;
  private int paytype;
  private Date closedat;
  private Date payedat;
  private Date deliveryat;
  private Date payovertime;
  private Date confirmgoodtime;
  private Date completedat;
  private String tradeno;
  private int cfid;
  private BigDecimal payamount;
  private BigDecimal promotionamount;
  private BigDecimal expressamount;
  private BigDecimal productamount;
  private BigDecimal activityamount;
  private int activitytype;
  private String activityid;
  private int closetype;
  private String consignee;
  private String mobile;
  private String country;
  private String address;
  private String postzip;
  private String expresscompany;
  private String expressno;
  private int status;
  private int trackprogress;
  private Date createdat;
  private Date updatedat;
  private String usercomments;
  private String platformcomments;
  private String sellercomments;
  private String platformgosellercomments;
  private String sellegoplatformrcomments;
  private int isdel;
  private Date passdat;
  private BigDecimal servicefee;
  private String couponuserid;
  private String db_source;

}

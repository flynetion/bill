package com.flynetion.bill.manager.bean.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/** 用户返回VO */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserRespVO {

  /** 用户名 */
  private String userName;
  /** 用户年龄 */
  private Integer age;
  /** 电子邮箱 */
  private String email;
}

package com.flynetion.bill.manager.bean.po;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 系统用户
 *
 * @author xiazl
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    /**
     * 用户编号
     */
    private String uid;

    /**
     * 用户名
     */
    private String userName;
}

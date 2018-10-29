package com.flynetion.bill.manager.bean.po;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 角色
 *
 * @author xiazl
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Role {

    /**
     * 角色编号
     */
    private String rid;

    /**
     * 角色名称
     */
    private String name;
}

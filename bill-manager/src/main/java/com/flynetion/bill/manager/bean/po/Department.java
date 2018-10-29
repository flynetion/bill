package com.flynetion.bill.manager.bean.po;

import lombok.Getter;
import lombok.Setter;

/**
 * 部门
 *
 * @author xiazl
 */
@Setter
@Getter
public class Department {

    /**
     * 部门机构Id
     */
    private String deptId;

    /**
     * 机构名称
     */
    private String name;

    /**
     * 上级机构编号
     */
    private String parentId;

}

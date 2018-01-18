package com.nowcoder.model;

import lombok.Data;

@Data
public class ZcyUser {
    /**
     * 员工ID
     */
    private int id;

    /**
     * 姓名name
     */
    private String name;

    /**
     * 花名
     */
    private String flowerName;

    /**
     *年龄
     */
    private int age;

    /**
     * 所在部门
     */
    private String department;
}

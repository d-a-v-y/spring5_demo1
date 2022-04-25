package com.atguigu.spring.bean;

/**
 * @author Davy
 * 员工类
 */
public class Emp {
    private String ename;
    private String gender;

    //员工属于某一部门，使用对象来表示
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void add(){
        System.out.println(ename+"--"+gender+"--"+dept);
    }
}
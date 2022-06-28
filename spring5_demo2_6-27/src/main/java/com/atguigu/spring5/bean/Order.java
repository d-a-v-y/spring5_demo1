package com.atguigu.spring5.bean;

/**
 * @author Davy
 */
public class Order {
    private String oname;

    public Order() {
        System.out.println("第一步->执行无参构造创建bean实例");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二步->调用set方法设置属性的值");
    }

    public void initMethod(){
        System.out.println("第三步->执行初始化方法");
    }

    public void destroyMethod(){
        System.out.println("第五步->执行销毁的方法");
    }
}

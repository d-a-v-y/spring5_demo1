package com.atguigu.spring5;

/**
 * @author Davy
 */
public class Order {

    private String oname;
    private String address;

    public Order(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public void ordersTest(){
        System.out.println(oname+"::"+address);
    }
}
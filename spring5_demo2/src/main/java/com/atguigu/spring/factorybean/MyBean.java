package com.atguigu.spring.factorybean;

import com.atguigu.spring.collection.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author Davy
 */
public class MyBean implements FactoryBean {
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("一二三");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}

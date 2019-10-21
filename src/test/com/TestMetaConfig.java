package com;

import domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.MetaClass;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

/**
 * @author ：chenchao06
 * @description： file name
 * @mobile ：18676838076
 * @date ：Created in 2019/9/19 21:41
 * @modified By：
 * @version: 1.0
 */
public class TestMetaConfig {

    @Test
    public void testMeta(){
        MetaClass metaClass = MetaClass.forClass(User.class,new DefaultReflectorFactory());
        System.out.println(metaClass.hasGetter("name"));
        System.out.println(metaClass.hasDefaultConstructor());
        System.out.println(metaClass.findProperty("age"));
    }
}

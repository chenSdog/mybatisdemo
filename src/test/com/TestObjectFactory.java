package com;

import domain.BussOb;
import domain.User;
import mapper.UserMapper;
import objectfactory.UserFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ：chenchao06
 * @description： file name
 * @mobile ：18676838076
 * @date ：Created in 2019/9/20 15:25
 * @modified By：
 * @version: 1.0
 */
public class TestObjectFactory {
    static SqlSession sqlSession = null;
    static {
        try {
            String resource =  "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            sqlSession = sqlSessionFactory.openSession();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void test(){
        System.out.println("这里是配置文件");
    }

    @Test
    public void testTypeHandler(){
       try {
       UserMapper userMapper =     sqlSession.getMapper(UserMapper.class);

        User user  = userMapper.getById(1L);
           System.out.println(user.getName());
       }catch (Exception e){
           e.printStackTrace();
       }

    }


    @Test
    public void testDbName(){
        try {
            Connection connection = sqlSession.getConnection();
                         String dbName = connection.getMetaData().getDatabaseProductName();
                         String dbVersion = connection.getMetaData().getDatabaseProductVersion();
            System.out.println(dbName);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

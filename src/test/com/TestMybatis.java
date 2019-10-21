/*
package com;

import domain.*;
import mapper.UserAddressMapper;
import mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import utils.JsonUtils;

import javax.swing.plaf.synth.SynthSpinnerUI;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

*/
/**
 * @author ：chenchao06
 * @description： file name
 * @mobile ：18676838076
 * @date ：Created in 2019/9/11 11:55
 * @modified By：
 * @version: 1.0
 *//*


public class TestMybatis {
     static  SqlSession sqlSession = null;
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
    public void testNull(){
        System.out.println("空方法测试");
    }



    @Test
    public void testSql(){
        try {
            Integer count = sqlSession.selectOne("findCount");
            System.out.println("结果集合：" + count);
            User user = sqlSession.selectOne("findById",new HashMap<String,Object>(){{put("id",1);}});
            System.out.println(JsonUtils.toJson(user));
           List<User> userList =  sqlSession.selectList("findBySql");
            System.out.println(JsonUtils.toJson(userList));

            System.out.println();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void save(){
        try {
            User user = new User(9L,"zhagnsan",34);
            sqlSession.insert("save",user);
            sqlSession.commit();
            System.out.println("save successs");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void update(){
        try {
            sqlSession.update("updateById",new HashMap<String,Object>(){{put("id",1);put("name","wangwu");put("age",100);}});
            sqlSession.commit();
            System.out.println("update success");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void querList(){
        try {
            List<User> list = sqlSession.selectList("queryList",Arrays.asList(1L,2L,3L,4L,5L));
            System.out.println(JsonUtils.toJson(list));
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    @Test
    public void querResultMap(){
        try {
            List<UserAnother> list = sqlSession.selectList("queryResultMap");
            System.out.println(JsonUtils.toJson(list));
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    @Test
    public void queryReturnMap(){
        try {
            List<UserAnother> list = sqlSession.selectList("queryReturnMap");
            System.out.println(JsonUtils.toJson(list));
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Test
    public void queryAssocation(){
        try {
            UserAddressMapper addressMapper = sqlSession.getMapper(UserAddressMapper.class);
            UserAddress address = addressMapper.getById(1L);
            System.out.println(JsonUtils.toJson(address));
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Test
    public void queryAssocationBySteps(){
        try {
            UserAddressMapper addressMapper = sqlSession.getMapper(UserAddressMapper.class);
            UserAddress address = addressMapper.getStepsById(1L);
            System.out.println(JsonUtils.toJson(address));
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    @Test
    public void queryAssocationByStepsMult(){
        try {
            UserAddressMapper addressMapper = sqlSession.getMapper(UserAddressMapper.class);
            UserAddress address = addressMapper.getStepsByIdMult(1L);
            System.out.println(JsonUtils.toJson(address));
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    */
/**
     * 直接查找collection
     *//*

    @Test
    public void queryCollectionSingle(){
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.getUserIncludeAddress(1L);
            System.out.println(JsonUtils.toJson(user));
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    */
/**
     * 使用鉴别器
     *//*

    @Test
    public void queryJudege(){
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.getUserByType(1L);
            if(user instanceof BlackUser){
                System.out.println(user);
            }else{
                System.out.println(((YellowUser)user).getCity());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @Test
    public void testPluginQury(){
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.getById(1L);
            System.out.println(user);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
*/

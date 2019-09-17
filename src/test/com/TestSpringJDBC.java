package com;
import com.bean.User;
import com.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;

/**
 * @author ：chenchao06
 * @description： file name
 * @mobile ：18676838076
 * @date ：Created in 2019/9/17 21:03
 * @modified By：
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestSpringJDBC {

    @Resource
    UserService userService;

    @Test
    public void testUser(){
        try {

            User user  = userService.getById(1L);
            System.out.println(user);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

package com;

import domain.BlackUser;
import domain.User;
import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.Reflector;
import org.apache.ibatis.reflection.ReflectorFactory;
import org.junit.Test;
import reflect.ReflectorBean;

/**
 * @author ：chenchao06
 * @description： file name
 * @mobile ：18676838076
 * @date ：Created in 2019/10/10 20:03
 * @modified By：
 * @version: 1.0
 */

public class ReflectorTest {
    static {
        createSecurity();//启动安全机制
    }
    @Test
    public void testReflector(){
        ReflectorFactory factory = new DefaultReflectorFactory();
        Reflector reflector =  factory.findForClass(BlackUser.class);
        System.out.println(reflector.findPropertyName("city"));
    }

    @Test
    public void testReflectPrivate(){
        ReflectorFactory factory = new DefaultReflectorFactory();
        Reflector reflector =  factory.findForClass(ReflectorBean.class);
        System.out.println(reflector.findPropertyName("name"));
    }


    private static void createSecurity(){
        try {
            String s = System.getProperty("java.security.manager");
            if(s != null){
                SecurityManager sm = null;
                if(".".equals(s) || "default".equals(s)){//默认是新建安全机制
                    sm = new SecurityManager();
                }else{//
                    try {
                        sm = (SecurityManager) Thread.currentThread().getClass().getClassLoader().loadClass(s).newInstance();

                    }catch (Exception e){
                        e.printStackTrace();
                    }

                }
                if(sm != null){
                    System.setSecurityManager(sm);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

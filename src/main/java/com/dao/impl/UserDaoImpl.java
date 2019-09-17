package com.dao.impl;

import com.bean.User;
import com.dao.UserDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ：chenchao06
 * @description： file name
 * @mobile ：18676838076
 * @date ：Created in 2019/9/17 20:53
 * @modified By：
 * @version: 1.0
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Resource
    JdbcTemplate jdbcTemplate;
    @Resource
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @Override
    public User getById(Long id) {
        String sql = "select * from user where id= ?";
        User user = jdbcTemplate.queryForObject(sql,new User(),id);
        return user;
    }

    @Override
    public List<User> findList() {
        String sql ="select * from user";
        return jdbcTemplate.query(sql,new User());
    }

    @Override
    public Long save(User entity) {
        String sql = "insert into user( id,name,age,score,type,black,city) values(id,name,age,score,type,black,city)";
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource.addValue("id",10);
        parameterSource.addValue("name","1011");
        parameterSource.addValue("age",100);
        parameterSource.addValue("score",10.0);
        parameterSource.addValue("type",1);
        parameterSource.addValue("black",12);
        parameterSource.addValue("city","杭州市");
        return Long.valueOf(namedParameterJdbcTemplate.update(sql,parameterSource));
    }
}




































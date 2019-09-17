package com.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.jdbc.core.RowMapper;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author ：chenchao06
 * @description： file name
 * @mobile ：18676838076
 * @date ：Created in 2019/9/17 20:47
 * @modified By：
 * @version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User implements RowMapper<User>,Serializable {
    private Long id;
    private String name;
    private Integer age;
    private Double score;
    private Integer type;
    private String black;
    private String city;

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setId(rs.getLong("id"));
        user.setName(rs.getString("name"));
        user.setAge(rs.getInt("age"));
        user.setScore(rs.getDouble("score"));
        user.setType(rs.getInt("type"));
        user.setBlack(rs.getString("black"));
        user.setCity(rs.getString("city"));
        return user;
    }
}

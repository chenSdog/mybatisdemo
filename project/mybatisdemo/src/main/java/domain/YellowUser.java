package domain;

import java.util.List;

/**
 * @author ：chenchao06
 * @description： file name
 * @mobile ：18676838076
 * @date ：Created in 2019/9/12 17:34
 * @modified By：
 * @version: 1.0
 */
public class YellowUser extends User {
    private String city;

    public YellowUser(){

    }

    public YellowUser(String city) {
        this.city = city;
    }

    public YellowUser(long id, String name, int age, String city) {
        super(id, name, age);
        this.city = city;
    }

    public YellowUser(Long id, String name, Integer age, Double score, String city) {
        super(id, name, age, score);
        this.city = city;
    }

    public YellowUser(Long id, String name, Integer age, Double score, List<UserAddress> addessList, String city) {
        super(id, name, age, score, addessList);
        this.city = city;
    }

    public YellowUser(Long id, String name, Integer age, Double score, int type, List<UserAddress> addessList, String city) {
        super(id, name, age, score, type, addessList);
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

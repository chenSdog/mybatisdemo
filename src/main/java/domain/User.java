package domain;

import java.io.Serializable;
import java.util.List;

/**
 * @author ：chenchao06
 * @description： file name
 * @mobile ：18676838076
 * @date ：Created in 2019/9/11 11:24
 * @modified By：
 * @version: 1.0
 */
public class User implements Serializable {
    private Long id;
    private String name;
    private Integer age;
    private Double score;
    private Integer type;
    private List<UserAddress> addessList;

    public User(){

    }
    public User(Long id,String name,Integer age,Double score,Integer type){
        this.id =id;
        this.name = name;
        this.age = age;
        this.score = score;
        this.type = type;
    }
    public User(long id,String name,int age){
        this.id =id;
        this.name = name;
        this.age = age;
    }

    public User(Long id,String name,Integer age,Double score){
        this.id =id;
        this.name = name;
        this.age = age;
        this.score = score;
    }



    public User(Long id, String name, Integer age, Double score, List<UserAddress> addessList) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
        this.addessList = addessList;
    }

    public User(Long id, String name, Integer age, Double score, Integer type, List<UserAddress> addessList) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
        this.type = type;
        this.addessList = addessList;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public List<UserAddress> getAddessList() {
        return addessList;
    }

    public void setAddessList(List<UserAddress> addessList) {
        this.addessList = addessList;
    }

    public void intit(){
        this.age = 100;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}

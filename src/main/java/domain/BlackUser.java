package domain;

import java.io.Serializable;
import java.util.List;

/**
 * @author ：chenchao06
 * @description： file name
 * @mobile ：18676838076
 * @date ：Created in 2019/9/12 17:33
 * @modified By：
 * @version: 1.0
 */
public class BlackUser extends User implements Serializable {
    private String black;

    public BlackUser(){

    }

    public BlackUser(String black) {
        this.black = black;
    }

    public BlackUser(long id, String name, int age, String black) {
        super(id, name, age);
        this.black = black;
    }

    public BlackUser(Long id, String name, Integer age, Double score, String black) {
        super(id, name, age, score);
        this.black = black;
    }

    public BlackUser(Long id, String name, Integer age, Double score, List<UserAddress> addessList, String black) {
        super(id, name, age, score, addessList);
        this.black = black;
    }


    public BlackUser(Long id, String name, Integer age, Double score, int type, List<UserAddress> addessList, String black) {
        super(id, name, age, score, type, addessList);
        this.black = black;
    }

    public String getBlack() {
        return black;
    }

    public void setBlack(String black) {
        this.black = black;
    }

    @Override
    public String toString() {
        return "BlackUser{" +
                "black='" + black + '\'' +
                '}';
    }
}

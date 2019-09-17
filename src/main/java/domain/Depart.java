package domain;

/**
 * @author ：chenchao06
 * @description： file name
 * @mobile ：18676838076
 * @date ：Created in 2019/9/12 17:03
 * @modified By：
 * @version: 1.0
 */
public class Depart {
    private Long id;
    private String name;
    public Depart(){

    }
    public Depart(Long id,String name){
        this.id = id;
        this.name = name;
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
}

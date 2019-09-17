package domain;

/**
 * @author ：chenchao06
 * @description： file name
 * @mobile ：18676838076
 * @date ：Created in 2019/9/12 14:53
 * @modified By：
 * @version: 1.0
 */
public class UserAddress {
    private Long id;
    private String address;
    private String remark;
    private User user;
    public UserAddress(){

    }

    public UserAddress(Long id,String address,String remark,User user){
        this.id = id;
        this.address = address;
        this.remark = remark;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

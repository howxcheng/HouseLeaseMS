package cn.howxcheng.pojo;


public class User {

    private int uid;
    private String username;
    private String password;
    private String phone;
    private String email;

    public User() {
    }

    public User(int uid, String username, String password, String phone, String email) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.email = email;
    }


    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

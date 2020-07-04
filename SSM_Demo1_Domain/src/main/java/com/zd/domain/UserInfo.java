package com.zd.domain;

import java.util.List;

/**
 * @ProjectName: SSM_Demo1
 * @Package: com.zd.domain
 * @ClassName: UserInfo
 * @Author: 晴天
 * @Date: 2020/4/9 16:52
 * @Version: 1.0
 */
//与数据库对应
public class UserInfo {

    private String id;
    private String email;
    private String username;
    private String password;
    private String phoneNum;
    private int status;
    private String statusStr;
    private List<Role> roles;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusStr() {
        //状态0 未开启 状态1 开启
        if(status == 0){
            statusStr = "未开启";
        }else if(status == 1){
            statusStr = "开启";
        }
        return statusStr;
    }

    public void setStatusStr(String statusStr) {
        this.statusStr = statusStr;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}

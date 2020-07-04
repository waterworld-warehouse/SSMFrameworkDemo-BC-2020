package com.zd.domain;

import java.util.List;

/**
 * @ProjectName: SSM_Demo1
 * @Package: com.zd.domain
 * @ClassName: Permission
 * @Author: 晴天
 * @Date: 2020/4/9 16:55
 * @Version: 1.0
 */
public class Permission {

    private String id;
    private String permissionName;
    private String url;
    private List<Role> roles;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}

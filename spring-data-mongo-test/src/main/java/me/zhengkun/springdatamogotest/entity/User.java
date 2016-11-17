package me.zhengkun.springdatamogotest.entity;

import org.springframework.data.annotation.Id;

/**
 * Created by unicorn on 2016/11/17.
 */
public class User {
    /**
     * 标识ID信息
     * 插入数据时如果没有提供，MongoDB会自动生成
     */
    @Id
    private String id;
    private String name;
    private String password;

    public User() {

    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

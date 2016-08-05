package com.test.mvvm;

/**
 * Created by 13798 on 2016/8/6.
 */
public class User {
    private String name;
    private String sex;
    private String age;

    public User(String name, String age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public static String XiaoMing(String text){
        return text+"和小明";
    }
}

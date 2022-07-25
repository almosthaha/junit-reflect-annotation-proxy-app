package com.lyg.d1_reflect;

/**
 * @author almost
 * @date 2022/7/25 16:16
 */
public class Student {


    private String name;
    private Integer age;
    private String Number;
    private String sex;
    private String hobby;


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Number='" + Number + '\'' +
                ", sex='" + sex + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}

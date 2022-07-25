package com.lyg.d1_reflect;

/**
 * @author almost
 * @date 2022/7/25 14:32
 */
public class Test {

    public static void main(String[] args) throws ClassNotFoundException {

        //1.class类中的一个静态方法: forName(权限名: 包名+类名)
        Class c=Class.forName("com.lyg.d1_reflect.Teacher");
        System.out.println(c);

        //2.类名.class
        Class c1=Teacher.class;
        System.out.println(c1);

        //3.对象.getClass() 获取对象对应类的class对象
        Teacher teacher=new Teacher();
        Class c2=teacher.getClass();
        System.out.println(c2);
    }
}

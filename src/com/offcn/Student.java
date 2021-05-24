package com.offcn;

public class Student {
    private int sid;
    private String name;
    private int age;

    public Student() {
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(int sid, String name, int age) {
        this.sid = sid;
        this.name = name;
        this.age = age;
    }
}

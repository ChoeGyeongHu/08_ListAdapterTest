package com.example.a08_listadaptertest;

public class Person {
    private String name;
    private String birthday;
    private String sex;

    // Alt + Insert => Generate창을 열고 거기서  Constructor를 선택
    public Person(String name, String birthday, String sex) {
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
    }


    //////////////////////////////////////////////////////////////////
    // Alt + Insert => Getter and Setter 선택 => 아래와 같이 자동으로 생성
    //////////////////////////////////////////////////////////////////

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

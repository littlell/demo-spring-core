package com.demo.spring.core19;

public class User {
  private int age;
  private String desc;

  public void setAge(int age) {
    this.age = age;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  @Override
  public String toString() {
    return "User{" +
        "age=" + age +
        ", desc='" + desc + '\'' +
        '}';
  }
}

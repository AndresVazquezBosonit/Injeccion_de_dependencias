package com.dependency.injection.dependencyinjection;

import org.springframework.stereotype.Component;
public class Person {
  private String name;
  private String city;
  private int age;

  public String getname() {
    return name;
  }

  public void setname(String name) {
    this.name = name;
  }

  public String getcity() {
    return city;
  }

  public void setcity(String city) {
    this.city = city;
  }

  public int getage() {
    return age;
  }

  public void setage(int age) {
    this.age = age;
  }
}

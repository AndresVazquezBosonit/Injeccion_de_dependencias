package com.dependency.injection.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImplements implements CreatePersonService{
    Person person = new Person();

    public String getName(){
        return person.getname();
    }

    public void setName(String name) {
        person.setname(name);
    }

    public String getCity() {
        return person.getcity();
    }

    public void setCity(String city) {
        person.setcity(city);
    }

    public int getAge() {
        return person.getage();
    }

    public void setAge(int age) {
        person.setage(age);
    }
}

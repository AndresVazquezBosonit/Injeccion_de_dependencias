package com.dependency.injection.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;

public interface CreatePersonService {

    String getName();
    void setName(String name);
    String getCity();
    void setCity(String city);
    int getAge();
    void setAge(int age);


}

package com.dependency.injection.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controlador1 {

  CreatePersonService createPersonService;

  public Controlador1(CreatePersonService createPersonService) {
    this.createPersonService = createPersonService;
  }

  @GetMapping("/controlador1/addpersona")
  public CreatePersonService getAddPersona(
      @RequestHeader String name, @RequestHeader String city, @RequestHeader int age) {

    System.out.println("ok");
    createPersonService.setName(name);
    createPersonService.setCity(city);
    createPersonService.setAge(age);
    return createPersonService;
  }
}

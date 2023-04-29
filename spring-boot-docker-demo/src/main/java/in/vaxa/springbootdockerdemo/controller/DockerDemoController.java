package in.vaxa.springbootdockerdemo.controller;

import in.vaxa.springbootdockerdemo.service.DockerDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerDemoController {

  @Autowired
  private DockerDemoService dockerDemoService;

  @GetMapping(value = "/hello")
  public String getGreetings(){

    return this.dockerDemoService.getGreetingsMessage();
  }
}

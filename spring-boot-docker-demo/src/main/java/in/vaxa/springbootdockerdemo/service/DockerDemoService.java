package in.vaxa.springbootdockerdemo.service;

import org.springframework.stereotype.Service;

@Service
public class DockerDemoService {

  public String getGreetingsMessage(){
    return "Congratulation! You just ran your spring boot project in docker container";
  }
}

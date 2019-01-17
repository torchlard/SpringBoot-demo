package hello.controller;

import hello.bean.User;

import java.util.Date;
import java.util.HashMap;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping(value="/index")
public class IndexController {
  private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

  @Value(value = "${spring.application.secret}")
  private String secret;

  @Value(value = "${spring.application.name}")
  private String desc;

  @RequestMapping
  public String index(){
    logger.debug("this is a log test, debug");
    logger.info("this is an info");
    return "hello world " + secret + " " + desc;
  }


  @RequestMapping(value = "/get")
  public HashMap<String, Object> get(@RequestParam String name) {
    HashMap<String, Object> map = new HashMap<>();
    map.put("title", "Hello world");
    map.put("name", name);
    return map;
  }

  @RequestMapping(value = "/get/{id}/{name}")
  public User getUser(@PathVariable int id, @PathVariable String name){
    User user = new User();
    user.setId(id);
    user.setName(name);
    user.setDate(new Date());

    System.out.println(user.toString());
    return user;
  }
  
  @RequestMapping("error")
  public String error(ModelMap map) {
    throw new RuntimeException("test error");
  }

}











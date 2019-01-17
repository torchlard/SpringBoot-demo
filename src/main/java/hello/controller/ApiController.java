package hello.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
  
  @CrossOrigin(origins = "http://localhost:8005")
  @RequestMapping(value="/get", method = RequestMethod.POST )
  public HashMap<String, Object> get(@RequestParam String name){
    HashMap<String, Object> map = new HashMap<>();
    map.put("title", "api gets");
    map.put("name", name);
    return map;
  }
}






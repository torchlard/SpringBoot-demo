package hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
@RequestMapping("/web")
public class WebController {
  private static final Logger logger = LoggerFactory.getLogger(WebController.class);

  @RequestMapping("index")
  public String index(ModelMap map) {
    logger.info("this is controller");
    map.put("title", "hello cats");
    map.put("springUrl", "www.google.com");
    
    return "index";
  }

  @RequestMapping("error")
  public String error(ModelMap map) {
    throw new RuntimeException("test error");
  }

}












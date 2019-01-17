package hello.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.ModelAndView;


@ControllerAdvice
public class BizException {
  private static final Logger logger = LoggerFactory.getLogger(BizException.class);

  @ExceptionHandler({RuntimeException.class })
  @ResponseStatus(HttpStatus.OK)
  public ModelAndView processException(RuntimeException ex) {
    logger.info("custom runtime exception");
    logger.error(ex.getMessage());
    
    ModelAndView m = new ModelAndView();
    m.addObject("roncooException", ex.getMessage());
    m.setViewName("error/500");
    return m;
  }

  @ExceptionHandler({Exception.class})
  @ResponseStatus(HttpStatus.OK)
  public ModelAndView processException(Exception ex) {
    logger.info("custom exception");
    logger.error(ex.getMessage());

    ModelAndView m = new ModelAndView();
    m.addObject("roncooException", ex.getMessage());
    m.setViewName("error/500");
    return m;

  }
  
  
}








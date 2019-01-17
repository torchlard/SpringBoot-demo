package hello.util.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@WebListener
public class CustomListener implements ServletContextListener {
  private static final Logger logger = LoggerFactory.getLogger(CustomListener.class);

  @Override
  public void contextInitialized(ServletContextEvent sce){
    logger.info("context initialized");
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce){
    logger.info("context destroyed ");
  }
  
}









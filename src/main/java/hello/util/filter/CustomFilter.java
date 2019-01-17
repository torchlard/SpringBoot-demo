package hello.util.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;

@Order(1)
@WebFilter(filterName="testFilter1", urlPatterns="/*")
public class CustomFilter implements Filter {
  private static final Logger logger = LoggerFactory.getLogger(CustomFilter.class);

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
    logger.info("init filter");
  }

  @Override
  public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
    throws IOException, ServletException {
      logger.info("do filter");
      System.out.println("make filters by println");
      chain.doFilter(req, res);
    }

  @Override
  public void destroy(){
    logger.info("destroy filter");
  }
}









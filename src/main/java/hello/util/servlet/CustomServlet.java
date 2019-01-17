package hello.util.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet(urlPatterns="/roncoo", name="customServlet")
public class CustomServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
  private static final Logger logger = LoggerFactory.getLogger(CustomServlet.class);
  

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse res) 
    throws ServletException, IOException{
      logger.info("servlet get method");
      doPost(req, res);
    }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse res) 
    throws ServletException, IOException {
      logger.info("servlet post method");
      res.getWriter().write("hello world");
    }
  
  
}




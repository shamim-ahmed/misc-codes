package edu.buet.cse.javaee.demo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.buet.cse.javaee.demo.ejb.GreetingBean;

public class GreetingServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @EJB
  private GreetingBean greetingBean;

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String name = request.getParameter("name");
    String greeting = "";

    if (name == null) {
      greeting = "Hello, anon";
    } else {
      greeting = greetingBean.getGreeting(name);
    }

    response.setContentType("text/plain");
    PrintWriter out = response.getWriter();
    out.println(greeting);
    out.flush();
  }
}

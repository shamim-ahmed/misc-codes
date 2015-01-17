package edu.buet.cse.javaee.demo.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.buet.cse.javaee.demo.domain.User;

@WebServlet(name = "userListServlet", urlPatterns = { "/user-list" })
public class UserListServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  @PersistenceUnit(unitName = "javaeeDemoPU")
  private EntityManagerFactory entityManagerFactory;
  
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head><title>User List</title></head>");
    out.println("<body>");
    out.println("<h1>User List</h1>");
    
    EntityManager entityManager = null;
    
    try {
      entityManager = entityManagerFactory.createEntityManager();
      TypedQuery<User> query = entityManager.createQuery("SELECT u FROM User u", User.class);
      query.setMaxResults(10);
      List<User> userList = query.getResultList();
      
      if (userList.size() > 0) {
        out.println("<table border='1'>");
        out.println("<tr><th>User Name</th><th>Email Address</th></tr>");
        
        for (User user : userList) {
          out.println(String.format("<tr><td>%s</td><td>%s</td></tr>", user.getUserName(), user.getEmailAddress()));
        }
        
        out.println("</table>");
      }
      
    } finally {
      if (entityManager != null) {
        entityManager.close();
      }
    }
    
    out.println("</body>");
    out.println("</html>");
  }
}

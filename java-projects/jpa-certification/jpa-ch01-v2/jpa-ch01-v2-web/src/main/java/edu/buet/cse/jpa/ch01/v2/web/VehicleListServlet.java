package edu.buet.cse.jpa.ch01.v2.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.buet.cse.ch01.v2.domain.Vehicle;
import edu.buet.cse.jpa.ch01.v2.ejb.VehicleBean;

@WebServlet(name = "vehicleListServlet", urlPatterns = { "/vehicles" })
public class VehicleListServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
  private static final String DEFAULT_MAKE = "sedan";
  
  @EJB
  private VehicleBean vehicleBean;
  
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String make = request.getParameter("make");
    
    if (make == null) {
      make = DEFAULT_MAKE;
    }
    
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head><title>Vehicle List</title></head>");
    out.println("<body>");
    out.println("<h1>Vehicle List</h1>");
    
    List<Vehicle> vehicleList = vehicleBean.getVehicleList(make);
    
    if (vehicleList.size() > 0) {
      out.println("<table border='1'>");
      out.println("<tr><td>Make</td><td>Model</td><td>Year</td></tr>");
      
      for (Vehicle vehicle : vehicleList) {
        out.println(String.format("<tr><td>%s</td><td>%s</td><td>%s</td></tr>", 
                                  vehicle.getMake(), vehicle.getModel(), vehicle.getYear()));
      }
      
      out.println("</table>");
    }
    
    out.println("</body>");
    out.println("</html>");
  }
}

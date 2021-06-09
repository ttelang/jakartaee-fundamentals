// HelloServlet.java
…
@WebServlet(urlPatterns="/servlet") 
public class HelloServlet extends HttpServlet 
{ 
  protected void doGet (HttpServletRequest request, HttpServletResponse response) 
  throws ServletException, IOException { 
      response.getWriter().println("Hello World!"); 
  }
}

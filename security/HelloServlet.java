@WebServlet(urlPatterns="/servlet") 

@FormAuthenticationMechanismDefinition(
loginToContinue = @LoginToContinue( errorPage  = "/error.html", loginPage = "/login.html"))

@ServletSecurity(value = @HttpConstraint(rolesAlowed = {"user", "admin"},
	transportGuarantee = ServletSecurity.TransportGuarantee.CONFIDENTIAL)
)

public class HelloServlet extends HttpServlet {  
     …
  @Inject
  private SecurityContext securityContext; 

  protected void doGet(HttpServletRequest request, HttpServletResponse response)  throws   ServletException, IOException {
    if (securityContext.isCallerInRole(Utils.USER)) {
      response.sendRedirect("/hello.jsf"); 
    }
  }
}

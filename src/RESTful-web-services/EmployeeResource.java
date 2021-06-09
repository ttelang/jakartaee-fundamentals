Path("/employee")
public class EmployeeResource  {
	@GET
	@Path(“/get/{id}”)
	@Produces(
		MediaTypes.APPLICATION_JSON)
	public Response getEmployee(@PathParam("id") int id) {
 		return Response.ok().entity(new Employee(id, "james", "james@com")).build();
	}
	…

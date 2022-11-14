package rest.webservice;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("greetings")
public class Hello {
	public Hello() {
		
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response SayHello() {
		return Response.status(200).entity("Bonjour").build();
	}
	

	@GET
	@Path("{FirstName}")
	@Produces(MediaType.TEXT_PLAIN)
	public Response helloParam(@PathParam(value="FirstName")String name) {
		return Response.status(200).
				entity("hello"+name).build();
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("hello")
	public Response helloParam2(@QueryParam(value="FirstName")String name) {
		return Response.status(200).
				entity("hello"+name).build();
	}

}

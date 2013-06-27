package cxftest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

import cxftest.domain.User;

@Service("userService")
@Path("v1")
public class UserServiceImpl implements UserService {

	@GET
	@Path("users")	
	@Consumes({"application/xml", "application/json"})
	@Produces({"application/xml", "application/json"})
	public User read() {
		// Some logic...
		System.out.println("got here");
		User u = new User();
		u.setName("martin");
		return u;
	}

}

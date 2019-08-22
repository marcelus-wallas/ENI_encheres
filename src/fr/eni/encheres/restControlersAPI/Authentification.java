package fr.eni.encheres.restControlersAPI;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import fr.eni.encheres.dto.AuthentificationDTO;

@Path("/authentification")
public class Authentification {

	@POST()
	@Consumes(MediaType.APPLICATION_JSON)
	public Response authentification(AuthentificationDTO authentificationDTO) {
		System.out.println(authentificationDTO);
		if(authentificationDTO.getPassword() != null) {
			return Response.ok().build();
		} else {
			return Response.status(Status.BAD_REQUEST).build();
		}
		
	}
	
}

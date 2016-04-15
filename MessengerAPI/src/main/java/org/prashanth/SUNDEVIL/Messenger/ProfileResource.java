package org.prashanth.SUNDEVIL.Messenger;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.prashanth.SUNDEVIL.Messenger.service.ProfileService;
import org.prashanth.SUNDEVIL.Messenger.Model.Profile;
@Path("/profiles")
public class ProfileResource {

	ProfileService prs= new ProfileService();
   
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Profile> getAllProfile(){
		return prs.getAllProfiles();
	}
	
	@GET
	@Path("/{profileId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Profile getProfile(@PathParam("profileId") long profileId){
		return prs.getProfile(profileId);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Profile addProfile(Profile profile){
		return prs.addProfile(profile);
	}
	
	@PUT
	@Path("/{profileId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Profile getProfile(@PathParam("profileId") long profileId,Profile profile){
		profile.setId(profileId);
		return prs.updateProfile(profile);
		
	}
}

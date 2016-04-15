package org.prashanth.SUNDEVIL.Messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.prashanth.SUNDEVIL.Messenger.Model.Message;
import org.prashanth.SUNDEVIL.Messenger.Model.Profile;
import org.prashanth.SUNDEVIL.Messenger.database.DatabaseClass;

public class ProfileService {
  
	private Map<Long, Profile> profiles = DatabaseClass.getProfiles();
    public ProfileService(){
    	profiles.put(1L, new Profile(1,"Prashanth Artal","Prashanth","Artal"));
    	profiles.put(2L, new Profile(2,"Niranjan Artal","Niranjan","Artal"));
    }
    public List<Profile> getAllProfiles(){
   		return new ArrayList<Profile>(profiles.values());
    	
    }
    
    public Profile getProfile(long profileId){
    	return profiles.get(profileId);
    }
    
    public Profile addProfile(Profile profile){
    	profile.setId(profiles.size()+1);
    	profiles.put(profile.getId(), profile);
		return profile;
    }
    
    public Profile updateProfile(Profile profile){
    	if (profile.getId() <= 0) {
			return null;
		}
    	profiles.put(profile.getId(), profile);
		return profile;
    }
}

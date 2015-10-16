package com.vish.Ubuntu.bo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

@Component
public class Locations  implements ApplicationListener<ContextRefreshedEvent>{

	public static final Map<String, String> locations = new HashMap<String, String>();
	public static final Multimap<String, Donor> donors =  ArrayListMultimap.create();
	
	public static void setupLocations(){
		locations.put("022","Mumbai");
		locations.put("044","Chennai");
		locations.put("080","Bangalore");
	}
	
	public static void addLocation(String locID,String locationName){
		locations.put(locID,locationName);
	}
	
	public static String getLocation(String locID){
		return locations.get(locID);
	}
	
	
	public static void setupDonors(){
		Donor donor0 = new Donor("John", "0", "080", "address0", 9123456790l,"A+","John@gmail.com");
		Donor donor1 = new Donor("Jack", "1", "080", "address1", 9123456791l,"AB+","Jack@gmail.com");
		Donor donor2 = new Donor("Tony", "2", "080", "address2", 9123456792l,"B+","Tony@gmail.com");
		Donor donor3 = new Donor("Jim", "3", "080", "address3", 9123456793l,"A-","Jim@gmail.com");
		Donor donor4 = new Donor("Joe", "4", "080", "address4", 9123456794l,"O+","Joe@gmail.com");
		Donor donor5 = new Donor("Kin", "5", "022", "address15", 9123456795l,"O-","Kin@gmail.com");
		Donor donor6 = new Donor("Jenny", "6", "022", "address6", 9123456796l,"B+","Jenny@gmail.com");
		
		donors.put(donor0.getLocID(), donor0);
		donors.put(donor1.getLocID(), donor1);
		donors.put(donor2.getLocID(), donor2);
		donors.put(donor3.getLocID(), donor3);
		donors.put(donor4.getLocID(), donor4);
		donors.put(donor5.getLocID(), donor5);
		donors.put(donor6.getLocID(), donor6);
		
	}
	
	
	public static void addDonor(Donor donor){
		donors.put(donor.getLocID(),donor);
	}
	
	public static Collection<Donor> getDonors(String locaID){
		return donors.get(locaID);
	}
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		Locations.setupLocations();		
		Locations.setupDonors();
	}
	
}

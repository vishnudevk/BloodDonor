package com.vish.Ubuntu.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.vish.Ubuntu.bo.Donor;
import com.vish.Ubuntu.bo.Locations;

@Controller
@EnableWebMvc
public class HomeController {

	@RequestMapping(value="/getDonor.do") 
	public @ResponseBody List<Donor> getDonor(HttpServletRequest request, HttpServletResponse response) throws IOException{
		response.setContentType("application/json");
		String locationID = request.getParameter("locationID");
		if(locationID !=null){
			List<Donor> donors = (List<Donor>) Locations.getDonors(locationID);
			return donors;
		};
		return null;
	}
	
	@RequestMapping(value="/submitDonor.do") 
	public @ResponseBody List<Donor> submitDonor(HttpServletRequest request, HttpServletResponse response ,@RequestBody Donor json) throws IOException{
		Locations.addDonor(json);
		return null;
	}
}

package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.cg.entity.Country;
import com.cg.service.ICountryService;
@RestController
public class CountryController {
	@Autowired
	ICountryService countryService;
	@RequestMapping(value="/countries/search/{id}",method=RequestMethod.GET,headers="Accept=application/json")
	public  Country getCountry(@PathVariable int id){
		return countryService.searchCountry(id);
	}
	@RequestMapping(value="/countries",method=RequestMethod.GET,headers="Accept=application/json")
	public  List<Country> getAllCountries(Model model){
		return countryService.getAllCountries();
	}
	
	

}

package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ICountryDao;
import com.cg.entity.Country;

@Service
public class ICountryServiceImpl implements ICountryService{

	@Autowired
	ICountryDao countryDao;
	@Override
	public List<Country> getAllCountries() {
		// TODO Auto-generated method stub
		return countryDao.getAllCountries();
	}

	@Override
	public void addCountry(Country country) {
		countryDao.addCountry(country);
		
	}

	@Override
	public Country deleteCountry(int id) {
		// TODO Auto-generated method stub
		return countryDao.deleteCountry(id);
	}

	@Override
	public Country searchCountry(int id) {
		// TODO Auto-generated method stub
		return countryDao.searchCountry(id);
	}
	

}

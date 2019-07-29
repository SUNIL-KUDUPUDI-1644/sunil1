package com.cg.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.db.CountryDB;
import com.cg.entity.Country;
@Repository
public class ICountryDaoImpl implements ICountryDao{

	@Override
	public List<Country> getAllCountries() {
		// TODO Auto-generated method stub
		return CountryDB.getCountryList();
	}

	@Override
	public void addCountry(Country country) {
		CountryDB.getCountryList().add(country);
		
	}

	@Override
	public Country deleteCountry(int id) {
		// TODO Auto-generated method stub
		return CountryDB.getCountryList().remove(id);
	}

	@Override
	public Country searchCountry(int id) {
		// TODO Auto-generated method stub
		return CountryDB.getCountryList().stream().filter(c->Integer.parseInt(c.getCountryId())==id).findFirst().get();
	}
	

}

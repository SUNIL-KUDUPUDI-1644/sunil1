package com.cg.db;

import java.util.ArrayList;

import com.cg.entity.Country;

public class CountryDB {
	private static ArrayList<Country> countryList = new ArrayList<Country>();
	static{
		
		countryList.add(new Country("1001","wefwef","43554"));
		countryList.add(new Country("1002","sdfsd","45354"));
		countryList.add(new Country("1003","wefwfgref","445354"));
		countryList.add(new Country("1004","wefwergf","4524"));
	}
	public static ArrayList<Country> getCountryList() {
		return countryList;
	}
	public static void setCountryList(ArrayList<Country> countryList) {
		CountryDB.countryList = countryList;
	}


}

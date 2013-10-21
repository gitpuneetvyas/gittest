/**
 * 
 */
package com.csc.test;

/**
 * @author pvyas
 *
 */
public enum Country {
	India ("INDIA"),
	Australia("AUSTRALIA"),
	Pakistan("PAKISTAN");
	
	 private String countryName;
	 /**
	 * @return the countryName
	 */
	 
	 Country(String countryName){
	       this.countryName = countryName;
	    }
	public String getCountryName() {
		return countryName;
	}
}

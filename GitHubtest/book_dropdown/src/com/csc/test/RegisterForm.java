package com.csc.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.component.html.HtmlSelectOneMenu;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

import sun.reflect.ReflectionFactory.GetReflectionFactoryAction;

import com.csc.test.Country;

public class RegisterForm {
	private String streetAddress;
	private String city;
	private String state;
	private String country;
	private String myCity;
	private HtmlOutputText text;
	private String selectedValue;
	//myCity


	public String getSelectedValue() {
		return selectedValue;
	}

	public void setSelectedValue(String selectedValue) {
		this.selectedValue = selectedValue;
	}

	public HtmlOutputText getText() {
		return text;
	}

	public void setText(HtmlOutputText text) {
		this.text = text;
	}

	public String getMyCity() {
		return myCity;
	}

	public void setMyCity(String myCity) {
		this.myCity = myCity;
	}

	private static final String US = "United States";
	private static final String CANADA = "Canada";
	private static final String[] COUNTRY_NAMES = { US, CANADA };
	private static ArrayList countryItems = null;
	private static ArrayList cityItems = null;

	public String getCityColumn() {
		return cityColumn;
	}

	public void setCityColumn(String cityColumn) {
		this.cityColumn = cityColumn;
	}

	public HtmlInputText cityText;
	public HtmlInputText getCityText() {
		return cityText;
	}

	public void setCityText(HtmlInputText cityText) {
		this.cityText = cityText;
	}

	public String cityColumn;

	// PROPERTY: countryNames
	public Collection getCountryNames() {
		if (countryItems == null) {
			countryItems = new ArrayList();

			// List<SelectItem> CountryList = new ArrayList();
			for (Country country : Country.values()) {
				countryItems.add(new SelectItem(country.getCountryName()));
			}

			/*
			 * for (int i = 0; i < COUNTRY_NAMES.length; ++i) {
			 * countryItems.add(new SelectItem(COUNTRY_NAMES[i])); }
			 */
		}
		return countryItems;
	}

	// PROPERTY: cityNames

	// PROPERTY: countryNames
	public Collection getcityNames() {
		
		
		if (cityItems == null) {
			cityItems = new ArrayList();

			cityItems.add(new SelectItem(
					"Selected Contry wise states will apear here"));
			// List<SelectItem> CountryList = new ArrayList();
			/*
			 * for(Country country :Country.values()){ countryItems.add(new
			 * SelectItem(country.getCountryName())); }
			 */

			System.out.println("in null  check");
			/*
			 * for (int i = 0; i < COUNTRY_NAMES.length; ++i) {
			 * countryItems.add(new SelectItem(COUNTRY_NAMES[i])); }
			 */
		}

		return cityItems;
	}

	// PROPERTY: streetAddress
	public void setStreetAddress(String newValue) {
		streetAddress = newValue;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	// PROPERTY: city
	public void setCity(String newValue) {
		city = newValue;
	}

	public String getCity() {
		return city;
	}

	// PROPERTY: state
	public void setState(String newValue) {
		state = newValue;
	}

	public String getState() {
		return state;
	}

	// PROPERTY: country
	public void setCountry(String newValue) {
		country = newValue;
	}

	public String getCountry() {
		return country;
	}

	public void countryChanged(ValueChangeEvent event) {
		System.out.println("value changes");

		FacesContext context = FacesContext.getCurrentInstance();

		String valueSelected = (String) event.getNewValue();

		HtmlSelectOneMenu com = (HtmlSelectOneMenu) event.getComponent();
		
		//event.//

		// HtmlSelectOneMenu test=( HtmlSelectOneMenu)com.getChildren().get(0);

		// System.out.println("test"+test.COMPONENT_TYPE);

		// System.out.println("transfer"+com.getValue());

		// System.out.println("html component type is "+com.COMPONENT_TYPE);
		System.out.println("value is" + valueSelected);

		if (valueSelected.equals("INDIA")) {
			this.cityItems.clear();
			this.cityItems.add(new SelectItem("MP"));
			this.cityItems.add(new SelectItem("RJ"));

		}
		if (valueSelected.equals("AUSTRALIA")) {
			this.cityItems.clear();
			this.cityItems.add(new SelectItem("Ashmore and Cartier Islands"));
			this.cityItems
					.add(new SelectItem("Australian Antarctic Territory"));

		}
		if (valueSelected.equals("PAKISTAN")) {
			this.cityItems.clear();
			this.cityItems.add(new SelectItem("Bahawalpur"));
			this.cityItems.add(new SelectItem("Karachi"));
		}

		/*
		 * if(US.equals((String) event.getNewValue()))
		 * context.getViewRoot().setLocale(Locale.US); else
		 * context.getViewRoot().setLocale(Locale.CANADA);
		 */

		SelectItem i = (SelectItem) this.cityItems.get(0);
		
		System.out.println("select item value is from country changed"+i.getValue());
		
	//	this.setMyCity((String)i.getValue());
		//System.out.println("after city changed"+this.getMyCity());
		//HtmlInputText test=new HtmlInputText();
	//	test.setId(id)
		//test.setId("mytext");
		
		
		
		
		//test.setValue(i.getValue());
		//this.setText(///test)
		//this.setText(test);
		//text.saveState(context);
		//text.setId("mytext");
		//text.setValue(i.getValue());
		//text.se
		//text.saveState(context);
		
		//System.out.println("html input text value is"+this.getText().getValue());
		
		//System.out.println("print" + i.getValue());
		
	//	this.cityText= (HtmlInputText) i.getValue();
		
		//String newtest=(String)i.getValue();
		//cityText.setSubmittedValue(i.getValue());
		
	//	System.out.println("html value"+i.getValue());
		
		//cityText.setValue(i.getValue());
		
	//	HtmlInputText in=new HtmlInputText();
	//	in.setSubmittedValue()
		// this.city=(String)i.getValue();
		// context.setViewRoot(null);
	//	System.out.println("updated" + this.cityText.getSubmittedValue());
		
		this.setSelectedValue((String)i.getValue());
		
		System.out.println("cityChanged "+this.getSelectedValue());
	}

	public void cityChanged(ValueChangeEvent event) {
		
		System.out.println("value changes in city is as per new html component" + event.getNewValue());

//		this.city = (String) event.getNewValue();// Value();

		FacesContext context = FacesContext.getCurrentInstance();
//		String valueSelected = (String) event.getNewValue();
	//	System.out.println("value is" + valueSelected);
	
		//cityText.setSubmittedValue(event.getNewValue());
		//cityText.setValue(event.getNewValue());
		/*
		 * if(US.equals((String) event.getNewValue()))
		 * context.getViewRoot().setLocale(Locale.US); else
		 * context.getViewRoot().setLocale(Locale.CANADA);
		 */
		
		/*this.setMyCity((String)event.getNewValue());
		
		System.out.println("after city changed"+this.getMyCity());*/
		
		//HtmlInputText test=new HtmlInputText();
		//	test.setId(id)
			//test.setId("mytext");
			
			//test.setValue(event.getNewValue());
			//this.setText(///test)
			//this.setText(test);
		//text.setId("mytext");
		//text.setValue(event.getNewValue());
		//text.saveState(context);
			//System.out.println("html input text value is from city"+this.getText().getValue());
		System.out.println("OLD VAlue "+event.getOldValue());
		this.setSelectedValue((String)event.getNewValue());
			
			System.out.println("cityChanged "+this.getSelectedValue());
		
	}

}

package com.example.helloworld.model;

public class Input {

	private String Stringa;
	
	private String Stringb;

	

	public Input() {
		super();
		Stringa = "";
		Stringb = "";
 
	}

	public String getStringa() {
		return Stringa;
	}

	public void setStringa(String stringa) {
		Stringa = stringa;
	}

	public String getStringb() {
		return Stringb;
	}

	public void setStringb(String stringb) {
		Stringb = stringb;
	}

	/**
	 * @param stringa
	 * @param stringb
	 */
	public Input(String stringa, String stringb) {
		super();
		Stringa = stringa;
		Stringb = stringb;
	}


   
	

}

/**
 * 
 */
package com.example.helloworld.model;


 
public class Output {

    String sfirst_name;
    String slast_name;
    
    
	
	public Output() {
		super();
		this.sfirst_name = "";
		this.slast_name = "";
	}


	public Output(String sfirst_name, String slast_name) {
		super();
		this.sfirst_name = sfirst_name;
		this.slast_name = slast_name;
	}


	public String getSfirst_name() {
		return sfirst_name;
	}


	public void setSfirst_name(String sfirst_name) {
		this.sfirst_name = sfirst_name;
	}


	public String getSlast_name() {
		return slast_name;
	}


	public void setSlast_name(String slast_name) {
		this.slast_name = slast_name;
	}


}

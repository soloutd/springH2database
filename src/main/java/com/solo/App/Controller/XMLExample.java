package com.solo.App.Controller;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement
public class XMLExample implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4159413241383976347L;

	 @JacksonXmlProperty(localName = "name")
	 @JacksonXmlElementWrapper(useWrapping = false)
	 private String name;
	 
	 private int id;
	 
	// @JacksonXmlProperty(localName = "job title")
	 private String jobTitle;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	 
	 
	
	 
	
}

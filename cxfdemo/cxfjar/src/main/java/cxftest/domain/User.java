package cxftest.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "user")
public class User {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}

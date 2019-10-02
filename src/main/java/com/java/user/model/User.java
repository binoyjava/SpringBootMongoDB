package com.java.user.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {

    @Id
    private long id;

    //@Indexed(unique = false)
    private String uName;
    private String password;
    private String token;
    private boolean active;

    public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", uName=" + uName + ", password=" + password + ", token=" + token + ", active="
				+ active + "]";
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

   
}
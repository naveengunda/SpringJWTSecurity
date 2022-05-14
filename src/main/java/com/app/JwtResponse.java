package com.app;

import java.io.Serializable;

public class JwtResponse implements Serializable {

	private static final long serialVersionUID = -8559509154181939849L;
	private final String jwttoken;

	public JwtResponse(String jwttoken) {
		this.jwttoken = jwttoken;
	}

	public String getToken() {
		return this.jwttoken;
	}
}

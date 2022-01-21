package com.baranalhas.enumqualifier;

import javax.enterprise.inject.Default;

@Default
public class DefaultDatabase implements IDatabaseHelper {

	@Override
	public String DatabaseHelper(String data) {
		return "Default Database MySQL";
	}

}

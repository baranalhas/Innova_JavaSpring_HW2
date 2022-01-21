package com.baranalhas.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Postgresql implements IDatabaseHelper {
	@Override
	public String databaseHelper(String data) {
		return "Database: PostgreSQL";
	}

}

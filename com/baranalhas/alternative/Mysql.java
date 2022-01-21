package com.baranalhas.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Mysql implements IDatabaseHelper {

	@Override
	public String databaseHelper(String data) {
		return "Database: MySQL";
	}

}

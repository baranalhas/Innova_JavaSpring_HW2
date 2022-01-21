package com.baranalhas.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class MariaDb implements IDatabaseHelper {
	@Override
	public String databaseHelper(String data) {
		return "Database: MariaDb";
	}
}

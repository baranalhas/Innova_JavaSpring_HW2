package com.baranalhas.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Mssql implements IDatabaseHelper {
	@Override
	public String databaseHelper(String data) {
		return "Database: MsSQL";
	}
}

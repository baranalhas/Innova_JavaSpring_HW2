package com.baranalhas.qualifier;

@QualifierCokluSecim
public class Mssql implements IDatabaseHelper {
	@Override
	public String databaseSelection(String data) {
		return "Veritabanı : Mssql";
	}
}

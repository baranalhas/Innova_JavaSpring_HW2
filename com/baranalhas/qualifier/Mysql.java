package com.baranalhas.qualifier;

@QualifierCokluSecim
public class Mysql implements IDatabaseHelper {
	@Override
	public String databaseSelection(String data) {
		return "Veritabanı : Mysql";
	}
}

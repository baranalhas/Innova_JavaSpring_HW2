package com.baranalhas.enumqualifier;

@EQualifier(EDatabaseHelper.Postgresql)
public class Postgresql implements IDatabaseHelper {

	@Override
	public String DatabaseHelper(String data) {
		return "Opsiyonel Database PostgreSQL";
	}

}
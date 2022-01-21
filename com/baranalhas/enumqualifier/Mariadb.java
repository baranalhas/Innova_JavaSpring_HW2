package com.baranalhas.enumqualifier;

@EQualifier(EDatabaseHelper.Mariadb)
public class Mariadb implements IDatabaseHelper {

	@Override
	public String DatabaseHelper(String data) {
		return "Opsiyonel Database MariaDb";
	}

}

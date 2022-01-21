package com.baranalhas.enumqualifier;

@EQualifier(EDatabaseHelper.Mssql)
public class Mssql implements IDatabaseHelper {

	@Override
	public String DatabaseHelper(String data) {
		return "Opsiyonel Database MsSQL";
	}

}
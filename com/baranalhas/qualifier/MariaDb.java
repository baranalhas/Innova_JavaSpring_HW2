package com.baranalhas.qualifier;

@QualifierCokluSecim
public class MariaDb implements IDatabaseHelper {
	@Override
	public String databaseSelection(String data) {
		return "Veritaban─▒ : MariaDb";
	}
}

package com.baranalhas.qualifier;

import javax.enterprise.inject.Default;

@Default
public class Postgresql implements IDatabaseHelper {
	@Override
	public String databaseSelection(String data) {
		return "Veritabanı : PostreSQL";
	}
}

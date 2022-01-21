package com.baranalhas.alternative;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "alternativeCDI")
@ApplicationScoped

public class DatabaseManager {

	@Inject
	private IDatabaseHelper iDatabaseHelper;

	public String getDatabaseHelper() {
		return iDatabaseHelper.databaseHelper("Veritabanları: ");
	}
}

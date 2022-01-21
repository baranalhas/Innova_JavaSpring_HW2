package com.baranalhas.enumqualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "multipleQualifier")
@ApplicationScoped
public class QualifierManager {

	// default
	/*
	 * @Inject IDatabaseHelper iDatabaseHelper;
	 */

	@Inject
	@EQualifier(EDatabaseHelper.Postgresql)
	IDatabaseHelper iDatabaseHelper;

	public String getiDatabaseHelper() {
		return iDatabaseHelper.DatabaseHelper("Seçim");
	}
}

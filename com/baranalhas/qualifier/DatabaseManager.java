package com.baranalhas.qualifier;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("qualiferCDI")
@ApplicationScoped
public class DatabaseManager implements Serializable {
	private static final long serialVersionUID = -4021813297332059504L;
	@Inject
	private IDatabaseHelper databaseHelper;

	public String getDatabase() {
		return databaseHelper.databaseSelection("Veritabanı --");
	}

}

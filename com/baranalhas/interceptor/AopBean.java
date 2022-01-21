package com.baranalhas.interceptor;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("interceporAOP")
@ApplicationScoped
public class AopBean implements Serializable {
	private static final long serialVersionUID = -6791614356741730218L;
	@Inject
	private Login login;

	public String getLogin() {
		return login.isLogin("not know");
	}

}

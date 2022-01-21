package com.baranalhas.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@YolKesiciInterface
@Interceptor
public class YolKesiciMethod {

	@AroundInvoke
	public Object aroundInvoke(InvocationContext ic) throws Exception {
		System.out.println("Önceki durum" + ic.getMethod().getName());
		boolean isLogin = false;
		Object isContinue = null;
		if (isLogin) {
			System.out.println("öncelikle üye olun");
			return null;
		} else {
			try {
				isContinue = ic.proceed();
				System.out.println("Login olduktan sonra: Yönlendirme yapılıyor....");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return isContinue;
	}

}

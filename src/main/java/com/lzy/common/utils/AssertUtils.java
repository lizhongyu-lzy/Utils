package com.lzy.common.utils;

public class AssertUtils {

	public static void isNotNull(String exp,String message) {
		if(null == exp || exp.trim().length() <= 0 ) {
			throw new CMSRuntimethrow(message);
		}
	}
	public static void isTrue(boolean exp,String message) {
		if(!exp) {
			throw new CMSRuntimethrow(message);
		}
	}
	public static void isStirngLength(String exp,String message) {
		if(exp.length()<=6 && exp.length() >=12) {
			throw new CMSRuntimethrow(message);
		}
	}
 }

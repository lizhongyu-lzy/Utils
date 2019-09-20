package com.lzy.common.utils;

import org.apache.commons.codec.digest.DigestUtils;

public class Md5Utils {

	private static  String s = "lzy123";
	public static String md5(String password) {
		
		return DigestUtils.md5Hex(password + s);
	}
}

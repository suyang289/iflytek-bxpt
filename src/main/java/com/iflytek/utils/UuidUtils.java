package com.iflytek.utils;

import java.util.UUID;

public class UuidUtils {
	
	/**
	 * ????32λ??uuid
	 * @return
	 */
	public static String getUUID32(){
		return getUUID().replace("-", "").toLowerCase();
	}
	
	/**
	 * ????36λ??uuid
	 * @return
	 */
	public static String getUUID() {
		return UUID.randomUUID().toString();
	}
	
	// ????????
	public static void main(String[] args) {
		System.out.println(getUUID32());
	}
	
}

package com.ssm.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {
	/**
	 * MD5鍔犲瘑绠楁硶
	 * @param src
	 * @return
	 */
	public static String md5(String src) {
		StringBuffer sb = new StringBuffer();
		char[] chars = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
						 'A', 'B', 'C', 'D', 'E', 'F' };
		byte[] bytes = src.getBytes();
		try {
			MessageDigest digest = MessageDigest.getInstance("MD5");
			byte[] target = digest.digest(bytes);
			for (byte b : target) {
				sb.append(chars[(b >> 4) & 0x0F]);
				sb.append(chars[b & 0x0F]);
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
}

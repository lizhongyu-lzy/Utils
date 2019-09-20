/**   
 * Copyright © 2019 哈喇子. All rights reserved.
 * 
 * @Title: IOUtils.java 
 * @Prject: lizhongyu_cms
 * @Package: com.lzy.common.utils 
 * @Description: TODO
 * @author: 哈喇子. 
 * @date: 2019年8月26日 下午7:41:08 
 * @version: V1.0   
 */

package com.lzy.common.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/** 
 * @ClassName: IOUtils 
 * @Description: TODO
 * @author: 哈喇子.
 * @date: 2019年7月26日 下午7:41:08  
 */
public class IOUtils {
	
	public static StringBuffer IO(File file) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
		
		StringBuffer sb = new StringBuffer();
		
		String str = null;
		while ((str = br.readLine()) != null) {
			sb.append(str);
			
		}
		return sb;
	}

}

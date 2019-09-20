/**   
 * Copyright © 2019 哈喇子. All rights reserved.
 * 
 * @Title: Utils.java 
 * @Prject: lzy_common
 * @Package: com.lzy.common.utils 
 * @Description: TODO
 * @author: 哈喇子. 
 * @date: 2019年9月20日 上午8:12:12 
 * @version: V1.0   
 */

package com.lzy.common.utils;

/** 
 * @ClassName: Utils 
 * @Description: TODO
 * @author: 哈喇子.
 * @date: 2019年9月20日 上午8:12:12  
 */
public class FileUtils {
	/*
	* 方法1：给定一个文件名，返回该文件名的扩展名，
	* 例如“aaa.jpg”，返回“.jpg”(10分)
	*/
	public static String getExtendName(String fileName){
		String newFileName = fileName.substring(fileName.lastIndexOf("."));
		return newFileName;
	}

}

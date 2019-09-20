/**   
 * Copyright © 2019 哈喇子. All rights reserved.
 * 
 * @Title: StreamUtils.java 
 * @Prject: lzy_common
 * @Package: com.lzy.common.utils 
 * @Description: TODO
 * @author: 哈喇子. 
 * @date: 2019年9月20日 上午8:14:36 
 * @version: V1.0   
 */

package com.lzy.common.utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @ClassName: StreamUtils
 * @Description: TODO
 * @author: 哈喇子.
 * @date: 2019年9月20日 上午8:14:36
 */
public class StreamUtils {
	/*
	 * 方法1：批量关闭流，参数能传入无限个。(10分)
	 * 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭，并且参数个数不限。
	 */
	public static void closeAll(BufferedInputStream bis) throws IOException{
		if(bis != null) {
			bis.close();
		}
	
	}

	/*
	 * 方法2：传入一个文本文件对象，默认为UTF-8编码，
	 * 返回该文件内容(10分)，要求方法内部调用上面第1个方法关闭流(5分)
	 */
	public static String readTextFile(InputStream src) throws IOException {
		StringBuffer sb = new StringBuffer();
		BufferedInputStream bis = new BufferedInputStream(src);
	
		byte[] b = new byte[1024];
		int read = bis.read(b);
		while(read != 0 ) {
			sb.append(b.toString());
		}
		closeAll(bis);
		
		return sb.toString();
		// TODO 实现代码
	}

	/*
	 * 方法3：传入文本文件对象，返回该文件内容(10分)，并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，记住了吗？少年…
	 */
	public static String readTextFile(File txtFile) throws FileNotFoundException, IOException {
		return readTextFile(new FileInputStream(txtFile));
	}

}

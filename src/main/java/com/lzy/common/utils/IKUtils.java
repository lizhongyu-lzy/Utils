/**   
 * Copyright © 2019 哈喇子. All rights reserved.
 * 
 * @Title: IKUtils.java 
 * @Prject: lizhongyu_cms
 * @Package: com.lizhongu.cms.utils 
 * @Description: TODO
 * @author: 哈喇子. 
 * @date: 2019年8月21日 下午2:26:49 
 * @version: V1.0   
 */

package com.lzy.common.utils;


import java.util.List;
import java.util.Map.Entry;


/** 
 * @ClassName: IKUtils 
 * @Description: TODO
 * @author: 哈喇子.
 * @date: 2019年8月21日 下午2:26:49  
 */
public class IKUtils {

	public static String IK(List<Entry<String, Integer>> list) {
		String str = null;
		 if(list!=null && list.size()>0) {
         	if(list.size()>3) {
         		str=list.get(0).getKey()+","+list.get(1).getKey()+","+list.get(2).getKey();
         	}else {
         		for(int j=0;j<list.size();j++) {
         			str+=list.get(j).getKey();
         			if(list.size()!=j) {
         				str+=",";
         			}
         		}
         	}
         }
		 return str;
	}
	
}

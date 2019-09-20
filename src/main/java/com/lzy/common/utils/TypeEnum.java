/**   
 * Copyright © 2019 哈喇子. All rights reserved.
 * 
 * @Title: TypeEnum.java 
 * @Prject: lizhongyu_cms
 * @Package: com.lzy.common.utils 
 * @Description: TODO
 * @author: 哈喇子. 
 * @date: 2019年7月31日 上午8:37:38 
 * @version: V1.0   
 */

package com.lzy.common.utils;

/** 
 * @ClassName: TypeEnum 
 * @Description: TODO
 * @author: 哈喇子.
 * @date: 2019年7月31日 上午8:37:38  
 */
public enum TypeEnum {
	HTML("html","文字形式发布"),
	IMAGE("image","不是文本内容而是图片");
	private String code;
	private String value;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	private TypeEnum(String code, String value) {
		this.code = code;
		this.value = value;
	}
	public static void main(String[] args) {
		System.out.println(TypeEnum.IMAGE.getCode());
	}
	
	
}

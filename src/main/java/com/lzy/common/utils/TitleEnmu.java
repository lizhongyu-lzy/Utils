/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: TitleEnmu.java 
 * @Prject: lizhongyu_cms
 * @Package: com.lzy.common.utils 
 * @Description: TODO
 * @author: Administrator   
 * @date: 2019年7月30日 上午9:21:20 
 * @version: V1.0   
 */
package com.lzy.common.utils;

/** 
 * @ClassName: TitleEnmu 
 * @Description: TODO
 * @author: 哈喇子.
 * @date: 2019年7月30日 上午9:22:54  
 */
public enum TitleEnmu {
	COLOR_RED("color:red","标红"),
	FONTWEIGHT("font-weight:800","加粗"),
	FONTSTUYLE("font-style:italic","斜体"),
	STYLE_NONE("","无样式");
	private String code;
	private String value;
	private TitleEnmu(String code, String value) {
		this.code = code;
		this.value = value;
	}
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
	
}

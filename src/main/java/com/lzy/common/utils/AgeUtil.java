package com.lzy.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/** 
 * @ClassName: AgeUtil 
 * @Description: 计算年龄
 * @author: 哈喇子.
 * @date: 2019年9月19日 下午4:47:06  
 */
public class AgeUtil {
	public static  Date parse(String strDate) throws java.text.ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.parse(strDate);
    }

	public static int age(Date birthDay) throws ParseException {
		Calendar cal = Calendar.getInstance();
		if (birthDay.after(cal.getTime())) { // 出生日期晚于当前时间，无法计算
//			System.out.println("出生日期超过当前日期");
			
			throw new IllegalArgumentException("出生日期超过当前日期"); // 抛出异常
		}
		int yearNow = cal.get(Calendar.YEAR); // 当前年份
		int monthNow = cal.get(Calendar.MONTH); // 当前月份
		int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH); // 当前日期
		cal.setTime(birthDay);
		int yearBirth = cal.get(Calendar.YEAR);
		int monthBirth = cal.get(Calendar.MONTH);
		int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);
		int age = yearNow - yearBirth; // 计算整岁数
		if (monthNow <= monthBirth) {
			if (monthNow == monthBirth) {
				if (dayOfMonthNow < dayOfMonthBirth)
					age--;// 当前日期在生日之前，年龄减一
			} else {
				age--;// 当前月份在生日之前，年龄减一
			}
		}
		return age;
	}
	
	public static void main(String[] args) {
		int age;
		try {
			age = age(parse("2020-02-23"));
			System.out.println(age);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
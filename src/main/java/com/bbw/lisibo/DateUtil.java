package com.bbw.lisibo;

import java.util.Calendar;
import java.util.Date;

/**
 * @author 李思博
 *
 * 2019年9月6日
 */
public class DateUtil {
	/**
	 * 计算年龄
	 */
	public int getAge(Date birthday){
		Calendar instance=Calendar.getInstance();
		instance.setTime(birthday);
		
		//得到出生的年
		int birthYear = instance.get(Calendar.YEAR);
		int birthMonth = instance.get(Calendar.MONTH);
		int birthDate = instance.get(Calendar.DAY_OF_MONTH);
		
		//获取当年的年月日
		instance.setTime(new Date());
		int currentYear = instance.get(Calendar.YEAR);
		int currenthMonth = instance.get(Calendar.MONTH);
		int currentDate = instance.get(Calendar.DAY_OF_MONTH);
		
		int age=currentYear-birthYear;
		if(currenthMonth<birthMonth){
			age=age-1;
		}else if(currenthMonth==birthMonth && currentDate<birthDate){
			age=age-1;
		}
		return age;
	}
}

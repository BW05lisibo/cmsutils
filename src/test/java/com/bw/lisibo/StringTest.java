package com.bw.lisibo;

import org.junit.Test;

import com.bbw.lisibo.StringUtils;

/**
 * @author 李思博
 *
 * 2019年9月5日
 */
public class StringTest {
	@Test
	public void isEmpty(){
		boolean b = StringUtils.isEmpty("");
		System.out.println("是否为空："+b);
	}
	
	@Test
	public void isHasValue(){
		boolean b = StringUtils.isHasValue("11");
		System.out.println("是否有值："+b);
	}
	@Test
	public void iphone(){
		boolean b = StringUtils.iphone("15935678952");
		System.out.println("是否是手机号码："+b);
	}
	@Test
	public void email(){
		boolean b = StringUtils.email("918934423@qq.com");
		System.out.println("是否是邮箱号："+b);
	}
	@Test
	public void isLetter(){
		boolean b = StringUtils.isLetter("afhdsHHHDSH");
		System.out.println("是否全为字母："+b);
	}
	@Test
	public void randomStr(){
		String str = StringUtils.randomStr(6);
		System.out.println("随机英文字符串："+str);
	}
	@Test
	public void randomStrNum(){
		String str = StringUtils.randomStrNum(6);
		System.out.println("随机英文字母和中文字符串："+str);
	}
	@Test
	public void grtRandonCnStr(){
		String str = StringUtils.grtRandonCnStr(5);
		System.out.println("随机中文字符串："+str);
	}
}

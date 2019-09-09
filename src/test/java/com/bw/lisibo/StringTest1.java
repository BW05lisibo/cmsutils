package com.bw.lisibo;

import org.junit.Test;

import com.bbw.lisibo.StringUtils;

/**
 * @author 李思博
 *
 * 2019年9月9日
 */
public class StringTest1 {
	//测试文本toHtml()方法
	@Test
	public void toHtml(){
		String string = StringUtils.toHtml("hsfbjifsdsgkjh");
		System.out.println(string);
	}
	//测试手机号是否正确
	@Test
	public void isPhone(){
		boolean b = StringUtils.iphone("13716196521");
		boolean b1 = StringUtils.iphone("137161965212");
		System.out.println(b);
		System.out.println(b1);
	}
	//测试email文件输入是否正确
	@Test
	public void isEmail(){
		boolean b = StringUtils.email("918934423@qq.com");
		boolean b1 = StringUtils.iphone("137161965212");
		System.out.println(b);
		System.out.println(b1);
	}
}

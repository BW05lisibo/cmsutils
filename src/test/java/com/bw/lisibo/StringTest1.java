package com.bw.lisibo;

import org.junit.Test;

import com.bbw.lisibo.StringUtils;

/**
 * @author 李思博
 *
 * 2019年9月9日
 */
public class StringTest1 {
	@Test
	public void toHtml(){
		String string = StringUtils.toHtml1("hdabghhfjdhgjk");
		System.out.println(string);
	}
	@Test
	public void isPhone(){
		boolean b = StringUtils.iphone("13716196521");
		boolean b1 = StringUtils.iphone("137161965212");
		System.out.println(b);
		System.out.println(b1);
	}
	@Test
	public void isEmail(){
		boolean b = StringUtils.email("918934423@qq.com");
		boolean b1 = StringUtils.iphone("137161965212");
		System.out.println(b);
		System.out.println(b1);
	}
}

package com.bw.lisibo;

import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.junit.Test;

import com.bbw.lisibo.FileUtil;
import com.bbw.lisibo.StringUtils;

/**
 * @author 李思博
 *
 * 2019年9月15日
 */

public class TestUtils {

	/*
	 * String str="asd爱上的我去\\\r大神发\n大神夫人为ver饿的我\n"; String html =
	 * StringUtils.toHtml(str); System.out.println(html);
	 */
	@Test
	public void tohtml() {
		String str = "稍等哈\r\n和健康\n大家哈\r和对啊撒\n";
		String html = StringUtils.toHtml(str);
		System.out.println();
		System.out.println(html);
	}

	@Test
	public void testFileToBean() throws NoSuchMethodException,
			SecurityException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, IOException {
		String fileNameString = "D:\\xiaoyi\\lisibo.common\\src\\main\\resources\\reginfo";
		List list = FileUtil.fileToBean(fileNameString, RegisterInfo.class
				.getConstructor(String.class, String.class, String.class,
						String.class, String.class, String.class, String.class,
						String.class, String.class, String.class

				));

		System.out.println("list is " + list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("list is " + list.get(i));
		}

	}
	

}

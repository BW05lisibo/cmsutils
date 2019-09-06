package com.bbw.lisibo;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 李思博
 *
 * 2019年9月5日
 */
public class StringUtils {
	/**
	 *   判空
	 */
	public static boolean isEmpty(String str){
		if(null==str || "".equals(str.trim())){
			return true;
		}
		return false;
	}
	
	/**
	 * 是否有值
	 */
	public static boolean isHasValue(String str){
		if(null!=str && !"".equals(str.trim())){
			return true;
		}
		return false;
	}
	
	/**
	 * 验证手机号码
	 */
	public static boolean iphone(String str){
		String pattern="^(1[0-9][0-9])\\d{8}$";
		Pattern compile = Pattern.compile(pattern);
		Matcher matcher = compile.matcher(str);
		boolean b = matcher.matches();
		return b;
	}
	
	/**
	 * 验证邮箱
	 */
	public static boolean email(String str){
		String pattern="^\\d+@\\w+\\.\\w+$";
		Pattern compile = Pattern.compile(pattern);
		Matcher matcher = compile.matcher(str);
		boolean b = matcher.matches();
		return b;
	}
	
	/**
	 * 验证全为字母
	 */
	public static boolean isLetter(String str){
		String pattern="[a-zA-Z]+";
		Pattern compile = Pattern.compile(pattern);
		Matcher matcher = compile.matcher(str);
		boolean b = matcher.matches();
		return b;
	}
	
	/**
	 * 获取n位随机英文字符串
	 */
	public static String randomStr(int n){
		if(n<=0){
			return "";
		}else{
			StringBuilder sb=new StringBuilder();
			Random random=new Random();
			for (int i = 0; i < n; i++) {
				int t='A'+random.nextInt(26);
				sb.append((char)t);
			}
			return sb.toString();
		}
		
	}
	
	/**
	 *获取n位随机英文和数字字符串
	 */
	public static String randomStrNum(int n){
		char chars []={'0','1','2','3','4','5','6','7','8','9'
				,'A','B','C','D','E','F','G','H','I','J','K'
				,'L','M','N','O','P','Q','L','S','T','U','V'
				,'W','X','Y','Z'};
		Random random=new Random();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<n;i++){
			sb.append(chars[random.nextInt(chars.length)]);
		}
		return sb.toString();
	}
	/**
	 * 获取n个随机中文字符串
	 */
	public static String grtRandonCnStr(int n){
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i <n; i++) {
			sb.append(getOneCn());
		}
		return sb.toString();
	}
	private static String getOneCn(){
		String str = "";
        int hightPos; 
        int lowPos;
        Random random = new Random();

        hightPos = (176 + Math.abs(random.nextInt(39)));
        lowPos = (161 + Math.abs(random.nextInt(93)));

        byte[] b = new byte[2];
        b[0] = (Integer.valueOf(hightPos)).byteValue();
        b[1] = (Integer.valueOf(lowPos)).byteValue();

        try {
            str = new String(b, "GBK");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("错误");
        }

        	return str;
	}
}
package com.ice;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Time {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.println("当前时间为："+d);
		SimpleDateFormat a=new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		String today=a.format(d);
		System.out.println("当前时间为："+today);
		
		//使用 parse() 方法将文本转换为日期
		//创建日期格式的字符串
		String day="2017年5月5日  10点15分21秒";
		//使用SimpleDateFormat对象指定日期的格式
		SimpleDateFormat gg=new SimpleDateFormat("yyyy年MM月dd日 HH点mm分ss秒");
		//使用parse()方法将字符串转换为日期
		Date da=gg.parse(day);
		System.out.println("当前时间为："+da);
		
		
		//使用Calendar对象获取日期
		Calendar c=Calendar.getInstance();
		//获取年份
		int year=c.get(Calendar.YEAR);
		//获取月份  0=1月 所以+1
		int month=c.get(Calendar.MONTH)+1;
		//获取日
		int Day=c.get(Calendar.DAY_OF_MONTH);
		//获取小时
		int hour=c.get(Calendar.HOUR_OF_DAY);
		//分钟
		int minute=c.get(Calendar.MINUTE);
		//分
		int second=c.get(Calendar.SECOND);
		System.out.println("当前时间为："+year+"年"+month+"月"+Day+"日         "
		+hour+"点"+minute+"分"+second+"秒");
		//将Calendae对象转换为Date对象
		Date date=c.getTime();
		//获取毫秒数
		Long time=c.getTimeInMillis();
		System.out.println("当前时间为："+date);
		System.out.println("当前时间毫秒数："+time);
	}

}

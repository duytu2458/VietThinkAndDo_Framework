package vn.com.vtd.framework.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	private static final String DATE_FORMAT1 = "yyyy-MM-dd'T'HH:mm";
	private static final String DATE_FORMAT2 = "dd/MM/yyyy HH:mm a";

	private static SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(DATE_FORMAT1);
	private static SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(DATE_FORMAT2);

	public static String toDateFormat1(Date date) {
		try {
			return date != null ? simpleDateFormat1.format(date) : "";
		} catch (Exception e) {
			return "";
		}
	}

	public static Date toDate1(String date) {
		try {
			return date != null ? simpleDateFormat1.parse(date) : null;
		} catch (Exception e) {
			return null;
		}
	}

	public static String toDateFormat2(Date date) {
		try {
			return date != null ? simpleDateFormat2.format(date) : "";
		} catch (Exception e) {
			return "";
		}
	}

	public static void main(String[] args) {
		System.out.println(toDateFormat2(new Date()));
	}
}

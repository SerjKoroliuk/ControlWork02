package controlWork2.session;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Session {

	private static String ip;

	private static Session instance;

	private Session(String ip) {
		Session.ip = ip;
		System.out.println("Session is created with IP: " + ip);

	}

	public static Session getSession(String ip) {

		System.out.println("At the GetSession method");

		if (isValidIP(ip)) {
			if (instance == null) {
				instance = new Session(ip);
				return instance;
			}
			System.out.println("Ssssion is already exist!!!");

		} else {
			System.out.println("IP is not validate");

			return null;
		}
		return instance;
	}

	public static void endSession() {
		System.out.println("At the END session method");
		instance = null;
		System.out.println("Session with " + ip + " is closed");
		ip = null;

	}

	private static boolean isValidIP(String ipAddr) {

		Pattern ptn = Pattern
				.compile("(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)");
		Matcher mtch = ptn.matcher(ipAddr);
		return mtch.find();
	}

}

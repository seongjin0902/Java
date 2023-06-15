package ch19;

import java.io.FileInputStream;
import java.util.Properties;

public class C06PropertiesMain {

	public static void main(String[] args) {

		Properties properties = new Properties();

		try {
			FileInputStream in = new FileInputStream(
					"C:\\Users\\Administrator\\git\\repository\\JAVA_BOOK\\src\\ch19\\application.properties");
			properties.load(in);

			String url = properties.getProperty("url");
			String username = properties.getProperty("username");
			String password = properties.getProperty("password");
			
			System.out.println("URL : " + url);
			System.out.println("USERNAME : " + username);
			System.out.println("PASSWORD : " + password);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

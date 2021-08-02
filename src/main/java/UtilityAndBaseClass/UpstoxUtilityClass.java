package UtilityAndBaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UpstoxUtilityClass {
	

	public static String getTestDataFromProperties(String dataValue) throws IOException {
		
		Properties obj = new Properties();
		FileInputStream fileObj = new FileInputStream("C:\\Users\\Admin\\.eclipse\\UpstoxAppMaven\\UpstoxMavenProject\\LoginCredentials.properties");
		obj.load(fileObj);
		
		String prop = obj.getProperty(dataValue);
		return prop;
	}

}

package org.automation.fb.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FetchConfigData {

	public static Object fetchdata(String key) throws IOException {
		FileInputStream file = new FileInputStream("./ConfigFiles/ConfigFiles.properties");
		Properties property = new Properties();
		property.load(file);
		return property.get(key);
		
	}
}

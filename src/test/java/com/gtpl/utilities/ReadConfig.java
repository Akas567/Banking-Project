package com.gtpl.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
public String toFetchDataFromPropertyFile(String key) throws IOException {
		
		FileInputStream fis = new FileInputStream(IPathConstant.PROPERTYFILEPATH);
		Properties prop = new Properties();
		prop.load(fis);
		
		return prop.getProperty(key);	
		
	}
	
	


}

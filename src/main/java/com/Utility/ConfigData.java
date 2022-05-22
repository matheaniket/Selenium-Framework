package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigData {
	
	private Properties pro;
	
	public ConfigData() throws Exception {
		String configfilepath = System.getProperty("user.dir")+"\\Config\\Config.Properties";
		File src = new File(configfilepath);
		FileInputStream file = new FileInputStream(src);
		pro = new Properties();
		pro.load(file);
		
	}
	
	public String getBrowser() {
		return pro.getProperty("Browser");
	}
	public String getStage_URL() {
		return pro.getProperty("Stage_URL");
	}
	
	public String getEmailID() {
		return pro.getProperty("EmailID");
	}
	
	public String getPassword() {
		return pro.getProperty("Password");
	}
	

}

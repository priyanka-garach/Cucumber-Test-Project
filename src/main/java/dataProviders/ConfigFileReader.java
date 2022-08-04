package dataProviders;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

	private Properties properties;
	String s = System.getProperty("user.dir");
	String propertyFilePath = s+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"configs"+File.separator+"config.properties";
	//private final String propertyFilePath= "H:\\AutomationTestProjects\\AutomationTesting\\pixalere_automation\\src\\test\\resources\\configs\\config.properties";
	
	public ConfigFileReader() {
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("config.properties not found at " + propertyFilePath);
		}
	}
	
	public static String getProperties(String props) {
		String propVal = new ConfigFileReader().properties.getProperty(props);
		if(propVal!= null)
			return propVal;
		else
			throw new RuntimeException("driverPath not specified in the config.properties file."); 
		}
}
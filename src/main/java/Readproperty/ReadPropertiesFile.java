package Readproperty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;





public class ReadPropertiesFile {
	static Properties property;
	static FileInputStream fs;
	//static String ReadPropertyPath="/Users/montybhatt/eclipse-workspace/GBank";
	//
	

	
	public static  String PropFile(String PropName)  {
		
		
	try {
		//user.dir (To get the path upto the package see (DefaultPackage/userdir.java for understanding of path)
	fs = new FileInputStream("/Users/montybhatt/eclipse-workspace/GuruCucumberwithprojectstructure/src/main/java/Readproperty/properties.Properties");
		
	//	fs = new FileInputStream("/Users/montybhatt/eclipse-workspace/seleniumBasic/src/main/java/propertiesFile/properties.Properties");
	System.out.println(fs);
	} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	
	}
	property = new Properties();
	try {
	property.load(fs);
	} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	//throw new RuntimeException("Configuration.properties not found at " + ReadPropertyPath);
	}
	// System.out.println(property.getProperty("PropName"));
	return property.getProperty(PropName);
	}
	/**
	public String getDriverPath(){
		 String driverPath = property.getProperty("chromeLoc");
		 if(driverPath!= null) return driverPath;
		 else throw new RuntimeException("driverPath not specified in the Configuration.properties file."); 
		 }
		 **/
}
	
	
	
	


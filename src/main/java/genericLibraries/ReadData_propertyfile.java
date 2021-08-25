package genericLibraries;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData_propertyfile {
      
	public String readProp(String key) throws IOException
	{

	FileInputStream fis = new FileInputStream(Autoconstant.propertyfile);	
	Properties prop = new Properties();
	prop.load(fis);
	String value = prop.getProperty(key);
	//System.out.println(value);
	return value;
	
	}
}

	
	
	
	
	
	
	

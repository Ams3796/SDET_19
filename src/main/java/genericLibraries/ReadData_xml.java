package genericLibraries;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.testng.annotations.Test;

public class ReadData_xml {

	@Test
	public void readdata_xml() throws DocumentException 
	{
		
		File inputfile = new File("../SDET_19/src/test/resources/CommonDAta.xml");
		SAXReader reader = new SAXReader();
		Document doc = reader.read(inputfile);
		String value = doc.selectSingleNode("//SDET/url").getText();
	    System.out.println(value);
		
		
		
	}

}

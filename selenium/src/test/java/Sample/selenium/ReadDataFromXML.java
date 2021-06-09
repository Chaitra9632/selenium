package Sample.selenium;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.testng.annotations.Test;

public class ReadDataFromXML {
	@Test
	public void readDataFromXml() throws DocumentException {
		
		File inputFile = new File("./commonData.xml");
		 SAXReader reader = new SAXReader();
		 Document doc = reader.read(inputFile);
		 String USERNAME = doc.selectSingleNode("//main/username").getText();
		 System.out.println(USERNAME);
	}

}

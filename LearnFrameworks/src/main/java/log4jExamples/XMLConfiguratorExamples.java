package log4jExamples;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class XMLConfiguratorExamples {

	static Logger logger = Logger.getLogger(XMLConfiguratorExamples.class); //Factory Design Pattern
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DOMConfigurator.configure("log4j.xml");
		logger.debug("This is debug message");
		logger.info("This is info message");
		logger.warn("This is warn message");
		logger.error("This is error message");
		logger.fatal("This is fatal message");

	}

}

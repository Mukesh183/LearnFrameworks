package log4jExamples;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyLog4jExamples {

	static Logger logger = Logger.getLogger(PropertyLog4jExamples.class); //Factory Design Pattern

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("This is debug message");
		logger.info("This is info message");
		logger.warn("This is warn message");
		logger.error("This is error message");
		logger.fatal("This is fatal message");

	}

}

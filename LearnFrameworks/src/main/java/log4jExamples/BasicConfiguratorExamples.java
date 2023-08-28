package log4jExamples;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicConfiguratorExamples {
	
	static Logger logger = Logger.getLogger(BasicConfiguratorExamples.class); //Factory Design Pattern

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		BasicConfigurator.configure();
		logger.debug("This is debug message");
		logger.info("This is info message");
		logger.warn("This is warn message");
		logger.error("This is error message");
		logger.fatal("This is fatal message");
		
		
		

	}

}

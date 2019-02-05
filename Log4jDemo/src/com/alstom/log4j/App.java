package com.alstom.log4j;

import org.apache.log4j.Logger;

public class App {

	public static void main(String[] args) {
		Logger logger = Logger.getRootLogger();
//		SimpleLayout layout = new SimpleLayout();
//		ConsoleAppender appender = new ConsoleAppender(layout);
//		logger.addAppender(appender);
//		logger.setLevel(Level.FATAL);
		logger.warn("Warning");
		logger.debug("Debug");
		logger.error("Error");
		logger.info("Information");
		logger.fatal("System Failure");
	}

}

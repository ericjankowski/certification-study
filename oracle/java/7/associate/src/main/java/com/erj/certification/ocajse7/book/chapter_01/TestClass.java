package com.erj.certification.ocajse7.book.chapter_01;

//import java.io.*;
import java.io.IOException;
import java.io.File;

//import java.text.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

//import java.util.*;
import java.util.Date;

//import java.util.logging.*;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.util.logging.Logger;
import java.util.logging.Level;

public class TestClass {
	public static void main (String [] args) throws IOException{
		new File("logs").mkdir();
		
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddhhmmss");
		Date now = new Date();
		String date = dateFormat.format(now);
		
		String logFileName = "logs/testlog-" + date + ".txt";
		
		FileHandler myFileHandler = new FileHandler(logFileName);
		
		myFileHandler.setFormatter(new SimpleFormatter());
		Logger ocajLogger = Logger.getLogger("OCAJ Logger");
		ocajLogger.setLevel(Level.ALL);
		ocajLogger.addHandler(myFileHandler);
		
		ocajLogger.info("\nThis is a logged information message.");
		myFileHandler.close();
	}
}

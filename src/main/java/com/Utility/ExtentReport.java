package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {
	
	public static ExtentReports extent;
	
	public static ExtentReports extentreport() {
		
		String reportpath=System.getProperty("user.dir")+"\\Reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(reportpath);
		reporter.config().setDocumentTitle("Test Execution Report");
		reporter.config().setReportName("Automation Test Report");
		reporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Browser Name", "Chrome");
		extent.setSystemInfo("QA Name", "Mr. ABC");
		extent.setSystemInfo("Environment", "Stage");
		
		return extent;
	}
}

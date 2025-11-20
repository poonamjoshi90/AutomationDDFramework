package com.qa.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.reporter.ExtentReporter;

import Utilities.ExtentReportsDemo;


public class Mylisteners implements ITestListener {

	
	ExtentReportsDemo	 extentReport;
	
	@Override
	public void onStart(ITestContext context) {
			// extentReport = ExtentReportsDemo.ExtentReportsData();
		
		
		//ExtentReporter extentReporter	= ExtentReporter.
	}
	@Override
	public void onTestStart(ITestResult result) {
	String testName=	result.getName();
	System.out.println(testName +"started execuating ");
			}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testName=	result.getName();
		System.out.println(testName +"got sucessfully started  ");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testName=	result.getName();
		System.out.println(testName +"got failed ");
		System.out.println(result.getThrowable());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testName=	result.getName();
		System.out.println(testName +"got skipped   ");
		System.out.println(result.getThrowable());
	}
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("all test cases completed  ");
	}

}

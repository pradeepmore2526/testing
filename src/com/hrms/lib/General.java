package com.hrms.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.hrms.utility.Log;

import org.openqa.selenium.By;

public class General extends Global {
//re-usable fun
	public void openApplication() {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium setup_jarfiles\\geckodriver-v0.27.0-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("Application opened");
	}
	public void closeApplication() {
		driver.close();
		System.out.println("Application Closed");
	}
	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login Completed");
		Log.info("Login completed");
	}
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");
		Log.info("Logout completed");
	}
	public void addemp() {
		System.out.println("Adding new Employee");
		Log.info("Added new Employee");
	}
	public void delemp() {
		System.out.println("Deleted Employee");
		Log.info("Deleted Employee");
	}
}

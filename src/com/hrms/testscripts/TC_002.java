package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;
import org.apache.log4j.xml.DOMConfigurator;

public class TC_002 {
//public static void main(String args[]) {
	@Test
	public void tc002() {
	//TestCase steps
	DOMConfigurator.configure("log4j.xml");
	General obj = new General();
	obj.openApplication();
	obj.login();
	obj.addemp();
	obj.delemp();
	obj.logout();
	obj.closeApplication();
}

}

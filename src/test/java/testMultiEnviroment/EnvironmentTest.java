package testMultiEnviroment;

import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import multiEnviroment.multiEnviroment.Environment;

public class EnvironmentTest {
	Environment testEnvironment;

	@Test
	public void functionalTest() {
		System.out.println(testEnvironment.url());
		System.out.println(testEnvironment.getDBHostname());
		System.out.println(testEnvironment.getDBPassword());
	}

	@BeforeClass
	@Parameters({ "environment" })
	public void beforeTest(String environment) {
		ConfigFactory.setProperty("env", environment);
		testEnvironment = ConfigFactory.create(Environment.class);
	}
}

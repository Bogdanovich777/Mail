package by.htp.testng.testmail;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import by.htp.testng.mail.steps.Steps;

public class TestMail 
{
	private Steps steps;
	
	private final String LOGIN = "tathtp";
	private final String PASSWORD = "Klopik123";
	
	private final String RECEIVER = "alligatoro1987@gmail.com";
	private final String TOPIC = "Github";
	private final String MESSAGE= "Привет! тут мой GitHub: https://github.com/Bogdanovich777.";

	@BeforeMethod(description = "Init browser")
	public void setUp()
	{
		steps = new Steps();
		steps.initBrowser();
	}


	@Test(description = "Send Letter")
	public void OneCanSendLetter()
	{
		steps.loginMailRu(LOGIN, PASSWORD);
		steps.sendLetter(RECEIVER, TOPIC, MESSAGE);
	}
	
	@AfterMethod(description = "Stop Browser")
	public void stopBrowser()
	{
		steps.closeDriver();
}
}
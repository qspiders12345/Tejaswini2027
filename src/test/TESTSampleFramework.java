package test;

import java.io.IOException;
import org.testng.annotations.Test;
import generics.BaseTest;
import pom.POMSampleFramework;

public class TESTSampleFramework extends BaseTest
{
	@Test
	public void a() throws IOException
	{
		POMSampleFramework sample=new POMSampleFramework(driver);
		sample.submit();
	}
}
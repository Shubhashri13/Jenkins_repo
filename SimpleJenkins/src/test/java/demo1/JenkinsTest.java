package demo1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinsTest
{
	@Test
	public void sample()
	{
		Reporter.log("JenkinsTest class executed",true);
	}

}

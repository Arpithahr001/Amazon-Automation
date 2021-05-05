package caseStudyGoogle;

import org.testng.annotations.Test;

public class Google extends TestBaseForGoogle  {
@Test

public void Search()
{
	g.getinputField().sendKeys("Automation Testing");
	g.getSearchButton().submit();
}
}



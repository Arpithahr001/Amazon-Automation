package AmazonEndTOEnd;

	import java.text.SimpleDateFormat;
	import java.util.ArrayList;
	import java.util.Date;
	import java.util.List;

	import org.testng.ITestContext;
	import org.testng.ITestResult;
	import org.testng.TestListenerAdapter;

	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.Status;
	import com.aventstack.extentreports.markuputils.ExtentColor;
	import com.aventstack.extentreports.markuputils.MarkupHelper;
	import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
	import com.aventstack.extentreports.reporter.configuration.Theme;

	public class ReportingAmazon extends TestListenerAdapter {
		public ExtentHtmlReporter htmlReporter;
		public ExtentReports extent;
		public ExtentTest xTest;
		 @Override
		  public void onStart(ITestContext testContext) {
		   String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		   String reportName="Test-Report"+timestamp+".html";
			htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/Reports/"+reportName);
			htmlReporter.config().setDocumentTitle("Amazon data");
			htmlReporter.config().setReportName("Functional testing");
			htmlReporter.config().setTheme(Theme.DARK);
			
			extent=new ExtentReports();
			extent.attachReporter(htmlReporter);
			extent.setSystemInfo("Host Name","localhost");
			extent.setSystemInfo("QA name","Ramya");
			extent.setSystemInfo("os","Windows 10");

		  }

		@Override
		  public void onFinish(ITestContext testContext) {
			extent.flush();
		}
		  
		 @Override
		  public void onTestSuccess(ITestResult tr) {
		    xTest=extent.createTest(tr.getName());
		    xTest.log(Status.PASS,MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN));
		    xTest.log(Status.PASS,"Test is passed");
		 }

		  @Override
		  public void onTestFailure(ITestResult tr) {
			  xTest=extent.createTest(tr.getName());
			    xTest.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(),ExtentColor.RED));
			    xTest.log(Status.FAIL,"Test is failed");
		  }

		  @Override
		  public void onTestSkipped(ITestResult tr) {
			  xTest=extent.createTest(tr.getName());
			    xTest.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.AMBER));
			    xTest.log(Status.SKIP,"Test is skipped");
		  }

}

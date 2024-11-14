package qtriptest;

import java.io.File;

public class ExtentReports {

    private ExtentReports extent;
    private com.relevantcodes.extentreports.ExtentTest extentTest;

    public ExtentReports(String string) {
        extent = new ExtentReports(string);
    }

    public void loadConfig(File file) {
        extent.loadConfig(file);
    }

    public com.relevantcodes.extentreports.ExtentTest createTest(String testName) {
        extentTest = extent.createTest(testName);
        return extentTest;
    }

    public void flush() {
        extent.flush();
    }
}

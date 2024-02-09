package test_ng;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerLesson implements ITestListener {

    public void onTestFailure(ITestResult result) {
        System.out.println("Test failed, this is a message from ITestListener");
    }
}

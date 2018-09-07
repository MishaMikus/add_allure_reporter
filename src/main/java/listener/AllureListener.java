package listener;

import io.qameta.allure.Attachment;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class AllureListener extends TestListenerAdapter {

    @Override
    @Attachment()
    public void onTestFailure(ITestResult var1) {

    }

}

import io.qameta.allure.Step;
import listener.AllureListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(AllureListener.class)
public class MyTest {

    @Test
    void myTest() {
        step1();
        step2();
        System.out.println("test success");
    }

    @Test
    void myTest2() {
        step1();
        step2();
        failStep3();
    }

    @Step
    private void failStep3() {
        assert false;
    }

    @Step
    private void step1() {
        System.out.println("step1 success");
    }

    @Step
    private void step2() {
        System.out.println("step2 success");
    }
}

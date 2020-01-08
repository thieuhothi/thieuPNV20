
package tests;

import org.openqa.selenium.support.PageFactory;
import tests.openWebsiteTest;
import runner.TestRunner;


public class pageProvider {
    public static openWebsiteTest openWebsiteTest;

    public static openWebsiteTest getAddCustomerPage() {
        if (openWebsiteTest == null) {
            openWebsiteTest = PageFactory.initElements(TestRunner.driver, openWebsiteTest.class);
        }
        return openWebsiteTest;
    }
}

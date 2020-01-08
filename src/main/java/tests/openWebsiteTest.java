package tests;

import cucumber.api.java.en.Given;
import runner.TestRunner;

public class openWebsiteTest extends pageProvider {

    @Given("^I open (.*)$")
    public void OpenWebsite(String website) throws InterruptedException {
        Thread.sleep(3000);
        TestRunner.driver.get(website);
        TestRunner.driver.manage().window().maximize();
    }
}

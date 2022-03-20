package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    private String today;
    private String actualAnswer;

    public StepDefinitions() {
        today = "";
        actualAnswer = "";
    }

    @Given("today is Sunday")
    public void today_is_sunday() {
        System.out.println("Today is sunday");
        today = "Sunday";
    }

    @When("asked whether it's friday yet")
    public void asked_whether_it_is_friday_yet() {
        System.out.println("Checking whether it's friday");
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("answer is {string}")
    public void answer_is(String expectedAnswer) {
        String answer = expectedAnswer.equals(actualAnswer) ? "right" : "wrong";
        System.out.println("Answer is: "+answer);
    }

    @Given("today is Friday")
    public void todayIsFriday() {
        System.out.println("Today is Firday");
        today = "Friday";
    }

    @Given("today is {string}")
    public void todayIs(String today) {
        System.out.println("Today is "+today);
        this.today = today;
    }
}

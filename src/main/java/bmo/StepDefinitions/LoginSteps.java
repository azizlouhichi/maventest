package bmo.StepDefinitions;

import java.util.HashMap;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    private Map<String, String> usersDatabase = new HashMap<>();
    private String loginMessage;

    

    @When("the user enters username {string} and password {string}")
    public void the_user_enters_username_and_password(String username, String password) {
        // Simulating login logic
        if (usersDatabase.containsKey(username) && usersDatabase.get(username).equals(password)) {
            loginMessage = "Welcome " + username;
        } else {
            loginMessage = "Invalid username or password";
        }
    }

    @Then("the user should see a welcome message {string}")
    public void the_user_should_see_a_welcome_message(String expectedMessage) {
        assert loginMessage.equals(expectedMessage) : "Expected: " + expectedMessage + ", but got: " + loginMessage;
    }

    @Then("the user should see an error message {string}")
    public void the_user_should_see_an_error_message(String expectedMessage) {
        assert loginMessage.equals(expectedMessage) : "Expected: " + expectedMessage + ", but got: " + loginMessage;
    }
}

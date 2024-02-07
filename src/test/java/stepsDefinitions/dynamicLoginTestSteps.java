package stepsDefinitions;

import io.cucumber.java.en.*;
import pages.*;
import utils.chatGPTClient;

public class dynamicLoginTestSteps {

    DynamicLoginPage dynamicLoginPage = new DynamicLoginPage();
    @Given("User opens the browser and goes to the required {string} for {string}")
    public void user_opens_the_browser_and_goes_to_the_required_for(String url, String testcase) {

        dynamicLoginPage.goTo(url);
    }
    @Then("User is able to connect to ChatGPT API and gets the required xpaths for login for {string}")
    public void user_is_able_to_connect_to_chat_gpt_api_and_gets_the_required_xpaths_for_login_for(String string) {
        String htmlDetails = dynamicLoginPage.getHTMLDOM();

        String prompt = "Write the mentioned xpaths in the format [ a , b , c ]. Additional details or comment is not required."
                + "The required xpaths are: Username , password. "
                +"The HTML of the Page is given below: "
                + htmlDetails.trim();

        chatGPTClient gptClient = new chatGPTClient();

        String response = gptClient.chatGPTAPICall(prompt);

        System.out.println(response);
    }
    @Then("User enters the {string} and {string} for {string}")
    public void user_enters_the_and_for(String string, String string2, String string3) {

    }
    @Then("User clicks on the login button for {string}")
    public void user_clicks_on_the_login_button_for(String string) {

    }
}

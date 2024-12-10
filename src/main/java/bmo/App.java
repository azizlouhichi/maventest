package bmo;

import bmo.StepDefinitions.LoginSteps;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LoginSteps login = new LoginSteps();
        //login.the_user_is_on_the_login_page();
        login.the_user_enters_username_and_password("testuser", "password123");
        login.the_user_should_see_a_welcome_message("Welcome testuser");
        login.the_user_enters_username_and_password("testuser", "wrongpassword");
        login.the_user_should_see_an_error_message("Invalid username or password");

    }
    

}

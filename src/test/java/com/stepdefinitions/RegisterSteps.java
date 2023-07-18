package com.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {
	
	@Given("The user opens Register Page")
	public void the_user_opens_register_page() {
	    
	}

	@When("he user clicks {string} button with all fields empty")
	public void he_user_clicks_button_with_all_fields_empty(String string) {
	    
	}

	@Then("It should display an error {string} below Username textbox")
	public void it_should_display_an_error_below_username_textbox(String string) {
	    
	}

	@When("The user clicks {string} button after entering username with other fields empty")
	public void the_user_clicks_button_after_entering_username_with_other_fields_empty(String string, io.cucumber.datatable.DataTable dataTable) {
	  
	}

	@Then("It should display an error {string} below Password textbox")
	public void it_should_display_an_error_below_password_textbox(String string) {
	    
	}

	@When("The user clicks {string} button after entering {string} and {string} with Password Confirmation field empty")
	public void the_user_clicks_button_after_entering_and_with_password_confirmation_field_empty(String string, String string2, String string3, io.cucumber.datatable.DataTable dataTable) {
	   
	}

	@Then("It should display an error {string} below Password Confirmation textbox")
	public void it_should_display_an_error_below_password_confirmation_textbox(String string) {
	   
	}

	@When("The user enters a {string} with characters other than Letters, digits and {string}")
	public void the_user_enters_a_with_characters_other_than_letters_digits_and(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
	  
	}

	@Then("It should display an error message {string}")
	public void it_should_display_an_error_message(String string) {
	    
	}

	@Given("The user is presented with error message for username already exists")
	public void the_user_is_presented_with_error_message_for_username_already_exists() {
	    
	}

	@When("The user enters a valid existing {string} with {string} and {string}")
	public void the_user_enters_a_valid_existing_with_and(String string, String string2, String string3, io.cucumber.datatable.DataTable dataTable) {
	   
	}

	@When("The user clicks {string} button after entering valid {string} and different passwords in {string} and {string} fields")
	public void the_user_clicks_button_after_entering_valid_and_different_passwords_in_and_fields(String string, String string2, String string3, String string4, io.cucumber.datatable.DataTable dataTable) {
	  
	}

	@When("The user enters a valid {string} and {string} with characters less than {int}")
	public void the_user_enters_a_valid_and_with_characters_less_than(String string, String string2, Integer int1, io.cucumber.datatable.DataTable dataTable) {
	   
	}

	@When("The user enters a valid {string} and {string} with only numbers")
	public void the_user_enters_a_valid_and_with_only_numbers(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
	    
	}

	@When("The user enters a valid {string} and {string} similar to username")
	public void the_user_enters_a_valid_and_similar_to_username(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
	    
	}

	@When("The user enters a valid {string} and commonly used password {string}")
	public void the_user_enters_a_valid_and_commonly_used_password(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
	   
	}

	@When("The user enters a valid {string} and {string} and {string}")
	public void the_user_enters_a_valid_and_and(String string, String string2, String string3, io.cucumber.datatable.DataTable dataTable) {
	   
	}

	@Then("The user should be redirected to Homepage with the message {string}")
	public void the_user_should_be_redirected_to_homepage_with_the_message(String string) {
	    
	}



}

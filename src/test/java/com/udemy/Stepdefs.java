package com.udemy;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

public class Stepdefs {

    @Given("Konto z saldem 200zl")
    public void konto_z_saldem(){
        System.out.println("Metoda GIVEN Konto 200zl\n");
    }
    @When("Uzytkownik probuje wyplacic 300zl")
    public void wyplata_z_konta(){
        System.out.println("Metoda When wyplata konta\n");
    }
    @Then("Saldo nie zmienia sie i wynosi 200zl")
    public void sprawdzenie_salda(){
        System.out.println("Metoda Then sprawdzenie salda na koncie\n");
    }

}
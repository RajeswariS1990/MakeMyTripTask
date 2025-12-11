package stepDefinition;

import base.baseClass;
import io.cucumber.java.en.*;
import pom.homePage;
import pom.searchBusPage;
import pom.selectSeatPage;
import pom.travellerDetailsPage;

public class stepClass extends baseClass {

    homePage hp = new homePage(driver);
    searchBusPage sbp = new searchBusPage(driver);
    selectSeatPage ssp = new selectSeatPage(driver);
    travellerDetailsPage tdp = new travellerDetailsPage(driver);

    @Given("Enter The URL")
    public void enter_the_url() throws InterruptedException {
        url("https://www.makemytrip.com/https://www.makemytrip.com/");
        Thread.sleep(1000);
    }

    @Then("Click The Buses Menu")
    public void click_the_buses_menu() throws InterruptedException {
        hp.close();
        hp.clickBusMenu();

    }

    @Then("Enter Pickup Location {string}")
    public void enter_pickup_location(String string) throws InterruptedException {
        hp.enterPickUp(string);

    }

    @Then("Enter DropTo Location {string}")
    public void enter_drop_to_location(String string) throws InterruptedException {
        hp.enterDropTo(string);
    }

    @Then("Select Date And Search The Buses")
    public void select_date_and_search_the_buses() throws InterruptedException {
        hp.selectDate();
    }

    @Then("Filter The Buses")
    public void filter_the_buses() throws InterruptedException {
        sbp.filter();
    }

    @Then("Click Cheapest And Get The Lowest Price Bus")
    public void click_cheapest_and_get_the_lowest_price_bus() throws InterruptedException {
        sbp.cheapAndLowPriceBus();
    }

    @Then("Click Select Seat")
    public void click_select_seat() throws InterruptedException {
        sbp.selectSeat();
    }

    @Then("Select Any Berth to Reserve The Seat And Click Continue")
    public void select_any_berth_to_reserve_the_seat_and_click_continue() throws InterruptedException {
        ssp.selectBerthAndClickContinue();
    }

    @Then("Enter The Traveller Details {string} {string} {string} {string}")
    public void enter_the_traveller_details(String string, String string2, String string3, String string4) throws InterruptedException {
        tdp.travellerDetails(string, string2, string3, string4);
    }

    @Then("Click Continue To Payment Page")
    public void click_continue_to_payment_page() throws InterruptedException {
        tdp.clickContinue();
    }


}

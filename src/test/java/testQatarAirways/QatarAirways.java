package testQatarAirways;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import base.BaseClass;
import org.testng.annotations.Test;
import qatarAirwaysHomePage.HomePageQatarAirways;

public class QatarAirways extends BaseClass {

    public static HomePageQatarAirways homePageQatarAirways = null;

    @BeforeClass
    public void init() {
        homePageQatarAirways = PageFactory.initElements(driver, HomePageQatarAirways.class);
        driver.get("https://www.qatarairways.com");
    }
    @Test
    public void verifyTitle(){
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title, "Qatar Airways - Book a flight and browse our flight offers");
    }

    @Test
    public void homePageQatarAirwaysTest() throws InterruptedException {
        Thread.sleep(1000);
        homePageQatarAirways.clickExplore();
        homePageQatarAirways.clickCloseDropDown();
        Assert.assertTrue(homePageQatarAirways.dropDownEnable());

    }

    @Test
    public void bookFlightsTest1(){
        homePageQatarAirways.setFrom("DTW");
        homePageQatarAirways.setTo("DAC");
        homePageQatarAirways.showBtn();
        Assert.assertTrue(homePageQatarAirways.showFlights());
    }
    @Test
    public void bookFlightsTest2(){
        homePageQatarAirways.setFrom("DTW");
        homePageQatarAirways.setTo("DAC");
        homePageQatarAirways.tripType();
        Select select = new Select(driver.findElement(By.id("roundTrip")));
        Assert.assertEquals("Return", "Return");
    }
    @Test
    public void bookFlightsTest3(){
        homePageQatarAirways.setFrom("DTW");
        homePageQatarAirways.setTo("DAC");
        homePageQatarAirways.tripType();
        Select select = new Select(driver.findElement(By.id("onewayTrip")));
        homePageQatarAirways.depart();
        select.selectByVisibleText("7");
        homePageQatarAirways.returnBack();
        select.selectByVisibleText("10");
        homePageQatarAirways.selectPassenger();
        select.selectByIndex(2);
        homePageQatarAirways.seatClass();
        select.selectByVisibleText("Economy");
        homePageQatarAirways.showBtn();
Assert.assertTrue(homePageQatarAirways.showFlights());
    }
    @Test
    public void tabFlightStatusTest(){
        homePageQatarAirways.flightStatusTab();
        homePageQatarAirways.flightsStatusInput("DOH");
        homePageQatarAirways.flightsTo("JFK");
        homePageQatarAirways.submit();
Assert.assertTrue(homePageQatarAirways.btnSubmit());
    }
    @Test
    public void bookButtonTest(){
        homePageQatarAirways.btnBook();
        Assert.assertTrue(homePageQatarAirways.bookDropDownEnable());
    }

    @Test
    public void ExperienceBtnTest(){
        homePageQatarAirways.btnExperience();
        Assert.assertTrue(homePageQatarAirways.expDropDownEnable());
    }

    @Test
    public void privilegeBtnTest(){
        homePageQatarAirways.btnPrivilege();
        Assert.assertTrue(homePageQatarAirways.privilegeDropDownEnable());
    }

    @Test
    public void helpTest(){
        homePageQatarAirways.help();
        Assert.assertTrue(homePageQatarAirways.hlp("https://www.qatarairways.com/en/help.html?iid=ALL75199970"));
    }

    @Test
    public void searchTest(){
        homePageQatarAirways.search();
        homePageQatarAirways.inputSearch("LONDON");
        homePageQatarAirways.btnSearch();
        Assert.assertTrue(homePageQatarAirways.search("https://www.qatarairways.com/en/search-results.html?searchString=LONDON&currentPagePath=/en/search-results"));
    }

    @Test
    public void loginSignUpTest(){
        homePageQatarAirways.login();
        homePageQatarAirways.userId("MORGAN");
        homePageQatarAirways.userPass("12349");
        homePageQatarAirways.qatAirLogin();
        Assert.assertTrue(homePageQatarAirways.qALogin());
    }
    @Test
    public void oneWorldTest(){
        homePageQatarAirways.setOneWorld();
        Assert.assertTrue(homePageQatarAirways.OneWorld("https://www.qatarairways.com/en/about-qatar-airways/oneworld.html"));
    }

    @Test
    public void getTheAppTest(){
        homePageQatarAirways.setGetTheApp();
        Assert.assertTrue(homePageQatarAirways.appQnCode());
    }

    @Test
    public void bookNowTest(){
        homePageQatarAirways.setBookNow();
        Assert.assertTrue(homePageQatarAirways.bookNowEnable());
    }

    @Test
    public void viewMoreFareTest(){
        homePageQatarAirways.moreFare();
        Assert.assertTrue(homePageQatarAirways.viewMoreFareEnable());
    }

    @Test
    public void joinNowTest(){
        homePageQatarAirways.becomeMember();
        Assert.assertTrue(homePageQatarAirways.joinNowEnable());
    }

    @Test
    public void faceBookTest(){
        homePageQatarAirways.connectFB();
        Assert.assertTrue(homePageQatarAirways.faceBookEnable());
    }
    @Test
    public void twitterTest(){
        homePageQatarAirways.connectTwitter();
        Assert.assertTrue(homePageQatarAirways.twitterEnable());
    }

    @Test
    public void hidePageContentTest(){
        homePageQatarAirways.contentHiding();
        Assert.assertTrue(homePageQatarAirways.hideArrowEnable());
    }






}
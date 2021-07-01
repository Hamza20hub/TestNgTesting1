package qatarAirwaysHomePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageQatarAirways {

    @FindBy(className = "nav-link mobile_Explore")
    WebElement exploreBtn;

    @FindBy(className = "close icon dismissDropdown")
    WebElement closeDropDown;

    @FindBy(id = "bw-from")
    WebElement from;

    @FindBy(id = "bw-to")
    WebElement to;

    @FindBy(className = "btn btn-default dropdown-toggle")
    WebElement tripType;

    @FindBy(className = "t-dates t-date-check-in")
    WebElement depart;

    @FindBy(className = "t-day-check-out")
    WebElement returnBack;

    @FindBy(id = "passenger-field")
    WebElement numOfPassenger;

    @FindBy(id = "cabintype")
    WebElement seatClass;

    @FindBy(className = "submitbutton flightsearh-btn")
    WebElement showFlightsBtn;

    @FindBy(id = "flightstatus-tab")
    WebElement flightsStatusTab;

    @FindBy(id = "flightStatusFrom")
    WebElement flightsStatusInput;

    @FindBy(id = "flightStatusto")
    WebElement flightsTo;

    @FindBy(id = "flightDateRange")
    WebElement rangeDropDown;

    @FindBy(id = "submitbutton px-0")
    WebElement submitBtn;

    @FindBy(className = "nav-link mobile_Book")
    WebElement bookBtn;

    @FindBy(className = "nav-link mobile_Experience")
    WebElement experienceBtn;

    @FindBy(className = "nav-link mobile_pclub")
    WebElement privilegeBtn;

    @FindBy(className = "nav-link")
    WebElement helpLink;

    @FindBy(id = "Rectangle_2")
    WebElement searchBtn;

    @FindBy(id = "search-input-text")
    WebElement searchInput;

    @FindBy(className = "btn search-btn")
    WebElement clickSearchBtn;

    @FindBy(id = "loginMenuHeader")
    WebElement loginBtn;

    @FindBy(id = "f1003")
    WebElement email;

    @FindBy(id = "f1001")
    WebElement pass;

    @FindBy(id = "loginButtonInvoke")
    WebElement loginQatAir;

    @FindBy(id = "Ellipse_336")
    WebElement oneWorld;

    @FindBy(className = "icon-text")
    WebElement getTheApp;

    @FindBy(className = "btn knowmore")
    WebElement bookNow;

    @FindBy(className = " offer-button-more")
    WebElement viewMoreFare;

    @FindBy(className = "btn knowmore")
    WebElement joinNow;

    @FindBy(className = "icon-footer-facebook")
    WebElement socialMediaFB;

    @FindBy(className = "icon-footer-twitter")
    WebElement socialMediaTwitter;

    @FindBy(className = "btn btn-link collapsed text-center footer-btn")
    WebElement hidePageContent;

    public void contentHiding(){
        hidePageContent.click();
    }

    public void connectTwitter(){
        socialMediaTwitter.click();
    }

    public void connectFB(){
        socialMediaFB.click();
    }

    public void becomeMember(){
        joinNow.click();
    }

    public void moreFare(){
        viewMoreFare.click();
    }
    public void setBookNow() {
        bookNow.click();
    }



    public void fillEmptyField(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }

    public void clickExplore() {
        exploreBtn.click();
    }

    public void clickCloseDropDown() {
        closeDropDown.click();
    }

    public void setFrom(String value) {
        fillEmptyField(from, value);
    }

    public void setTo(String value) {
        fillEmptyField(to, value);
    }

    public void tripType() {
        tripType.click();

    }

    public void depart() {
        depart.click();
    }

    public void returnBack() {
        returnBack.click();
    }

    public void selectPassenger() {
        numOfPassenger.click();
    }

    public void seatClass() {
        seatClass.click();
    }

    public void showBtn() {
        showFlightsBtn.click();
    }

    public void flightStatusTab() {
        flightsStatusTab.click();

    }

    public void flightsStatusInput(String value) {
        fillEmptyField(flightsStatusInput, value);

    }

    public void flightsTo(String value) {
        fillEmptyField(flightsTo, value);
    }

    public void flightDate() {
        rangeDropDown.click();
    }

    public void submit() {
        submitBtn.click();
    }

    public void btnBook() {
        bookBtn.click();
    }

    public void btnExperience() {
        experienceBtn.click();
    }

    public void btnPrivilege() {
        privilegeBtn.click();
    }

    public void help() {
        helpLink.click();
    }

    public void search() {
        searchBtn.click();
    }

    public void inputSearch(String value) {
        fillEmptyField(searchInput, value);
    }

    public void btnSearch() {
        clickSearchBtn.click();
    }

    public void login() {
        loginBtn.click();
    }

    public void userId(String value) {
        fillEmptyField(email, value);
    }

    public void userPass(String value) {
        fillEmptyField(pass, value);
    }

    public void qatAirLogin() {
        loginQatAir.click();
    }

    public void setOneWorld() {
        oneWorld.click();
    }

    public boolean dropDownEnable() {
        return exploreBtn.isEnabled();
    }

    public boolean showFlights() {
        return showFlightsBtn.isEnabled();
    }

    public boolean btnSubmit() {
        return submitBtn.isEnabled();
    }

    public boolean bookDropDownEnable() {
        return bookBtn.isEnabled();
    }

    public boolean expDropDownEnable() {
        return experienceBtn.isEnabled();
    }

    public boolean privilegeDropDownEnable() {
        return privilegeBtn.isEnabled();
    }

    public boolean hlp(String url) {
        return helpLink.equals(url);
    }

    public boolean search(String url) {
        return clickSearchBtn.equals(url);
    }

    public boolean qALogin() {
        return loginQatAir.isEnabled();
    }

    public boolean OneWorld(String url) {
        return oneWorld.equals(url);
    }

    public boolean appQnCode() {
        return getTheApp.isEnabled();
    }

    public boolean bookNowEnable() {
        return bookNow.isEnabled();
    }
    public boolean viewMoreFareEnable(){
        return viewMoreFare.isEnabled();
    }

    public boolean joinNowEnable(){
        return joinNow.isEnabled();
    }
    public boolean faceBookEnable(){
        return socialMediaFB.isEnabled();
    }

    public boolean twitterEnable(){
        return socialMediaTwitter.isEnabled();
    }

    public boolean hideArrowEnable(){
        return hidePageContent.isEnabled();
    }

}
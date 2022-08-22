package Step;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepfile {
	static WebDriver driver;
	
public void takesnaps(WebDriver webdriver,String filePath) throws IOException {
		
		TakesScreenshot ss = (TakesScreenshot)webdriver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File des = new File(filePath);
		FileHandler.copy(src,des);

		
	}
	@Given("Launch the brower")
	public void launch_the_brower() {
	    // Write code here that turns the phrase above into concrete actions
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		throw new io.cucumber.java.PendingException();
	}

	@When("Enter the <username>")
	public void enter_the_username(String username) throws Exception {
	    // Write code here that turns the phrase above into concrete actions

		WebElement uname = driver.findElement(By.id("txtUsername"));

		uname.sendKeys(username);
		Thread.sleep(2000);
		 //		boolean s= uname.isDisplayed();

		boolean s= uname.isDisplayed();
		 System.out.println("The return value: " + s);
		throw new io.cucumber.java.PendingException();
	}

	@When("Enter the (.*)")
	public void enter_the_admin123(String Password) throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		WebElement passwd = driver.findElement(By.id("txtPassword"));
		passwd.sendKeys(Password);
		boolean s1= passwd.isDisplayed();
		 System.out.println("The return value: " + s1);
	     takesnaps(driver,"C:\\Users\\santhoshg\\Desktop\\Eclipse\\screenshot.png");

		throw new io.cucumber.java.PendingException();
	}

	@Then("Click Login button")
	public void click_login_button() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		WebElement submit = driver.findElement(By.className("button"));
		submit.click();
	     takesnaps(driver,"C:\\Users\\santhoshg\\Desktop\\Eclipse\\screenshot1.png");

		throw new io.cucumber.java.PendingException();
	}

	@Given("Click add user")
	public void click_add_user() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		WebElement menulog=driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
		menulog.click();
		throw new io.cucumber.java.PendingException();
	}

	@When("Enter the Select the userrole and status")
	public void enter_the_select_the_userrole_and_status() {
	    // Write code here that turns the phrase above into concrete actions
		Select userrole = new Select(driver.findElement(By.cssSelector(" #searchSystemUser_userType")));
		userrole.selectByIndex(1);
		Select Status1 = new Select(driver.findElement(By.cssSelector("#searchSystemUser_status")));
		Status1.selectByIndex(1);
		throw new io.cucumber.java.PendingException();
	}

	@When("Enter the Employee Name")
	public void enter_the_employee_name() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement employeename = driver.findElement(By.xpath(" //input[@id='systemUser_employeeName_empName']"));
		employeename.sendKeys("Ether tent");
		throw new io.cucumber.java.PendingException();
	}

	@When("Enter the UserName and Password")
	public void enter_the_user_name_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement useraname = driver.findElement(By.name("systemUser[userName]"));
		useraname.sendKeys("Ether1997");
		WebElement password = driver.findElement(By.id("systemUser_password"));
		password.sendKeys("Password123");

		throw new io.cucumber.java.PendingException();
	}


@Then("Click Save button")
public void click_save_button() {
    // Write code here that turns the phrase above into concrete actions
	WebElement save = driver.findElement(By.xpath(" //input[@id='btnSave']"));
	save.click();
	throw new io.cucumber.java.PendingException();
}


@Given("Navigate to the admin page")
public void NavigateAdmin() {
	driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	WebElement adminname1 = driver.findElement(By.id("searchSystemUser_userName"));
	adminname1.sendKeys("Ether1997");
	throw new io.cucumber.java.PendingException();
}

@When("Enter the userrole and status")
public void userrole() {
	Select userrole2 = new Select(driver.findElement(By.cssSelector(" #searchSystemUser_userType")));
	userrole2.selectByIndex(1);
	throw new io.cucumber.java.PendingException();
}

@When("Enter the Employee Names")
public void employee_name() {
    // Write code here that turns the phrase above into concrete actions
	WebElement empname1 = driver.findElement(By.name("searchSystemUser[employeeName][empName]"));
	empname1.sendKeys("Ether tent");
	throw new io.cucumber.java.PendingException();
}

@When("Select the status")
public void status() {
    // Write code here that turns the phrase above into concrete actions
	Select Status2 = new Select(driver.findElement(By.cssSelector("#searchSystemUser_status")));
	Status2.selectByIndex(1);

	throw new io.cucumber.java.PendingException();
}


@Then("Click Search button")
public void search_button() throws IOException {
// Write code here that turns the phrase above into concrete actions
	driver.findElement(By.className("searchbutton")).click();
    takesnaps(driver,"C:\\Users\\santhoshg\\Desktop\\Eclipse\\screenshot2.png");

throw new io.cucumber.java.PendingException();
}

	@Given("Navigate to the PIM tab")
	public void navigate_to_the_pim_tab() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
		throw new io.cucumber.java.PendingException();
	}

	@When("Click on the Add button")
	public void click_on_the_add_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
		throw new io.cucumber.java.PendingException();
	}

	@Then("Enter the <FirstName> and <LastName>")
	public void enter_the_santhosh_and_g(String FirstName,String LastName ) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("firstName")).sendKeys(FirstName);
		driver.findElement(By.id("lastName")).sendKeys(LastName);
		throw new io.cucumber.java.PendingException();
	}


	@Then("Click Saves button")
	public void click_saves_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(" //input[@id='btnSave']")).click();
		throw new io.cucumber.java.PendingException();
	}

	@Given("Navigate to the Home page tab")
	public void Hometab() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement menulog=driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
		menulog.click();
		throw new io.cucumber.java.PendingException();
	}

	@When("Click on username")
	public void select_the_job_title_and_location() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement logout = driver.findElement(By.xpath("//a[@id='welcome']" ));
		logout.click();
		throw new io.cucumber.java.PendingException();
	}

	@Then("Logging out the application")
	public void Logout() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement logout1 = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		logout1.click();
		 driver.quit();
		throw new io.cucumber.java.PendingException();
	}
}

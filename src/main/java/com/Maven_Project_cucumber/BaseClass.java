package com.Maven_Project_cucumber;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;// null

	// browser launch

	public static WebDriver browserLaunch(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();

			driver.manage().window().maximize();
		}

		else if (browsername.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

		}

		return driver;

	}

	// get

	public static void launchUrl(String url) {

		driver.get(url);

	}

	// close

	public static void closeBrowser() {

		driver.close();

	}

	// quit

	public static void quitBrowser() {

		driver.quit();

	}

	// SendKeys

	public static void passInput(WebElement element, String input) {

		element.sendKeys(input);

	}

	// click

	public static void clickOnElement(WebElement element) {

		element.click();

	}

	// screenshot

	public static void screenshotMethod(String location) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(location);
		FileUtils.copyFile(src, dest);

	}

	// Implicit wait

	public static void implicitWaitMethod(int time) {

		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

	}

	// scroll
	public static void scrollFunction(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	// Navigate to
	public static void navigateto(String url) {

		driver.navigate().to(url);

	}

	// navigate back
	public static void navigateback() {

		driver.navigate().back();

	}

	// navigate forward
	public static void navigateforward() {

		driver.navigate().forward();

	}

	// navigate refresh
	public static void navigaterefresh() {

		driver.navigate().refresh();

	}

	// alert
	public static void alert(String input) {

		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().sendKeys(input);
		driver.switchTo().alert().getText();

	}

	// dropdown
	public static void dropdown(WebElement element, String input) {

		Select s = new Select(element);
		s.selectByValue(input);

	}

	// dropdown
	public static void dropdown1(WebElement element, String input) {

		Select s = new Select(element);
		s.selectByVisibleText(input);

	}

}

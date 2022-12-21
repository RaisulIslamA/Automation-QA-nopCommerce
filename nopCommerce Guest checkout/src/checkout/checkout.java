package checkout;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class checkout {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Downloads\\chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://training.nop-station.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.header-menu > ul.top-menu.notmobile > li:nth-child(6) > a")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div.side-2 > div.block.block-category-navigation > div.listbox > ul > li.active.last > ul > li:nth-child(2) > a")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div.center-2 > div > div.page-body > div.products-container > div.products-wrapper > div.product-grid > div > div:nth-child(3) > div > div.details > h2 > a")).click();
		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(5000);
		driver.findElement(By.id("product_enteredQuantity_20")).clear();
		
		driver.findElement(By.id("product_enteredQuantity_20")).sendKeys("2");
		
		driver.findElement(By.id("add-to-cart-button-20")).click();
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("#topcartlink > a")).click();
		Thread.sleep(4000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(4000);
		driver.findElement(By.name("termsofservice")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("checkout")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > div.customer-blocks > div.new-wrapper.checkout-as-guest-or-register-block > div.buttons > button.button-1.checkout-as-guest-button")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("BillingNewAddress.FirstName")).sendKeys("Mr.A");
		driver.findElement(By.name("BillingNewAddress.LastName")).sendKeys("B");
		driver.findElement(By.name("BillingNewAddress.Email")).sendKeys("bugfind2020@gmail.com");
		driver.findElement(By.name("BillingNewAddress.Company")).sendKeys("Company-1");
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_CountryId\"]")); 
	    Select sel = new Select(element);
	    sel.selectByVisibleText("Bangladesh");
	    Thread.sleep(2000);
	    
	    WebElement element1 = driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_StateProvinceId\"]"));
	    Select sel1 = new Select(element1);
	    sel1.selectByVisibleText("ঢাকা");
	    
	    driver.findElement(By.name("BillingNewAddress.City")).sendKeys("Road-1, House-5, Flat-A4, Mirpur, Dhaka");
	    Thread.sleep(2000);
	    driver.findElement(By.name("BillingNewAddress.Address1")).sendKeys("Road-1, House-5, Flat-A4, Mirpur, Dhaka");
	    Thread.sleep(2000);
	    driver.findElement(By.name("BillingNewAddress.Address2")).sendKeys("Road-1, House-5, Flat-A5, Mirpur, Dhaka");
	    Thread.sleep(2000);
	    driver.findElement(By.name("BillingNewAddress.ZipPostalCode")).sendKeys("1008");
	    Thread.sleep(2000);
	    driver.findElement(By.name("BillingNewAddress.PhoneNumber")).sendKeys("+99081008");
	    Thread.sleep(2000);
	    driver.findElement(By.name("BillingNewAddress.FaxNumber")).sendKeys("52008");
	    Thread.sleep(2000);
	    driver.findElement(By.name("save")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"shipping-methods-form\"]/ul/li[2]/div[1]/label")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"payment-method-block\"]/li[2]/div/div[2]/label")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/button")).click();
	    Thread.sleep(6000);
	    
	    WebElement elementvisa = driver.findElement(By.xpath("//*[@id=\"CreditCardType\"]")); 
	    Select selvisa = new Select(elementvisa);
	    selvisa.selectByVisibleText("Visa");
	    Thread.sleep(3000);
	    
	    driver.findElement(By.name("CardholderName")).sendKeys("Mr.A");
	    Thread.sleep(2000);
	    driver.findElement(By.name("CardNumber")).sendKeys("1008521000000000000000");
	    Thread.sleep(2000);
	    
	    WebElement element5 = driver.findElement(By.xpath("//*[@id=\"ExpireMonth\"]")); 
	    Select sel5 = new Select(element5);
	    sel5.selectByValue("11");
	    Thread.sleep(5000);
	    
	    WebElement element6 = driver.findElement(By.xpath("//*[@id=\"ExpireYear\"]")); 
	    Select sel6 = new Select(element6);
	    sel6.selectByValue("2022");
	    Thread.sleep(5000);
	    
	    driver.findElement(By.name("CardCode")).sendKeys("5010");
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/button")).click();
	    Thread.sleep(4000);
	    
	    driver.close();
	}

}

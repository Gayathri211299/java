package org.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelperClass {

	public static WebDriver driver;
	
	//1.
	public static void launchEdge() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	//2.
	public static void loadUrl(String url) {
		driver.get(url);
	}
	//3.
	public static void winMax() {
		driver.manage().window().maximize();
	}
	//4.
	public static void printTitle() {
		System.out.println(driver.getTitle());
	}
	//5.
	public static void printCurrentUrl() {
		System.out.println(driver.getCurrentUrl());
	}
	//6.
	public static void fill(WebElement ele, String value) {
		ele.sendKeys(value);
	}
	//7.
	public static void btnClick(WebElement ele) {
		ele.click();
	}
	//8.
	public static void gotvalue(WebElement ele ) {
		ele.getText(); 
	}
	//9.
	public static void useAttribute(WebElement ele) {
		ele.getAttribute("value");
		}
	
	Actions obj = new Actions(driver);
		//10.
	public static void trackHouver(WebElement ele,Actions b) {
	b.moveToElement(ele).perform();
	}
	//11.
	public static void fallTrack(WebElement ele,Actions b) {
		b.build().perform();
	}
		
	//12.
		public static void doubly (WebElement ele,Actions b) {
			b.doubleClick().perform();
		}
	//13.
		public static void clickRight(WebElement ele,Actions b) {
			b.contextClick();
		}
	//14.
		public static void jointTwoMethod(WebElement ele,Actions b) {
			b.build();
		}
	//15.
		public static void toActionMethods(WebElement ele,Actions b) {
			b.perform();
		}
		
	//16.
		public static void secondPasskey(WebElement ele,Actions b) {
			b.sendKeys("Gayathri");
		}
	//17.
		public static void passClick(WebElement ele,Actions b) {
			b.click();
		}
	//18.
		public static void specialkeys(WebElement user,Actions b) {
			b.keyDown(user,Keys.SHIFT);
		}
	//19.
		public static void passValue(WebElement pass, Actions b) {
			b.sendKeys("Gayathri");
		}
	//20.
		public static void specialRelease(WebElement txt,Actions b) {
			b.keyUp(txt,Keys.SHIFT);
		}
	//21.
		public static void ToBeAction(WebElement ele,Actions b) {
			b.build().perform();
		}
		
		
	//22.
		public static void pressDownArrow() throws AWTException {
			Robot r = new Robot();
			
		r.keyPress(KeyEvent.VK_DOWN);
		}
	//23.
		public static void releaseDownArrrow(Robot b) {
			b.keyRelease(KeyEvent.VK_DOWN);
		}
	//24.
		public static void putenter(Robot b) {
			b.keyPress(KeyEvent.VK_ENTER);
		}
	//25.
		public static void Stopenter(Robot b) {
			b.keyRelease(KeyEvent.VK_ENTER);
		}
	//26.
		public static void Next(Robot b) {
			b.keyPress(KeyEvent.VK_TAB);
		}
	//27.
		public static void Back(Robot b) {
			b.keyRelease(KeyEvent.VK_TAB);
		}
	//28.
		public static void ToPaste(Robot b) {
			b.keyPress(KeyEvent.VK_CONTROL);
		}
	//29.
		public static void SomeValue (Robot b) {
			b.keyRelease(KeyEvent.VK_TAB);
		}
	
		// Method 27
					public static void Todismiss(){
						Alert a =driver.switchTo().alert();
						a.dismiss();		
					}
		                                   // Method 28
					public static void Tosendwords (String value){
						Alert a =driver.switchTo().alert();
						a.sendKeys(value);
						a.accept();
					}	

					// Method 29
					public static void getAlText(String value){
						Alert a =driver.switchTo().alert();
						String text = a.getText();
						System.out.println("Alert Text : "+text);
					}
					
					// Method 30
					public static void ToSelectByValue(WebElement ele, String value){
						Select s = new Select(ele);
						s.selectByValue(value);
					}
					
					// Method 31
					public static void ToSelectByIndex(WebElement ele, int index){
						Select s = new Select(ele);
						s.selectByIndex(index);
					}
		                          		// Method 32
					public static void ToSelectByVisibleText(WebElement ele, String text){
						Select s = new Select(ele);
						s.selectByVisibleText(text);
					}

					// Method 33
					public static void ToDeSelectByValue(WebElement ele, String value){
						Select s = new Select(ele);
						s.deselectByValue(value);
					}
					
					// Method 34
					public static void ToDeSelectByIndex(WebElement ele, int index){
						Select s = new Select(ele);
						s.deselectByIndex(index);
					}
					
					// Method 35
					public static void ToDeSelectByVisibleText(WebElement ele, String text){
						Select s = new Select(ele);
						s.deselectByVisibleText(text);
					}

					// Method 36
					public static void ToDeSelectAll(WebElement ele){
						Select s = new Select(ele);
						s.deselectAll();
					}
					
					// Method 37
					public static void checkMultiDropdown(WebElement ele){
						Select s = new Select(ele);
						boolean c = s.isMultiple();
						System.out.println("Multi Select Drop or not : "+c);
					}

					// Method 38
					public static void getDropdownOptions(WebElement ele){
						Select s = new Select(ele);
						System.out.println("Dropdown Options");
						List<WebElement> li = s.getOptions();
						for(WebElement e : li) {
						String text = e.getText();	
						System.out.println(text);
						}
					}

					// Method 39
					public static void getDropdownSelectedOptions(WebElement ele){
						Select s = new Select(ele);
						System.out.println("All Selected Options");
						List<WebElement> li = s.getAllSelectedOptions();
						for(WebElement e : li) {
						String text = e.getText();	
						System.out.println(text);
						}
					}			

					// Method 40
					public static void firstSelectedDropdownOption(WebElement ele){
						Select s = new Select(ele);
						System.out.println("First Selected Option");
						WebElement first = s.getFirstSelectedOption();
						String text = first.getText();	
						System.out.println(text);
					}
					
					// Method 41
					public static void gotoFrameByNameOrId(String nameOrId){			
						driver.switchTo().frame(nameOrId);
					}

					// Method 42
					public static void gotoFrameByIndex(int index){			
						driver.switchTo().frame(index);
					}

					// Method 43
					public static void gotoFrameByElement(WebElement ele){			
						driver.switchTo().frame(ele);
					}
					// Method 44
					public static void gotoParentFrame(){			
						driver.switchTo().parentFrame();
					}

					// Method 45
					public static void gotoMainHtml(){			
						driver.switchTo().defaultContent();
					}
					
					// Method 46
					// arugument passed can be url or title or windowsId
					public static void gotoWindow(String value){			
						driver.switchTo().window(value);
					}			

					// Method 47
					public static String getParentId(){			
						return driver.getWindowHandle();
					}

					// Method 48
					public static Set<String> getAllWindowIds(){			
						return driver.getWindowHandles();
					}

					// Method 49
					public static void gotoChildWindow(){			
						String parentId = driver.getWindowHandle();
						Set<String> allIds = driver.getWindowHandles();
						//switch to child window
						for(String eachId : allIds)
						{
							if(!parentId.equals(eachId))
								driver.switchTo().window(eachId);
						}
					}

					// Method 50
					public static void gotParticularWindow(int index){			
						Set<String> allIds = driver.getWindowHandles();
						//switch to particular window
						int count = 1;
						for(String eachId : allIds)
						{
							if(count == index)
								driver.switchTo().window(eachId);
						}
					}

					// Method 51
					public static void gotWindowUsingList(int index){			
						Set<String> allIds = driver.getWindowHandles();
						List<String> li = new ArrayList<String>();
						li.addAll(allIds);
						//switch to particular window
						driver.switchTo().window(li.get(index));
					}
					
					// Method 52
					//get number of rows in a table
					public static int getTableRowsCount(WebElement table){		
						List<WebElement> rows = table.findElements(By.tagName("tr"));
						return rows.size();
					}
					
					// Method 53
					//print all rows in a table
					public static void printTableRows(WebElement table){		
					List<WebElement> rows = table.findElements(By.tagName("tr"));
					for(int i=0; i<rows.size();i++){
						WebElement data = rows.get(i);
						System.out.println(data.getText());
		                                }
			}


					// Method 54
					//print all rows in a table
					public static void printAllTableDate(WebElement table){		
						List<WebElement> content = table.findElements(By.tagName ("td"));
						
						for(WebElement text : content)
						{
							System.out.println(text.getText());
						}
					}

					// Method 55
					//get number of rows in a table
					public static int getTableCloumCount(WebElement table){		
						List<WebElement> headings = table.findElements(By.tagName("th"));
						return headings.size();
					}

					// Method 56
					//print all headings in a table
					public static void printTableHeadings(WebElement table){		
						List<WebElement> headings = table.findElements(By.tagName("th"));
						for(int i=0; i< headings.size();i++)
						{
							WebElement data = headings.get(i);
							System.out.println(data.getText());
			            }

					}

					// Method 57
					//print particular row data in a table
					public static void printOneTableRow(WebElement table, int rowNo){		
					List<WebElement> rows = table.findElements(By.tagName("tr"));
					for(int i=1; i<=rows.size();i++)
					{
						if(i==rowNo) {
						WebElement data = rows.get(i);
						System.out.println(data.getText());
						}
					}
					}

					// Method 58
					public static void makeWinFullScreen(){		
						driver.manage().window().maximaize();
					}

					// Method 59
					public static void clickandHoldElement(WebElement ele){		
						Actions a = new Actions(driver);
						a.clickAndHold(ele);
					}
					
					// Method 60
					public static void navigateToAPage(String url){
						driver.navigate().to(url);
					}

					// Method 61
					public static void  TonavigateBack(){
						driver.navigate().back();
					}
					
					// Method 62
					public static void TonavigateForward(){
						driver.navigate().forward();
					}
					


					// Method 63
					public static void navigateToAPageandBack(String url){
						driver.navigate().to(url);
						driver.navigate().back();
					}

					// Method 64
					public static void navigateToAPageBackFwd(String url){
						driver.navigate().to(url);
						driver.navigate().back();
						driver.navigate().forward();
					}

					// Method 65
					public static void refreshPage(){
						driver.navigate().refresh();
					}
					
					// Method 66
					//wait for all locators of a page to load
					public static void waitToLoadAllLocators(int sec){
						driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
					}
					
					// Method 67
					//wait for particular locators to load, time in seconds, interval 500 ms deafult
					//switch to frame when the title contains the value mentioned
					public static void waitUntilTitleContains(int sec, String title, String frameId){
						WebDriverWait w = new WebDriverWait(driver, duration ofsec(20));
						w.until(ExpectedConditions.titleContains(title));
						driver.switchTo().frame(frameId);
					}			
					
					// Method 68
					//wait for particular locators to load, time in seconds, interval 500 ms deafult
					//switch to frame when the frame is available
					public static void waitUntilFrameIsAvaible(int sec, String title, String frameId){
						WebDriverWait w = new WebDriverWait(driver, sec);
						w.until(ExpectedConditions.frameToAvailableSwitchTo(By.id(frameId)));
						driver.switchTo().frame(frameId);
					}
					// Method 69
					//wait for particular locators to load, time in seconds, interval 500 ms deafult
					//switch to frame when the frame is available
					public static void waitUntilElementIsClickable(int sec, String elementId){
							WebDriverWait w = new WebDriverWait(driver, sec);
							w.until(ExpectedConditions.elementToBeClickable(By.id(elementId)));
							WebElement button = driver.findElement(By.id(elementId));
							button. Click();
					}
					
					//Method 70
					//wait for particular locators to load, time in milliseconds or macroseconds,interval-user given
					//switch to frame when the title contains the value mentioned
					public static void waitWithIntervalMentioned(int millisec, int interval,String title, String frameId){
						FluentWait<WebDriver> f = new FluentWait<WebDriver> (driver)
								.withTimeout(millisec, TimeUnit.SECONDS).pollingEvery(interval, TimeUnit.MILLISECONDS)
								.ignoring(Throwable.class);
						f.until(ExpectedConditions.titleContains(title));
						driver.switchTo().frame(frameId);
		}
		                
		                 Method 71
		                                        public static void Getcell(Cell c) {
				                         Cell c = row.getCell(cellNumber);
			}
			// Method 72
			public static void Togetcell(int cellType) {
				   c.getCellType();
			}
			// Method 73
			public static void Togetdatecell(int DatecellType) {
				   c.getDateCellValue();
			}
			// Method 74
			public static void Tonumcell(double GetNumericCellValue) {
				   c.GetNumericCellValue();
			}
		           // Method 75
			public static void valueOf(String valueof) {
				   String.valueOf();
			}
			
			}
		}




		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

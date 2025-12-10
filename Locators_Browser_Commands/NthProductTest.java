  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.flipkart.com/");
	  
	  driver.findElement(By.name("q")).sendKeys("laptop",Keys.ENTER);
	  
	  List<WebElement> list = driver.findElements(By.className("RG5Slk"));
	  
	  System.out.println("\n\n\n ----------------------------------");
	  for(WebElement li:list) {
		  System.out.println(li.getText());
	  }
	  
	  System.out.println("\nTotal = " + list.size() + "\n7th Laptop name is = " + list.get(6).getText() + "\n");

	  Thread.sleep(2000);
	  driver.quit();

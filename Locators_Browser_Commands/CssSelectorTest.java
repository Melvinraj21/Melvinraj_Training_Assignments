WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://lms2.ai.saveetha.in/");
	  
	  Thread.sleep(2000);
	  System.out.println("\n\nClass output = " + driver.findElement(By.cssSelector(".forumnodiscuss")).getText());
	  System.out.println("ID output = " + driver.findElement(By.cssSelector("#instance-30303-header")).getText());
	  
	  Thread.sleep(2000);
	  driver.quit();

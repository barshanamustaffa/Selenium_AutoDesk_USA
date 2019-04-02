package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewOrganization {
	
	    @FindBy(linkText="Organizations")
	    WebElement Organizations;
		@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
		WebElement createorg;
		@FindBy(xpath="//input[@class='detailedViewTextBox' and @name='accountname']")
		WebElement orgname;
		@FindBy(xpath="//input[@class='detailedViewTextBox' and @name='website']")
		WebElement website;
		@FindBy(xpath="//input[@class='detailedViewTextBox' and @name='tickersymbol']")
		WebElement ticker;
		@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
		WebElement button;
		@FindBy(linkText="ORphanage homes")
		WebElement selorg;
		@FindBy(xpath="//input[@type='radio' and @value='T']")
		WebElement radio;
		@FindBy(xpath="//input[@class='crmbutton small save']")
		WebElement save;
		
		
		
		public void createOrganization()
		{
			  createorg.click();
              orgname.sendKeys("Organization1");		
              website.sendKeys("www.organ.com");
              ticker.sendKeys("23");
             
              radio.click();
              save.click();
		}}
		
		
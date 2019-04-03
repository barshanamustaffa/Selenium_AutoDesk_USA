package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.commonLib.BaseClass;
import com.crm.commonLib.FileLib;
import com.crm.organizationtest.OrganizationTest;

public class CreateNewOrganization extends OrganizationTest{
	
	  
	
		@FindBy(xpath="//input[@class='detailedViewTextBox' and @name='accountname']")
		WebElement orgname;
		
		@FindBy(xpath="//input[@class='detailedViewTextBox' and @name='website']")
		WebElement website;
		
		@FindBy(xpath="//input[@class='detailedViewTextBox' and @name='tickersymbol']")
		WebElement ticker;
		
		@FindBy(xpath="//input[@type='radio' and @value='T']")
		WebElement radio;
		
		@FindBy(xpath="//input[@class='crmbutton small save']")
		WebElement save;
		
		
		
		
		public WebElement getOrgname() {
			return orgname;
		}



		public void setOrgname(WebElement orgname) {
			this.orgname = orgname;
		}



		public WebElement getWebsite() {
			return website;
		}



		public void setWebsite(WebElement website) {
			this.website = website;
		}



		public WebElement getTicker() {
			return ticker;
		}



		public void setTicker(WebElement ticker) {
			this.ticker = ticker;
		}



		public WebElement getRadio() {
			return radio;
		}



		public void setRadio(WebElement radio) {
			this.radio = radio;
		}



		public WebElement getSave() {
			return save;
		}



		public void setSave(WebElement save) {
			this.save = save;
		}



		public void createOrganization(String Orgname,String web,String tick)
		{
			
              orgname.sendKeys(Orgname);		
              website.sendKeys(web);
              ticker.sendKeys(tick);
              radio.click();
              save.click();
		}}
		
		
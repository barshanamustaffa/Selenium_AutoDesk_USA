package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrganizationPage {
	@FindBy(linkText="Organizations")
    WebElement Org;
	
	
	public void navigateToOrgPage() {
		Org.click();
	}
}

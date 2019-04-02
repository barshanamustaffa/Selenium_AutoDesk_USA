package com.crm.organizationtest;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.crm.commonLib.BaseClass;

import com.crm.objectRepository.CreateNewOrganization;
import com.crm.objectRepository.Home;
import com.crm.objectRepository.OrganizationPage;

public class OrganizationTest extends BaseClass{
	@Test
	public void createOrganizationTest() throws Throwable{
		
	
	 /* navigate to organization */
		Home home = PageFactory.initElements(driver, Home.class);
		home.navigateToCampaign();
	/* navigate to organization page */	
		OrganizationPage orgpage =PageFactory.initElements(driver,OrganizationPage.class);
		orgpage.navigateToOrgPage();
     /* navigate to create organization*/
		CreateNewOrganization org= PageFactory.initElements(driver,CreateNewOrganization.class);
		org.createOrganization();
		
	}

}

		
		
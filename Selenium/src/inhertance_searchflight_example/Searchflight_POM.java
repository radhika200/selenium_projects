package inhertance_searchflight_example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchflight_POM 
{
	

	public Searchflight_POM(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
@FindBy(xpath = "//h1[contains(.,'Search flights')]") public WebElement search_flight_lable;
	
	@FindBy(xpath="//input[@id='OneWay']") public WebElement one_way_btn;
	@FindBy(xpath="//strong[contains(.,'One way')]") public WebElement oneway_label;
	
	
	@FindBy(xpath="//input[@id='RoundTrip']") public WebElement return_btn;
	@FindBy(xpath = "(//strong[contains(.,'Round trip')])[1]") public WebElement return_lable;
	
	@FindBy(xpath="//input[@id='MultiCity']") public WebElement multi_btn;
	
	@FindBy(xpath = "//input[@id='FromTag']") public WebElement from_EB;
	@FindBy(xpath = "//a[@tabindex='-1'][contains(.,'Hyderabad, IN - Rajiv Gandhi International (HYD)')]") public WebElement hyd_city;
	
	@FindBy(xpath = "//input[@id='ToTag']") public WebElement to_EB;
	@FindBy(xpath = "//a[contains(@id,'ui-id-13')]") public WebElement del_city;
	
	@FindBy(xpath = "(//a[@class='ui-state-default '][contains(.,'22')])[1]") public WebElement DP;
	
	@FindBy(xpath = "//input[contains(@id,'SearchBtn')]") public WebElement search_btn;
	
	@FindBy(xpath = "//div[contains(@id,'homeErrorMessage')]") public WebElement error_message_displayed;
	
	//methodname search_flight
	
	public void flight_search_one_way_trip()
	{
		if(!one_way_btn.isSelected())
			one_way_btn.click();
		
		from_EB.clear();
		from_EB.sendKeys("hyd");
		hyd_city.click();
		
		to_EB.clear();
		to_EB.sendKeys("del");
		del_city.click();
		
		DP.click();
		search_btn.click();
	}
	
	public void flight_search_return__trip()
	{
		if(!return_btn.isSelected())
			return_btn.click();
		
		from_EB.clear();
		from_EB.sendKeys("hyd");
		hyd_city.click();
		
		to_EB.clear();
		to_EB.sendKeys("del");
		del_city.click();
	}
	
	public String exp_header="Search flights";
	public String exp_error_mess="Sorry, but we can't continue until you fix everything that's marked in ";
	
	    public void page_header_visibility()
	{
		if(search_flight_lable.isDisplayed())
			System.out.println("header visible at webpage");
		else
			System.out.println("header not visible at webpage");
	}
	 
	    public void verify_exp_header_visibility()
	{
	    		String run_time_header_text=search_flight_lable.getText();
	    	if(run_time_header_text.equals(exp_header))
	    		System.out.println("expected header is visible at web page");
	    	else
	    		System.out.println("expected header is not visible at web page");
	 }
	    public void verify_exp_error_visibility()
	 {
	    	String run_time_error_mess=error_message_displayed.getText();
	    	if(run_time_error_mess.equals(exp_error_mess))
	    		System.out.println("expected error is visible at web page");
	    	else
	    		System.out.println("expected error is not visible at web page");
	  }
	
	
	
}



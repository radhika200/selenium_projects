package inhertance_searchflight_example;

public class Extend_repository extends Repository

{
	Searchflight_POM flight;
	
	public void testcase1_launchbrowser()
	{
		lauch_browser("chrome");
	    flight=new Searchflight_POM(driver);
		load_app("https://www.cleartrip.com/flights");
		set_timeout(15);
	}
	
	public void testcase2_flightsearch_one_way()
	{
	    flight.flight_search_one_way_trip();
	}
	public void testcase3_flightsearch_return()
	{
		flight.flight_search_return__trip();;
	}
	
	

}

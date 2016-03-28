package com.stratio.assertions;

import com.stratio.specs.CommonG;
import com.stratio.tests.utils.PreviousWebElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Assertions extends org.assertj.core.api.Assertions {
	/**
	 * Check if two WebElements are equals.
	 * 
	 * @param actual
	 * @return SeleniumAssert
	 */
	public static SeleniumAssert assertThat(WebElement actual) {
		return new SeleniumAssert(actual);
	}

	public static SeleniumAssert assertThat(PreviousWebElements actualList) {
		return new SeleniumAssert(actualList.getPreviousWebElements());
	}
	
	
	/**
	 * Check if two WebDrivers are equals.
	 * 
	 * @param actual
	 * @return SeleniumAssert
	 */
	public static SeleniumAssert assertThat(WebDriver actual) {
		return new SeleniumAssert(actual);
	}

	
	public static SeleniumAssert assertThat(CommonG common, WebDriver actual) {
	    return new SeleniumAssert(common, actual);
	}
	
	public static SeleniumAssert assertThat(CommonG common, WebElement actual) {
	    return new SeleniumAssert(common, actual);
	}
	
	public static SeleniumAssert assertThat(CommonG common, List<WebElement> actual) {
	    return new SeleniumAssert(common, actual);
	}
	
	public static SeleniumAssert assertThat(CommonG common, PreviousWebElements actual) {
	    return new SeleniumAssert(common, actual);
	}
	
	public static SeleniumAssert assertThat(CommonG common, boolean actual) {
	    return new SeleniumAssert(common, actual);
	}
	
	public static SeleniumAssert assertThat(CommonG common, String actual) {
	    return new SeleniumAssert(common, actual);
	}
	
}

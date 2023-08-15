package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FormTest  extends BaseTest{
    @Test
    public void formTest(){
        homePage.open();

        homePage.create();

        homePage.accordionCreate();

        homePage.clickButtonEnter();



       assertTrue(homePage.isPageOpen());



}}

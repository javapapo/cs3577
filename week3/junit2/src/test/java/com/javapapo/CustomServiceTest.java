package com.javapapo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static  org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Optional;

public class CustomServiceTest {

  private CustomService customService;

  @BeforeClass
  public static void beforeTest(){
    System.out.println("Starting CustomerServiceTest");
  }

  @AfterClass
  public static void afterTest(){
    System.out.println("Ending CustomerServiceTest");
  }

  @Before
  public void initTestCase(){
    customService= new CustomService();
  }

  @After
  public void afterTestCase(){
    System.out.println("End of Test");
  }
  /**
   * I test {@linkplain CustomService#concatStrings(String, String)} passing null params
   */
  @Test
  public void testAnyOneParamIsNull(){
    //if one of them is null
    Optional<String> result =customService.concatStrings("hello",null);

    Assert.assertTrue(result.isPresent());
    assertThat(result.get(),is(equalTo("hello")));
  }


  /**
   * I test {@linkplain CustomService#concatStrings(String, String)} passing both null params
   */
  @Test(expected=IllegalArgumentException.class)
  public void testBothParamsArenull(){
    Optional<String> result =customService.concatStrings(null,null);

  }
}

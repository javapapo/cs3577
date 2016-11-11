package com.javapapo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import static org.hamcrest.CoreMatchers.is;

@RunWith(Parameterized.class)
public class SecondCustomServiceTest {

  private CustomService customService;

  @Before
  public void initTestCase(){
    customService= new CustomService();
  }

  @Parameters
  public static Collection<Object[]> data () {
    return Arrays.asList(new Object[][]{
        {0, 0, 0}, {1, 1, 2}
    });
  }

  private int first;
  private int second;
  private int expected;

  public SecondCustomServiceTest (int firstInput, int secondInput, int theExpected) {
    first = firstInput;
    second = secondInput;
    expected = theExpected;
  }

  @Test
  public void testAdding2Numbers () {
    //if one of them is null
    Optional<Integer> result = customService.addNums(first, second);
    Assert.assertTrue(result.isPresent());
    Assert.assertThat(expected, is(result.get()));
  }

  @Ignore("not ready yet")
  @Test
  public void aTempTest () {
    //TODO
  }
}

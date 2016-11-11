package com.javapapo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    CustomServiceTest.class,
    SecondCustomServiceTest.class,
})

public class CustomServiceSuite {
}

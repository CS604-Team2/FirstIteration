package de.vogella.junit.first;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ MyClassTest.class })
public class AllTests {
} 
//If you have several tests you can combine them into a test suite. 
//Running a test suite will execute all tests in that suite. 
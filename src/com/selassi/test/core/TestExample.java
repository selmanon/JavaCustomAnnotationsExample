package com.selassi.test.core;
 
import com.selassi.test.core.Test;
import com.selassi.test.core.TesterInfo;
import com.selassi.test.core.TesterInfo.Priority;
 
@TesterInfo(
	priority = Priority.HIGH, 
	createdBy = "mkyong.com",  
	tags = {"sales","test" }
)
public class TestExample {
 
	@Test
	void testA() {
	  if (true)
		throw new RuntimeException("This test always failed");
	}
 
	@Test(enabled = false)
	void testB() {
	  if (false)
		throw new RuntimeException("This test always passed");
	}
 
	@Test(enabled = true)
	void testC() {
	  if (10 > 1) {
		// do nothing, this test always passed.
	  }
	}
 
}
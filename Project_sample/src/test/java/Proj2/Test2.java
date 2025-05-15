package Proj2;

import org.testng.annotations.Test;

public class Test2 {

	
	@Test
	 public void perform3() {
		
		String url=System.getProperty("url");
		String browser=System.getProperty("browser");
		System.err.println(url+" "+browser);
		 System.out.println("finally");
	 }
	 
	 @Test
	 public void perform4() {
		 System.out.println("yahoooooo");
	 }
}

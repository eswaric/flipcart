package maven;

import org.testng.annotations.Test;

public class FristProject {
	@Test(priority=1)
	public void tMethod1() {
		System.out.println("dispaly the tMethod1");
		
	}
	@Test(priority=2)
	public void tMethod2() {
		System.out.println("dispaly the tMethod2");
		
	}

}

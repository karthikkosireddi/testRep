import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnit2 {
	@Before // Gets executed before every test
	public void myBeforeTest() {
		System.out.println("This is BEFORE my Test");
	}
	
	@Test // This is one of my tests 
	public void myTest1() {
		System.out.println("This is My Test1 ");
	}
	
	@Test // This is one of my tests 
	public void myTest2() {
		System.out.println("This is My Test2 ");
	}
	
	@Test // This is one of my tests 
	public void myTest3() {
		System.out.println("This is My Test3 ");
	}
	
	@Test // This is one of my tests 
	public void myTest4() {
		System.out.println("This is My Test4 ");
	}
	
	@After // This gets executed after each test
	public void myAfterTest() {
		System.out.println("This is After my Test");
	}
}

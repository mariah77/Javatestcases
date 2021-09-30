
import static org.junit.Assert.*;

import org.junit.AfterClass;
//import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
//import org.junit.experimental.categories.Category;



public class StackTests {
	public static int size;
	public static Mystack m;
	public static Stackwitharray s1;
	public static Stackwithlinkedlist s2;
    @BeforeClass
    public static void init() {
    	size = 5;
    	m = new Mystack(size);
    	s1 = new Stackwitharray();
    	s2 = new Stackwithlinkedlist();
    }
	@Test//(expected = Exception.class)
	public void test1() {
		for(int i = 1; i<size+4; i++ )
			try {
				m.push(i);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		m.displayStack();
		try {
			assertEquals(5,m.top());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(int i = m.size(); i>=1; i--) {
			try {
				assertEquals(i,m.pop());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			m.pop();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Before
	public void in() {
		Stackwitharray.display();
		for(int i= 0; i<102; i++) {
			Stackwitharray.push(i);
		}
		 Stackwitharray.display();
	}
	@Test
	public void test2() {
		
		 for(int i =99; i>=0; i--) {
			 assertEquals(i,Stackwitharray.pop());
		 }
		 Stackwitharray.pop();
	}
	
	@Test
	public void test3() {
		Stackwithlinkedlist.top();
		Stackwithlinkedlist.pop();
		Stackwithlinkedlist.display();
		for(int i = 0; i<5; i++) {
			Stackwithlinkedlist.push(i);
		}
		
		Stackwithlinkedlist.display();
		for(int i = Stackwithlinkedlist.getSize()-1; i>=0; i--) {
			assertEquals(i,Stackwithlinkedlist.pop());
		}
	}
	@AfterClass
	public static void destructor() {
		size = 0;
		m = null;
	     s1 = null;
		 s2 = null;
	}
   
    
}


import static org.junit.Assert.*;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
//import org.junit.experimental.categories.Category;


public class QueueTests {
    public static int size;
	public static Queue q1;
	public static Dequeue d;
	public static Queuewitharray q2;
	public static Queuewithlinkedlist q3;
    
    @BeforeClass
    public static void init() {
    	size = 5;
    	q1 = new Queue(size);
    	d = new Dequeue(size);
    	q2 = new Queuewitharray(size);
    	q3 = new Queuewithlinkedlist();
    }
	@Test
	public void test1() {
		assertTrue(q1.empty());
		
		//System.out.println(q1.size());
		for(int i =0; i<6;i++) {
		  try {
			q1.enqueue(i);
		    } catch (Exception e) {
			e.printStackTrace();
	     	}
		}
		q1.display();
		for(int i =0; i<5; i++) {
			try {
				assertEquals(i,q1.dequeue());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		assertEquals(0,q1.size());
	}
	@Test
	public void test2() {
		for(int i = 0; i<5; i++) {
			if(i%2 == 0) {
			  d.addLeft(i);
			}
			else {
				d.addRight(i);
			}
		}
		d.display();
		int[] a = {0,2,4,3,1};
		int[] array= d.array;
		for(int i =0; i<d.capacity;i++) {
			
				assertEquals(a[i],array[i]);
			
		}
		
		
	}
	@Test
	public void test3() {
		Queuewitharray.display();
		assertEquals(-1,Queuewitharray.dequeue());
		for(int i =0; i<6; i++) {
			Queuewitharray.enqueue(i);
		}
		int x = Queuewitharray.dequeue();
		assertEquals(0,x);
		Queuewitharray.enqueue(5);
		Queuewitharray.display();
		for(int i =0; i<5; i++) {
			assertEquals(i+1,Queuewitharray.dequeue());
		}
		
	}
	@Test
	public void test4() {
		Queuewithlinkedlist.display();
		for(int i= 0; i<6; i++) {
			Queuewithlinkedlist.enqueue(i);
		}
		Queuewithlinkedlist.display();
		for(int i= 0; i<6; i++) {
			assertEquals(i,Queuewithlinkedlist.dequeue());
		}
		
		Queuewithlinkedlist.dequeue();
		assertNull(Queuewithlinkedlist.head);
		
	}
	@AfterClass
	public static void destructor() {
	    size=0;
		q1 = null;
		d = null;
		q2 = null;
		q3 = null;
	}

}


import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
//import org.junit.experimental.categories.Category;

//@Category(LinkedListInterface.class)
public class LinkedListTests {
    public static LinkedList l1;
    public static LinkedList2 l2;
    public static LinkedList3 l3;
    public static CircularLinkedList c;
    @BeforeClass
    public static void init() {
    	l1 = new LinkedList();
    	//populating list for testing
    	LinkedList.pushBack(1);
    	LinkedList.pushBack(2);
    	LinkedList.pushBack(3);
    	LinkedList.pushBack(4);
    	LinkedList.pushBack(5);
    	
    	l2 = new LinkedList2();
    	//populating list for testing
    	LinkedList2.pushBack(10);
    	LinkedList2.pushBack(11);
    	LinkedList2.pushBack(12);
    	LinkedList2.pushBack(13);
    	LinkedList2.pushBack(14);
    	
    	l3 = new LinkedList3();
    	//populating list for testing
    	
    	l3.add(0);
    	l3.add(21);
    	l3.add(22);
    	l3.add(24);
    	l3.add(25);
    	l3.add(26);
    	
    	c = new CircularLinkedList();
    	
    	
    	
    	
    }
	@Test
	public void test1() {
		
		
		
		LinkedList.pushBack(7);
		int x = LinkedList.popBack();
		assertEquals(7,x);
		LinkedList.pushFront(7);
		LinkedList.display();
		x = LinkedList.popFront();
		assertEquals(7,x);
        x = LinkedList.pop(0);		
		assertEquals(1,x);
		x = LinkedList.pop(2);		
		assertEquals(4,x);
		
		
	}
	@Test
	public void test2() {
		
		
		
		LinkedList2.pushFront(17);
		int x = LinkedList2.head.key;
		assertEquals(x,17);
		LinkedList2.display();
		LinkedList2.swap();
		assertEquals(14,LinkedList2.head.key);
		
	}
	@Test
	public void test3() {
		l3.display();
		assertEquals(6, l3.size());
		l3.pushFront(100);
		try {
			assertEquals(100,l3.topFront());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		l3.pushBack(45);
		try {
			assertEquals(45,l3.topBack());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		int x = 0;
		try {
			x = l3.popFront();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(100,x);
		
	}
	@Test
	public void test4() {
		CircularLinkedList.pushFront(6);
		c.popFront();
		assertNull(CircularLinkedList.head);
		CircularLinkedList.pushBack(6);
		CircularLinkedList.popBack();
		assertNull(CircularLinkedList.head);
		
		CircularLinkedList.display();
		CircularLinkedList.pushFront(7);
		CircularLinkedList.pushFront(6);
		CircularLinkedList.pushFront(18);//head
		CircularLinkedList.pushBack(8);
		CircularLinkedList.pushBack(9);
		CircularLinkedList.pushBack(10);
		CircularLinkedList.display();
		int x = 0;
		try {
			x = c.popFront();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(18,x);
		try {
			x = CircularLinkedList.popBack();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(10,x);
	}
	@AfterClass
	public static void destructor() {
		 l1 = null;
		 l2 = null;
		 l3 = null;
		 c = null;
	}

}

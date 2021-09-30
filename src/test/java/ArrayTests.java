
import org.junit.BeforeClass;


import org.junit.Test;
//import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

import org.junit.AfterClass;
//import org.junit.Assert;

//@Category(ArrayInterface.class)
public class ArrayTests {

	public static Array array ;
	public static int[] a;
	public static int[] result1;
	public static int[] result2;
	public static int size;
	@BeforeClass
	public static void constructor() {
	    array = new Array(); //create an array.
        Array.getValues();
        Array.display();
        result1 = new int[size];
        size = 10;
        a = new int[size];
        for(int i = 0; i<size; i++) {
        	a[i] = i;
        }
        result2 = new int[size];
        
        
	}

	
	@Test
	public void test1() {
		int num=100;
		while(Array.linearSearch(num)) {
		  num++;  
		}
		Array.insert(num, 2);
		//Assert.assertEquals(Array.array[2],num );
		Array.delete(2);
		assertFalse(Array.binarySearch(num, 0, Array.size-1));
		result1 = ArrayInsertion.insert(a,17 , 2);
		assertEquals(result1[2],17);
		result2 = ArrayDeletion.delete(result1, 2);
		assertTrue(result2[2]!=17);
		
		
		
	   
	}
	@Test
	public void test2() {
		Array.bubbleSort();
		
		boolean flag = false;
		for(int i =0; i<Array.size-1; i++) {
			if(Array.array[i]>Array.array[i+1]) {
				flag = true;
				break;
			}
		}
		assertFalse(flag);
			
	   
	}
	@AfterClass
	public static void destructor() {
		 array = null ;
		 a = null;
	     result1 = null;
		 result2 = null;
		 size=0;
	}

}

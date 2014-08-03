package javabigbrother.examples.duplicate;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javabigbrother.examples.duplicate.FindDuplicateObjects;

import org.junit.Assert;
import org.junit.Test;


public class FindDuplicateNumberTest {

	FindDuplicateObjects<?> number;
	
	@Test
	public void testDuplicateNumber() {
		number = new FindDuplicateObjects<BigDecimal>(createDuplicateBigDecimalList());
		findDuplicateDoubleForLoopInList();
		findDuplicateDoubleForLoopInArray();
		findDuplicateObjectInListUsingMap();
		findDuplicateObjectInListUsingArrayAndMap();
		System.out.println("");
		System.out.println("-------------- Use Object ------------");
		System.out.println("");
		number = new FindDuplicateObjects<Fruit>(duplcateFruitList());
		findDuplicateDoubleForLoopInList();
		findDuplicateDoubleForLoopInArray();
		findDuplicateObjectInListUsingMap();
		findDuplicateObjectInListUsingArrayAndMap();
	}

	private void assertDuplicateObjects(List<Object> duplicate) {
		if(duplicate.get(0) instanceof BigDecimal) {
			Assert.assertEquals(duplicate.get(0), new BigDecimal("5555"));
			Assert.assertEquals(duplicate.get(1), new BigDecimal("6555"));
		} else {
			Assert.assertEquals(duplicate.get(0), new Fruit("n" + 8876, "f" + 8876 , "c" + 8876,  8876 ));
			Assert.assertEquals(duplicate.get(1), new Fruit("n" + 9876, "f" + 9876 , "c" + 9876,  9876 ));
		}
	}
	
	private void findDuplicateObjectInListUsingMap() {
		long start = System.nanoTime();
		List<Object>  duplicate = number.findDuplicateObjectInListUsingMap();
		long end = System.nanoTime();
		Assert.assertNotNull(duplicate);
		assertDuplicateObjects(duplicate);
		System.out.println("Result Loop List and Check in Map:" + String.valueOf((end - start)/1000000000.0));
	}
	
	private void findDuplicateObjectInListUsingArrayAndMap() {
		long start = System.nanoTime();
		List<Object>  duplicate = number.findDuplicateObjectInListUsingArrayAndMap();
		long end = System.nanoTime();
		Assert.assertNotNull(duplicate);
		assertDuplicateObjects(duplicate);
		System.out.println("Result Convert List to Array and Check in Map :" + String.valueOf((end - start)/1000000000.0));
	}

	private FindDuplicateObjects<?> findDuplicateDoubleForLoopInList() {
		long start = System.nanoTime();
		List<Object> duplicate = number.findDuplicateDoubleForLoopInList();
		Assert.assertNotNull(duplicate);
		assertDuplicateObjects(duplicate);
		long end = System.nanoTime();
		System.out.println("Result Only List :" + String.valueOf((end - start)/1000000000.0));
		return number;
	}
	
	private FindDuplicateObjects<?> findDuplicateDoubleForLoopInArray() {
		long start = System.nanoTime();
		List<Object> duplicate = number.findDuplicateDoubleForLoopInArray();
		Assert.assertNotNull(duplicate);
		assertDuplicateObjects(duplicate);
		long end = System.nanoTime();
		System.out.println("Result Convert List To Array :" + String.valueOf((end - start)/1000000000.0));
		return number;
	}
	
	private List<BigDecimal> createDuplicateBigDecimalList() {
		List<BigDecimal> duplicateList = new ArrayList<BigDecimal>(10000);
		for( int i = 0 ; i < 10000; i++) {
			duplicateList.add(new BigDecimal(i + ""));
		}
		duplicateList.add(new BigDecimal("5555"));
		duplicateList.add(new BigDecimal("6555"));
		return duplicateList;
	}
	
	private List<Fruit> duplcateFruitList() {
		List<Fruit> duplicateList = new ArrayList<Fruit>();
		for( int i =0 ; i < 10000; i++) {
			duplicateList.add(new Fruit("n" + i, "f" + i , "c" + i,  i ));
		}
		duplicateList.add(new Fruit("n" + 8876, "f" + 8876 , "c" + 8876,  8876 ));
		duplicateList.add(new Fruit("n" + 9876, "f" + 9876 , "c" + 9876,  9876 ));
		return duplicateList;
	}

}

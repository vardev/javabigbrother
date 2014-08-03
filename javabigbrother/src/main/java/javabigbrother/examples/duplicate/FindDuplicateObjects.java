package javabigbrother.examples.duplicate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindDuplicateObjects <T> {
	
	private List<T> objectList;
	
	private FindDuplicateObjects() {	}
	
	public FindDuplicateObjects(List<T> list) {
		objectList = list;
	}

	public List<Object> findDuplicateDoubleForLoopInList () {
		List<Object> duplicatenumberList = new ArrayList<Object>(10000);
		for (int i = 0; i < objectList.size(); i++) {
			Object decimal = objectList.get(i);
			for (int j = i + 1; j < objectList.size(); j++) {
				Object duplicate =  objectList.get(j);
				if(decimal.equals(duplicate)) {
					duplicatenumberList.add(decimal);
				}
			}
		}
		return duplicatenumberList;
	}
	
	public List<Object> findDuplicateObjectInListUsingMap() {
        HashMap<Object, Object> map = new HashMap<Object, Object>(10000);
        List<Object> duplicatenumberList = new ArrayList<Object>(10000);
		for (Object i : objectList)  {
			
			if(map.containsKey(i)) {
				duplicatenumberList.add(i);
			} else {
				map.put(i, null);
			}
			
		}
		return duplicatenumberList;
    }
     
	

	public List<Object> findDuplicateDoubleForLoopInArray () {
		List<Object> duplicatenumberList = new ArrayList<Object>();
		Object[] objects =  objectList.toArray();
		for (int i = 0; i < objects.length; i++) {
			Object decimal = objects[i];
			for (int j = i + 1; j < objects.length; j++) {
				Object duplicate =  objects[j];
				if(decimal.equals(duplicate)) {
					duplicatenumberList.add(decimal);
				}
			}
		}
		return duplicatenumberList;
	}
	
	
	public List<Object> findDuplicateObjectInListUsingArrayAndMap(){
        HashMap<Object, Object> map = new HashMap<Object, Object>();
        List<Object> duplicatenumberList = new ArrayList<Object>();
        Object[] objects =  objectList.toArray();
        for (int i = 0; i < objects.length; i++) {
			if(map.containsKey(objects[i])) {
				duplicatenumberList.add(objects[i]);
			} else {
				map.put(objects[i], null);
			}
			
		}
		return duplicatenumberList;
    }
}


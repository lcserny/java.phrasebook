package collections;

import java.util.*;

/**
 * Created by user on 04.03.2016.
 */
public class ListProcessing
{
    public void displayResizingList()
    {
        int[] list = new int[5];
        int[] tmpList = new int[list.length + 10];
        System.arraycopy(list, 0, tmpList, 0, list.length);

        System.out.println(tmpList);
    }

    public void iteratingExample()
    {
        Collection<String> collection = new ArrayList<String>();
        collection.add("Something");
        collection.add("Something else");

        for (String text : collection) {

        }

        for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
            Object element = iterator.next();
        }

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(0, "Something");
        map.put(1, "Something else");

        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();) {
            Object element = iterator.next();
        }

        for (String text : map.values()) {

        }

        for (Map.Entry<Integer, String> iterator : map.entrySet()) {
            int key = iterator.getKey();
            String val = iterator.getValue();
        }

        List<List<List<String>>> listOfLists = new ArrayList<List<List<String>>>();
        List<List<String>> outsideList = new ArrayList<List<String>>();
        List<String> innerList = new ArrayList<String>();
        innerList.add("Something inside added");
        outsideList.add(innerList);
        listOfLists.add(outsideList);
        listOfLists.get(0).get(0).add("Something outside added");

        for (List<List<String>> iteratorList : listOfLists) {
            for (List<String> innerIteratorList : iteratorList) {
                System.out.println(innerIteratorList.get(0));
            }
        }
    }
}

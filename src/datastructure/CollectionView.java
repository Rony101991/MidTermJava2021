package datastructure;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CollectionView {

        public static void main(String[] args) {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
                HashMap<Integer, String> map = new HashMap<Integer, String>();
                map.put(1, "Dhaka");
                map.put(2, "Gazipur");
                map.put(3, "Kaligonj");
                map.put(4, "Norshingdi");
                map.put(5, "Chadpur");
                map.put(6, "Bangladesh");

                for (Map.Entry entry : map.entrySet()) {
                        System.out.println( entry.getKey() + " -> " + entry.getValue() );
                }

        }
}

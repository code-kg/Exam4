package Task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList = new ArrayList<>();
        HashSet<Integer>hashSet = new HashSet<>();
        for (int i=0;i<100;i++){
            arrayList.add(i+1);
            if (arrayList.get(i)%2!=0){
                hashSet.add(i);
            }
        }

        Iterator<Integer>iterator = hashSet.iterator();

        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.print(number + " ");
        }


    }
}

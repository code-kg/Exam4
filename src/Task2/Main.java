package Task2;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList <Person>person=new LinkedList<>();
        for (int i=0;i<10;i++){
            person.add(new Person("John", "Peterson", "Mikle"));
            System.out.println(person.get(i));
            try {
                if (person.get(i)==person.get(i)){
                    throw new Exception("Persons");
                }
            } catch (Exception e){
                System.out.println("same persons");
            }
        }


    }
}

package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Bag>bag1 = new ArrayList<>();
        for (int i=0;i<22;i++){
            if (i<20){
                bag1.add(new Balls("Ball"));
            } else {
                bag1.add(new Liquid("Cola"));
                bag1.add(new Book("Book"));
            }
        }
        ArrayList <Bag>bag2 = new ArrayList<>();
        for (int i=0;i<52;i++){
            if (i<50){
                bag2.add(new Balls("Ball"));
            } else {
                bag2.add(new Liquid("water"));
                bag2.add(new Book("Package"));
            }
        }
        ArrayList <Bag>bag3 = new ArrayList<>();
        for (int i=0;i<5;i++){
            if (i<3){
                bag3.add(new Balls("Ball"));
            } else {
                bag3.add(new Liquid("Cola"));
                bag3.add(new Book("Package"));
            }
        }
    }
}

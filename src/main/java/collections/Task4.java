package collections;

import java.util.Comparator;

public class Task4 {
    public static Comparator<String> sortSonnet(){
        return Comparator.comparingInt(String::length);
    }


}

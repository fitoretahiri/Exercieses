package problem6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainExample {
    public static void main(String[] args) {
        List <String> list= Arrays.asList("Fitore", "no","yes");

       String list1= list.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(list1);
    }
}

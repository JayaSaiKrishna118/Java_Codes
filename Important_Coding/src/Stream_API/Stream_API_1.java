package Stream_API;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//intermediate operations
/* map, filter, sort*/
//Terminal Operations forEach, collect
public class Stream_API_1 {
    public static void main(String[] args) {
        //double the input of an array
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> numbers1 = Arrays.asList(1,24,5,56,6,34,24,9);

        List<Integer> sortedList = numbers1.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted array is : "+sortedList);
       // numbers.stream().map(x -> x*2).forEach(System.out::println);
        // the below code will give the numbers greater than 2
       // numbers.stream().filter(x -> x>2).forEach(System.out::println);

        int min = numbers.stream().min((x,y)->x-y).get();
        System.out.println("Minimum is "+ min );
        int max = numbers.stream().max((x,y)->x-y).get();
        System.out.println("Minimum is "+ max );
        Long count = numbers.stream().count();
        System.out.println("Minimum is "+ count );
    }
}
//map - when we want to perform operations on each element then we use map

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>(Arrays.asList(1, 4, 5, 20, 30, 6));// array init
        var mylist = marks.stream().filter(n -> n % 5 == 0).toList();// now filtering using a stream
        System.out.println(mylist);
    }
}

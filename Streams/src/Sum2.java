import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Sum2 {
    public static void main(String[] args) {
        List<Integer> numList= Arrays.asList(5,3,2,7,9,12,1);
        int sum= numList.stream()
                .sorted()
                .skip(numList.size()-2)
                .reduce(0,Integer::sum);
        System.out.println(sum);

    }


}

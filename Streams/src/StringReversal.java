import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringReversal {

    public static void main(String[] args) {

        System.out.println(reverse("Vinishaa"));;
    }
    public static String reverse(String string){
         return Stream.of(string)
                 .map(v-> new StringBuilder(v).reverse())
                 .collect(Collectors.joining(""));
    }
}

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
//Use a ArrayList 

public class songTitles {

  public static void main(String[] args) {
     List<String> songsT = Arrays.asList("humble","element","dna"); //Array as list 
     Function<String, String> capitalize = (str) -> str.toUpperCase(); //???
     songsT.stream().map(capitalize).forEach(System.out::println);  //???
  }
}

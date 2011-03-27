import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
  
public class TesteVarargs {
  public static void main(String[] args) {
    Set<Integer> aSet = new HashSet<Integer>();

    List<Set<Integer>> listOfSets = Arrays.asList(aSet);
  }
}


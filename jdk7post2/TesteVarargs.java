import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TesteVarargs {
  public static void main(String[] args) {
    Set<Integer> aSet = new HashSet<Integer>();

    // essa linha gera um warning ateh o java 1.6!
    List<Set<Integer>> listOfSets = Arrays.asList(aSet);
  }
}


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class InferenciaGenerics {

  public static void main(String[] args) {
    Map<Integer, Set<Integer>> mapOfIntegers = 
      new HashMap<>();

    Set<Integer> aSet;
    Integer aKey = 10;

    // uma chamada do tipo: mapOfIntegers.put(aKey, new HashSet<>()); nao compila!!!!
    mapOfIntegers.put(aKey, aSet = new HashSet<>());
  }
}

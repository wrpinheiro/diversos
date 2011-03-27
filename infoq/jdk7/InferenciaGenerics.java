import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
  
public class InferenciaGenerics {

  public static void main(String[] args) {
    Map<Integer, Set<Integer>> mapOfIntegers =
      new HashMap<>();

    Integer aKey = 10;    
    Set<Integer> aSet  = new HashSet<>();
 
    mapOfIntegers.put(aKey, aSet);
  }
}


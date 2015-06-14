import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Etl {
   Object transform(Map<Integer, List<String>> oldValues) {
      Map<String, Integer> newValues = new HashMap();

      for (Integer value : oldValues.keySet()) {
         for (String character : oldValues.get(value)) {
            newValues.put(character.toLowerCase(), value);
         }
      }

      return newValues;
   }
}

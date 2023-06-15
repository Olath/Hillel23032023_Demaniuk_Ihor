package UA.Hillel.Lesson13;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {
  public static void main(String[] args) {
    List<String> stringList= new LinkedList<>();
    stringList.add("10");
    stringList.add("");
    stringList.add("15");
    stringList.add("");
    stringList.add("30");

    List<Integer> integerList = new LinkedList<>();
    for (String s : stringList) {
      if (!s.isBlank()) {
        integerList.add(Integer.valueOf(s));
      }
    }

    for (int i=0; i<integerList.size(); i++) {
      integerList.set(i, integerList.get(i)*100);
    }
    System.out.println(stringList);

    List<Integer> streamList =  stringList.stream().filter(s -> !s.isBlank())
        .map(Integer::valueOf).map(i -> i*100).collect(Collectors.toList());
    System.out.println(streamList);
    System.out.println(stringList);

    stringList.forEach(s -> System.out.println("Element" + s));
  }
}

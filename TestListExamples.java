import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class IsMoon implements StringChecker {
  public boolean checkString(String s) {
    return s.equalsIgnoreCase("moon");
  }
}

public class TestListExamples {
  @Test(timeout = 500)
  public void testMergeRightEnd() {
    List<String> left = Arrays.asList("a", "b", "c");
    List<String> right = Arrays.asList("a", "d");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("a", "a", "b", "c", "d");
    assertEquals(expected, merged);
  }

  @Test(timeout = 500)
  public void testMergeLeftEnd() {
    List<String> left = Arrays.asList("a", "b", "d");
    List<String> right = Arrays.asList("a", "c");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("a", "a", "b", "c", "d");
    assertEquals(expected, merged);
  }

  @Test(timeout = 500)
  public void testFilter() {
    List<String> fruits = Arrays.asList("bananas", "apples");
    IsMoon check = new IsMoon();
    List<String> fruits_without_n = ListExamples.filter(fruits, check);
    assertEquals("apples", fruits_without_n.get(0));
  }
}

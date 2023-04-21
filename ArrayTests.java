import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedInPlacept2(){
    int[] input1={3,2,6,7,2};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{2,7,6,2,3}, input1);
  }


  @Test
  public void testReversedpt2() {
    int[] input1 = {9 ,1};
    assertArrayEquals(new int[]{ 1, 9}, ArrayExamples.reversed(input1));
  }
}

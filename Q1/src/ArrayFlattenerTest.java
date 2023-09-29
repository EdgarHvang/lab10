import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class ArrayFlattenerTest {
    private ArrayFlattener arrayFlattener;

    @Before
    public void setUp() {
        arrayFlattener = new ArrayFlattener();
    }

    @Test
    public void testFlattenArrayWithValidInput() {
        int[][] inputArray = {{1, 3}, {0}, {4, 5, 9}};
        int[] expectedArray = {1, 3, 0, 4, 5, 9};
        int[] flattenedArray = arrayFlattener.flattenArray(inputArray);
        assertArrayEquals(expectedArray, flattenedArray);
    }

    @Test
    public void testFlattenArrayWithNullInput() {
        int[][] inputArray = null;
        int[] expectedArray = {};
        int[] flattenedArray = arrayFlattener.flattenArray(inputArray);
        assertArrayEquals(expectedArray, flattenedArray);
    }
}
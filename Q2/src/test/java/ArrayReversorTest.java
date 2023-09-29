import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class ArrayReversorTest {
    private ArrayFlattenerService flattenerServiceMock;
    private ArrayReversor arrayReversor;

    @Before
    public void setUp() {
        flattenerServiceMock = Mockito.mock(ArrayFlattenerService.class);
        arrayReversor = new ArrayReversor(flattenerServiceMock);
    }

    @Test
    public void testReverseArrayWithValidInput() {
        int[][] input = {{1, 3}, {0}, {4, 5, 9}};
        int[] flattenedInput = {1, 3, 0, 4, 5, 9};
        int[] reversedInput = {9, 5, 4, 0, 3, 1};

        when(flattenerServiceMock.flattenArray(input)).thenReturn(flattenedInput);

        int[] result = arrayReversor.reverseArray(input);

        assertArrayEquals(reversedInput, result);

        verify(flattenerServiceMock).flattenArray(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReverseArrayWithNullInput() {
        arrayReversor.reverseArray(null);
    }
}

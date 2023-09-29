public class ArrayReversor {
    private ArrayFlattenerService flattenerService;

    public ArrayReversor(ArrayFlattenerService flattenerService) {
        this.flattenerService = flattenerService;
    }

    public int[] reverseArray(int[][] input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }

        int[] flattenedArray = flattenerService.flattenArray(input);
        int length = flattenedArray.length;
        int[] reversedArray = new int[length];

        for (int i = 0; i < length; i++) {
            reversedArray[i] = flattenedArray[length - 1 - i];
        }

        return reversedArray;
    }
}

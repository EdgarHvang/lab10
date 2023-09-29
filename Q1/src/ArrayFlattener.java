public class ArrayFlattener {

    public int[] flattenArray(int[][] inputArray) {
        if (inputArray == null) {
            return new int[0];
        }

        int totalElements = 0;
        for (int[] innerArray : inputArray) {
            totalElements += innerArray.length;
        }

        int[] resultArray = new int[totalElements];
        int index = 0;

        for (int[] innerArray : inputArray) {
            for (int element : innerArray) {
                resultArray[index] = element;
                index++;
            }
        }

        return resultArray;
    }

}

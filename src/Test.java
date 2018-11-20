public class Test {
    public static void main (String[] arg){
        int[] arr = new int[]{58,61,37,91};
        String[] names = {"apple","bob", "cat"};
        Sorts.printArr(arr);
        System.out.println();

        Sorts.ascendingSort(arr);
        Sorts.printArr(arr);
        System.out.println();
    }
}

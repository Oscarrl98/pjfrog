package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.bubble_sort.service;

public class BubbleSortService {

    public BubbleSortService(){
    }

    /**
     * Metodo de ordenamiento de a burbuja par array string
     */

    /**
     * @param arr debe ser un array de strings
     */
        public void bubbleSort1(String[] arr) {
            for (int x = 0; x < arr.length; x++) {
                for (int y = 0; y < arr.length - 1; y++) {
                    String currentElement = arr[y], nextElement = arr[y + 1];
                    if (currentElement.compareTo(nextElement) > 0) {
                        arr[y] = nextElement;
                        arr[y + 1] = currentElement;
                    }
                }
            }
        }

        public void printArray(String arr[]) {
            int n = arr.length;
            for (int i=0; i<n; ++i)
                System.out.print(arr[i] + " ");
        }
}

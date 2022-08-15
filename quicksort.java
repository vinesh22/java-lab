public class quicksort {
    int length;
    String[] arr;

    public static void main(String[] args) {
        String[] names = { "kalki", "naruto", "sasuke", "zoro", "nami", "luffy" };
        quicksort obj = new quicksort();
        obj.sort(names);

        for (String i : names) {
            System.out.println(i);

        }
    }

    public void sort(String[] array) {
        this.arr = array;
        this.length = arr.length;
        quick(0, length - 1);
    }

    public void quick(int lower, int higher) {
        int i = lower;
        int j = higher;
        String pivot = arr[lower + (higher - lower) / 2];
        while (i <= j) {
            while (this.arr[i].compareToIgnoreCase(pivot) < 0) {
                i++;
            }
            while (this.arr[j].compareToIgnoreCase(pivot) > 0) {
                j--;
            }
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        if (lower < j) {
            quick(lower, j);
        }
        if (i < higher) {
            quick(i, higher);
        }
    }

    public void exchange(int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

import java.util.Random;

public class Sortieralgos {
    public static int[] insertionSort(int[] sortieren) {
        int temp;
        for (int i = 1; i < sortieren.length; i++) {
            temp = sortieren[i];
            int j = i;
            while (j > 0 && sortieren[j - 1] > temp) {
                sortieren[j] = sortieren[j - 1];
                j--;
            }
            sortieren[j] = temp;
        }
        return sortieren;
    }
    public static int[] selectionsort(int[] sortieren) {
        for (int i = 0; i < sortieren.length - 1; i++) {
            for (int j = i + 1; j < sortieren.length; j++) {
                if (sortieren[i] > sortieren[j]) {
                    int temp = sortieren[i];
                    sortieren[i] = sortieren[j];
                    sortieren[j] = temp;
                }
            }
        }

        return sortieren;
    }
    public static int[] bubblesort(int[] zusortieren) {
        int temp;
        for(int i=1; i<zusortieren.length; i++) {
            for(int j=0; j<zusortieren.length-i; j++) {
                if(zusortieren[j]>zusortieren[j+1]) {
                    temp=zusortieren[j];
                    zusortieren[j]=zusortieren[j+1];
                    zusortieren[j+1]=temp;
                }

            }
        }
        return zusortieren;
    }
    public static void ausgabe(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        int[] randomliste = new int[100];
        for (int i=0; i<randomliste.length;i++){
            randomliste[i]= rnd.nextInt(100);
        }
        ausgabe(randomliste);
        selectionsort(randomliste);
        ausgabe(randomliste);
    }
}

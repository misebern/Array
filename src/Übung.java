import java.util.Arrays;

public class Übung {

    public static void main(String[] args) {
        // schauen wir uns ein altbekanntes array an
        int []feld = new int[] {1, 2, 3};

        // es gibt eine hilfsmethode die ein array ausgibt
        System.out.println(Arrays.toString(feld));

        System.out.println("-----------------------------");

        // 2 dimensionaler Array (Array in Array)
        int [][] feld2dim = new int[3][4];

        // einem element etwas zuweisen
        feld2dim [1][2] = 42;

        System.out.println(Arrays.toString(feld2dim));
        System.out.println(Arrays.toString(feld2dim[0]));
        System.out.println(Arrays.toString(feld2dim[1]));
        System.out.println(Arrays.toString(feld2dim[2]));

        System.out.println("-----------------------------");

        // andere initalisierung
        int [][] feld2im2 = new int [][] {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.toString(feld2im2[0]));
        System.out.println(Arrays.toString(feld2im2[1]));

    }
}

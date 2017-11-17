import java.util.Scanner;
import java.util.stream.IntStream;

public class Calculations {

    Scanner scanner = new Scanner(System.in);

    public int add(int kiekis){

        int[] masyvas = new int[64];

        for (int i = 0; i <kiekis ; i++) {
            System.out.print("skaicius "+(i+1)+": ");
            int sk = scanner.nextInt();
            masyvas[i] = sk;
        }
        int sum = IntStream.of(masyvas).sum();
        return sum;
    }

}

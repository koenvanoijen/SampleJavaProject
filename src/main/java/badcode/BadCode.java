package badcode;

public class BadCode {

    // Print the average and the sum of an array of integers
    public int PRINTsumandAVERAGE(int x[]) {
        int sum;
        int average = 0;

        for (int i = 1; i < x.length; i++) {
            average += x[i];
        }

        sum = average / x.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        return 0;
    }
}

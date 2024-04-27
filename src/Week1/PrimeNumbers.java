package Week1;

public class PrimeNumbers {

    public static void main(String[] args) {

        //We define variable
        int count=0;

        /* First for-loop for between [2-100)
        Second for-loop, for find how many divisors does the number have?
        If answer is 2 then it's prime number. */
        for (int i=2;i<100;i++) {
            for (int j=1;j<=i;j++) {
                if (i%j==0) {
                    count++;
                }
            }
            if (count==2) {
                System.out.print(i+" ");
            }
            count = 0;
        }
    }
}

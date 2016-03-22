
public class FizzBuzzChallenge {
    public static void main(String[] args) {
        //printOneToOneHundred();

        //printValueOf(1000);
        //printValueOf(1001);
        //printValueOf(1093836495);

        printRange(1, 100);
        printRange(105, 300);

    }

    private static void printRange(int x, int y) {
        while( x <= y) {
            System.out.println(FizzBuzz.getValue(x));
            x++;
        }
    }

    private static void printValueOf(int i) {
        System.out.println(FizzBuzz.getValue(i));
    }


    //less reusable than print range
    private static void printOneToOneHundred() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(FizzBuzz.getValue(i));
        }
    }
}

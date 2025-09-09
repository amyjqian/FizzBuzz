package lab1;

/**
 * Solve the lab1.FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

//        while (int i < 100) {
//            boolean divisbleBy3 = i % 3 == 0;
//            boolean divisibleBy5 = i % 5 == 0;
//
//            if (divisbleBy3 && divisbleBy5) {
//                System.out.println("Fizz Buzz");
//            } else if (divisbleBy3) {
//                System.out.println("Fizz");
//            } else if (divisbleBy5) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        for (int i = 1; i < 100; i++) {

            doFizzBuzz(i);
        }
    }

    private static void doFizzBuzz(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
    }
}

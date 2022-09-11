public class ProblemSet {

    public static int factorial (int n){
        int total = 1;
        for (int i = 1; i <= n; i++){
            total *= i;
        } return total;
    }

    public static int indexOfFirstOccurrence (String [] stringArray, String target){
        int size = stringArray.length;
        for (int i = 0; i <= size; i++){
            if (stringArray[i].equals(target)){
                return i;
            }
        } return -1;

    }

    public static int yearsTilOneMillion (double initialBalance, int yourGoal){
        int goalIn$ = yourGoal;
        int years = 0;
        double balance = initialBalance;
        while (balance < goalIn$){
            years++;
            balance = balance * 1.05;
        } return years;
    }

    public void printInReverse (String [] stringArray){
        int size = stringArray.length;
        for (int i = size-1; i >= 0; i--){
            System.out.println(stringArray[i]);
        }
    }

    public int findRange (int [] intArray){
        int size = intArray.length;
        if (size == 0){
            return -1;
        }

        int smallest = intArray[0];
        int largest = intArray[0];
        for (int i = 1; i < size; i++){
            if (intArray[i] < smallest){
                smallest = intArray[i];
            }
            if (intArray[i] > largest){
                largest = intArray[i];
            }
        } return largest - smallest;
    }

    public static int rollTheDice(int sides){
        int letsRoll = (int) (Math.random() * sides) + 1;
        // generates random int + casting value to int
        return letsRoll;
    }

    /*public static int monopolyRoll(){
        int x = rollTheDice(6);
        int y = rollTheDice(6);
        int total = 0;
        boolean equals = x == y;
        int howMuchRolls = 0;
        while (equals){
            total = x + y;
            total += total;
            howMuchRolls++;
            return total;
            if (!equals) {
                howMuchRolls++;
                equals = false;
            }
        } return total;
    }*/

    public static void main(String[] args) {
        // Question 1.
        int n = 10;
        while (n < 50){
            n = n * 2;
        }

        // println - 80

        // Question 2.
        // System.out.println(factorial(10));

        // Question 3.

        // Question 4.
        System.out.println(yearsTilOneMillion(100, 1000000));

        // Question 5.

        // Question 6.

        // Question 7.

        /*
        #
        ##
        ###
         */

        // Question 8.



    }
}

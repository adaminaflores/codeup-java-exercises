public class ArrayLecture {

    public static void main(String[] args) {
        double[] prices = new double[4];
        final int numberOfSides = 6;

        int[] dicesSides = new int[numberOfSides];

        System.out.println("prices.length = " + prices.length );
        System.out.println("dicesSides = " + dicesSides.length);

        System.out.println("dicesSides[0] = " + dicesSides[0]);

        String[] myBag = {"Snickers", "Reese's", "Brussell Sprouts"};
        System.out.println("myBag.length = " + myBag.length);

        for(String candy : myBag) {
            System.out.printf("%s is the piece of candy that uou just pulled out of the bag %n", candy);

        }
        }
    }


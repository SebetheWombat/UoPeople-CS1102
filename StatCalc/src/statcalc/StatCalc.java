package statcalc;

public class StatCalc {

    private int count;   // Number of numbers that have been entered.
    private double sum;  // The sum of all the items that have been entered.
    private double squareSum;  // The sum of the squares of all the items.
 
    /**
     * Add a number to the dataset.  The statistics will be computed for all
     * the numbers that have been added to the dataset using this method.
     */
    public void enter(double num) {
        count++;
        sum += num;
        squareSum += num*num;
    }
 
   /**
    * Return the number of items that have been entered into the dataset.
    */
    public int getCount() {
        return count;
    }
 
   /**
    * Return the sum of all the numbers that have been entered.
    */
    public double getSum() {
        return sum;
    }
 
   /**
    * Return the average of all the items that have been entered.
    * The return value is Double.NaN if no numbers have been entered.
   */
    public double getMean() {
        return sum / count;
    }
 
   /**
    * Return the standard deviation of all the items that have been entered.
    * The return value is Double.NaN if no numbers have been entered.
    */
    public double getStandardDeviation() {
        double mean = getMean();
        return Math.sqrt( squareSum/count - mean*mean );
    }
   
    public static void main(String[] args) {
        //Declare and instantiate new StatCalc
        StatCalc myStatCalc;
        myStatCalc = new StatCalc();
        
        //Create an array with all numbers to add to myStatCalc
        double[] numsToCount = {
            5, 7, 12, 23, 3, 2, 8, 14, 10, 5, 9, 13
        };
        
        //Add each of the numbers in numsToCount array to myStatCalc
        for (int i = 0; i < numsToCount.length; i++){
            myStatCalc.enter(numsToCount[i]);
        }
        
        //Call myStatCalc accessor methods to display the count, mean and standard deviation 
        System.out.println("Count: " + myStatCalc.getCount());
        System.out.println("Mean: " + myStatCalc.getMean());
        System.out.println("Standard Deviation: " + myStatCalc.getStandardDeviation());
    } 
}
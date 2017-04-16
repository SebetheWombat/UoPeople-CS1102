package snakeeyescount;
/**
 * @author Sebe
 */
public class Main {

    public static void main(String[] args) {
        int die1; //Set up first die as int
        int die2; //Set up second die as int
        int rolls = 0; //Initialize rolls to 0
        int runProgram; //Set up runProgram to keep track of how many times program is run
        int[] rollsArr; //Set up empty array to store results of number of rolls
        rollsArr = new int[1000]; //Allocate 1000 spaces
        double sum = 0.0; //Initialize sum to hold sum of all rolls
        double avg; //Set up double for average number of rolls
        
        // Run this program 1000 times
        for(runProgram = 0; runProgram < 1000; runProgram++){
            //Set random numbers to dice, when both are 1 end loop
            while (true){
                die1 = (int)(Math.random()*6)+1;
                die2 = (int)(Math.random()*6)+1;
                rolls++;

                if (die1 == 1 && die2 == 1){
                    break;
                }
            }

            //Add rolls to rolls array
            rollsArr[runProgram] = rolls;
            //reset rolls to 0 to begin new count
            rolls = 0;
        }
        
        //Calculte sum of all rolls
        for(int roll: rollsArr){
            sum += roll;
        }
        //Calculate average number of rolls for 1000 times program ran
        avg = sum/1000.0;
        //Alert user average rolls to get snake eyes
        TextIO.putln("The average number of rolls it takes to get snake eyes is " + avg);
    }   
}

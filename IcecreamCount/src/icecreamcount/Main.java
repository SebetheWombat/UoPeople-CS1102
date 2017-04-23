package icecreamcount;

public class Main {

    public static void main(String[] args) {
        int totalIcecreamCount = 0; //Initialize total cone count to 0
        int totalStrawberryCount = 0; //Initialize strawberry count to 0
        double percentStrawberry; //Set up double to store calculated percentage of cones that were strawberry
        String currentFlavor; //Set up string to store file input
        TextIO.readFile("icecream.dat"); //Declare input will come from icecream.dat file
        
        while(!TextIO.eof()){ //continue looping until end of file is reached
            currentFlavor = TextIO.getln(); //read in current flavor from file
            totalIcecreamCount++; //Count each line towards icecream total
            //If the flavor read in is Strawberry count it towards strawberry total
            if (currentFlavor.equals("Strawberry")){
                totalStrawberryCount++;
            }
        }
        
        //Convert type to double and then calculate percentage of strawberry to total flavors
        percentStrawberry = ((double)totalStrawberryCount/totalIcecreamCount)*100;
        TextIO.putf("%d icecream cones were sold.%n%d of those cones were Strawberry.", totalIcecreamCount, totalStrawberryCount);
        TextIO.putln();
        TextIO.putf("%1.2f%% of all icecream cones sold were strawberry%n", percentStrawberry);
    }
    
}

import java.util.ArrayList;
import java.util.Random;

public class PrizeDoor{
   
    
    public boolean prize(int userInput){
        Random rng = new Random();
        ArrayList doors = new ArrayList<>();
        
        int randomDoor = rng.nextInt(3);
        for(int i = 0; i < 3; i++){
            doors.add(false);
            if (i == randomDoor){
                doors.add(true);
            }
        }
        return false;
    }
}
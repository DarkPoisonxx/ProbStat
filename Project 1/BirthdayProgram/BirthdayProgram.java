package BirthdayProgram;
import java.util.ArrayList;

public class BirthdayProgram {

    public boolean isBirthday(int numPeople){
        ArrayList<Person> People = new ArrayList<>();
        for(int i = 0; i < numPeople; i++){
            Person iPerson = new Person();
            People.add(iPerson);
        }
        for(int i = 0; i < People.size() - 1; i++){
            for(int j = i + 1; j < People.size() - 1; j++){
                if(People.get(i).getBirthday() == People.get(j).getBirthday()){
                    return true;
                }
            }
        }
        return false;
    }


    public double chance(int numPeople, int runTimes){
        int sameBirthdays = 0;
        for( int i = 0; i < runTimes; i++){
            if(isBirthday(numPeople)){
                sameBirthdays += 1;
            }
        }
        double percentage = (double) sameBirthdays / runTimes;
        return percentage;
    }
    public static void main(String[] args) {
        BirthdayProgram test = new BirthdayProgram();
        System.out.println(test.chance(90, 100000));
    }
}


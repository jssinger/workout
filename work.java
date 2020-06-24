import java.util.*;
public class work
{
    public static int seconds = 0;
    public static boolean full = false;
    public static int intensity;
    public static String foc;
    public static int min;
    public static Workout workout;
    public static ArrayList <String> exercise;
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Upper, Core, Lower, or Full Body?");
        foc = scan.nextLine();
        if(foc.equalsIgnoreCase("full body")){
            full = true;
            System.out.println("Would you like to emphasize any one specific group? (Yes/No)");
            String ans = scan.next();
            if(ans.equalsIgnoreCase("Yes")){
                System.out.println("Which one? Ex: Core or Upper or Lower");
                foc = scan.next();
            }
            if(ans.equalsIgnoreCase("No")){
                foc = "None";
            }
        }
        System.out.println("On a scale of 1 to 3, how intense do you want to workout?");
        intensity = scan.nextInt();
        System.out.println("10 minutes, 15 minutes, 20 minutes? (Example: 2 = 15min)");
        int min = scan.nextInt();
        workout = new Workout(intensity, foc, full, min);
        exercise = workout.sort();
        //for(int i = 0; i<exercise.size();i++){
        //    System.out.println(exercise.get(i));
        //}
        for(int i = 0; i<exercise.size(); i++){
            select(exercise.get(i));
        }
        System.out.println(workout.duration(exercise.get(exercise.size()-1)));
    }

    public static void select(String word){
        if(word.equals("core")){
            Core();
        }
        if(word.equals("upper")){
            Upper();
        }
        if(word.equals("lower")){
            Leg();
        }
    }

    public static void Core(){
        int b = (int)(5*Math.random()+1);
        int sec = workout.intensity();
        if(b==1){
            System.out.println("Situps for "+sec+" seconds");
            System.out.println("Flutter Kicks for "+sec+" seconds");
            System.out.println("Russian Twists for "+sec+" seconds");
            seconds+=3*sec;
        }
        if(b==2){
            System.out.println("Leg lifts for "+sec+" seconds");
            System.out.println("Windshield Wipers for "+sec+" seconds");
            System.out.println("Situps for "+sec+" seconds");
            seconds+=3*sec;
        }
        if(b==3){
            System.out.println("Plank for "+sec+" seconds");
            System.out.println("Crunches for "+sec+" seconds");
            System.out.println("Bicycle for "+sec+" seconds");
            seconds+=3*sec;
        }
        if(b==4){
            System.out.println("Scissors for "+sec+" seconds");
            System.out.println("Left side plank for "+sec+" seconds");
            System.out.println("Right side plank for "+sec+" seconds");
            seconds+=3*sec;
        }
        if(b==5){
            System.out.println("Mountain Climbers for "+sec+" seconds");
            System.out.println("Plank Arm Raises for "+sec+" seconds");
            System.out.println("Reverse Crunches for "+sec+" seconds");
            seconds+=3*sec;
        }
    }

    public static void Upper(){
        int c = (int)(4*Math.random()+1);
        int sec = workout.intensity();
        if(c==1){
            System.out.println("Pushups for "+sec+" seconds");
            System.out.println("Tricep dips for "+sec+" seconds");
            System.out.println("Diamond pushups for "+sec+" seconds");
            seconds+=3*sec;
        }
        if(c==2){
            System.out.println("Burpees for "+sec+" seconds");
            System.out.println("Dive bombers for "+sec+" seconds");
            System.out.println("Mountain climbers for "+sec+" seconds");
            seconds+=3*sec;
        }
        if(c==3){
            System.out.println("Wide Grip Pushups for "+sec+" seconds");
            System.out.println("Arm Rotations for "+sec+" seconds");
            seconds+=2*sec;
        }
        if(c==4){
            System.out.println("Tricep-ups for "+sec+" seconds");
            System.out.println("Pushups for "+sec+" seconds");
            seconds+=2*sec;
        }
    }

    public static void Leg(){
        int a = (int)(3*Math.random()+1);
        int sec = workout.intensity();

        if(a==1){
            System.out.println("Star jumps for "+sec+" seconds");
            System.out.println("Squats for "+sec+" seconds");
            System.out.println("Wall Sit for "+sec+" seconds");
            seconds+=3*sec;
        }
        if(a==2){
            System.out.println("Lunges for "+sec+" seconds");
            System.out.println("Squats for "+sec+" seconds");
            System.out.println("Calf Raises for "+sec+" seconds");
            seconds+=3*sec;
        }
        if(a==3){
            System.out.println("Squat jumps for "+sec+" seconds");
            System.out.println("Bench lunge for "+sec+" seconds");
            System.out.println("Step ups for "+sec+" seconds");
            seconds+=3*sec;
        }
    }
}

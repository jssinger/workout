import java.util.*;
public class Workout
{
    private int intens;
    private String foc;
    private boolean full;
    public ArrayList <String> exercise;
    private int time;
    public Workout(int intensity, String focus, boolean fullBody, int mins){
        exercise = new ArrayList <String>();
        intens = intensity;
        foc = focus;
        full = fullBody;
        time = mins;
    }

    public String duration(String last){
        if(last.equals("Low"))
            return "1 set";
        if(last.equals("Mid"))
            return "2 sets";
        if(last.equals("High"))
            return "3 sets";
        return "0 sets";
    }

    public int intensity(){
        if(time == 1)
            return 15;
        if(time == 2)
            return 30;
        if(time == 3 )
            return 45;
        return 0;
    }

    public ArrayList <String> sort(){
        if(foc.equalsIgnoreCase("core") && full){
            exercise.add("core");
            exercise.add("upper");
            exercise.add("core");
            exercise.add("lower");
        }
        if(foc.equalsIgnoreCase("upper") && full){
            exercise.add("upper");
            exercise.add("lower");
            exercise.add("upper");
            exercise.add("core");
        }
        if(foc.equalsIgnoreCase("lower") && full){
            exercise.add("lower");
            exercise.add("core");
            exercise.add("lower");
            exercise.add("upper");
        }
        if(foc.equalsIgnoreCase("None") && full){
            exercise.add("upper");
            exercise.add("core");
            exercise.add("lower");
        }
        if(foc.equalsIgnoreCase("core") && !full){
            exercise.add("core");
            exercise.add("core");
            exercise.add("core");
        }
        if(foc.equalsIgnoreCase("upper") && !full){
            exercise.add("upper");
            exercise.add("upper");
            exercise.add("upper");
        }
        if(foc.equalsIgnoreCase("lower") && !full){
            exercise.add("lower");
            exercise.add("lower");
            exercise.add("lower");
        }
        if(intens==1)
            exercise.add("Low");
        if(intens==2)
            exercise.add("Mid");
        if(intens==3)
            exercise.add("High");
        return exercise;
    }
}
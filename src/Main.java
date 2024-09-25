import java.math.BigDecimal;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Time time = new Time();
        Scanner sc = new Scanner(System.in);
        String hours;
        int control =0;
        BigDecimal bd = new BigDecimal("0.1");
        while(control < 1){
            System.out.println("Please set the time, in format HH:MM:SS");
            hours= sc.nextLine();
            String[] timeArray = hours.split(":");

            try{
                time.setTime(Integer.parseInt(timeArray[0]), Integer.parseInt(timeArray[1]), Integer.parseInt(timeArray[2]));
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
            System.out.println("Current time set as: "+time);
            System.out.println("Do you want to set the time again? (Y/N)");
            String answer = sc.nextLine();
            if(answer.equalsIgnoreCase("N")) {
                control++;
            }
        }
    }
}
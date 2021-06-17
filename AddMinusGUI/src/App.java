import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        int Repeat = 1;
        while (Repeat==1){
        Scanner sc=new Scanner(System.in);  
        System.out.print("First Number: ");
        int FirstNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Second Number: ");
        int SecondNumber = Integer.parseInt(sc.nextLine());
        int sum = FirstNumber+SecondNumber;
        System.out.println("The Sum is: " + sum);
        System.out.println("Do you want to Continue? Type 1 to Continue and 2 to End");
        int RepeatSwitch = sc.nextInt();
        if(RepeatSwitch==1){
                Repeat=1;
        }else{
                sc.close();
                break;
            }
        }
    System.out.print(("Ending Program"));
    }
}


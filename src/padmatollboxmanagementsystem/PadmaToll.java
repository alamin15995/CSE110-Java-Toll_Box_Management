package padmatollboxmanagementsystem;

import java.util.Scanner;
public class PadmaToll {

    public static void main(String[] args) {

        Registry Enter1 = new Registry();

        Vehicle Entry = new Vehicle();

        boolean Loop = true;
        System.out.println("To terminate the programme enter -999");
        while(Loop){
            System.out.println("\n\n");
            System.out.println("**********WELCOME TO  PADMA BRIDGE**********");
            System.out.println("\n\n");
            
            Toll.Opening();
            Scanner scn = new Scanner(System.in);

            System.out.print("\nEnter Your Vehicle Type: ");
            int code = scn.nextInt();
            if(code == -999){
                System.out.println("\nProgramme has been terminated successfully.");
                break;
            }
            Toll.TollMessege(code);
            System.out.println();

            System.out.println("-------------Please Pay the Money-------------");
            Toll.Payment();
            int PaymentMethode = scn.nextInt();
            if(PaymentMethode == -999){
                System.out.println("\nProgramme has been terminated successfully.");
                break;
            }

            System.out.print("Enter the number of passenger in the vehicle: ");
            int Passenger = scn.nextInt();
            if(Passenger == -999){
                System.out.println("\nProgramme has been terminated successfully.");
                break;
            }
            System.out.println("");

            Toll input1 = new Toll(Passenger, PaymentMethode, code, Enter1, Entry);
            input1.Showlane();
            System.out.println();
            System.out.println("*****THANKS FOR COMING*****\n*****HAVE A SAFE JOURNEY*****");
            System.out.println("-----------------------------------------------------------------------------------------" +
                    "---------------------------------------------------------------------------------------------------" +
                    "----------------------------------------------------------------------------------------------------");
            System.out.println("\n\n\n");
        }

        System.out.println("-------------------------------------------------" +
                "-----------------------------------------------------------------------------------------------" +
                "-------------------------------------------------------------------------------------------------------" +
                "--------------------------------------------------------------------------------------------------------" +
                "\n\t\tSystem is created by Mohammad Al-Amin\n\t\tSpecial Thanks to Our Honorable Course Instructor" +
                "\n\t\t- Mahmudul Hasan Munna Sir");
    }
}


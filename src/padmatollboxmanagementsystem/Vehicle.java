package padmatollboxmanagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vehicle implements Database {
    int op;    
    Scanner scn;
    
    List<Integer> BusCode;
    List<Integer> BusPassenger;
    List<String> BusPaymentMode;

    List<Integer> CngCode;
    List<Integer> CngPassenger;
    List<String> CngPaymentMode;

    List<Integer> TruckCode;
    List<Integer> TruckPassenger;
    List<String> TruckPaymentMode;

    List<Integer> MiniTruckCode;
    List<Integer> MiniTruckPassenger;
    List<String> MiniTruckPaymentMode;

    List<Integer> PrivateCarCode;
    List<Integer> PrivateCarPassenger;
    List<String> PrivateCarPaymentMode;

    List<Integer> MotorBikeCode;
    List<Integer> MotorBikePassenger;
    List<String> MotorBikePaymentMode;

    List<Integer> MicroCode;
    List<Integer> MicroPassenger;
    List<String> MicroPaymentMode;


    public Vehicle() {
        op = 0;
        scn = new Scanner(System.in);
        
        BusCode = new ArrayList<>();
        BusPassenger = new ArrayList<>();
        BusPaymentMode = new ArrayList<>();
        
        CngCode = new ArrayList<>();
        CngPassenger = new ArrayList<>();
        CngPaymentMode = new ArrayList<>();

        TruckCode = new ArrayList<>();
        TruckPassenger = new ArrayList<>();
        TruckPaymentMode = new ArrayList<>();

        MiniTruckCode = new ArrayList<>();
        MiniTruckPassenger = new ArrayList<>();
        MiniTruckPaymentMode = new ArrayList<>();

        PrivateCarCode = new ArrayList<>();
        PrivateCarPassenger = new ArrayList<>();
        PrivateCarPaymentMode = new ArrayList<>();

        MotorBikeCode = new ArrayList<>();
        MotorBikePassenger = new ArrayList<>();
        MotorBikePaymentMode = new ArrayList<>();

        MicroCode = new ArrayList<>();
        MicroPassenger = new ArrayList<>();
        MicroPaymentMode = new ArrayList<>();
    }

    public void Choose() {
        
        System.out.println("To see specific details please choose the vehicle no. -\n 1. BUS " +
                "\n 2. CNG " + "\n 3. TRUCK " + "\n 4. PRIVATE CAR\n 5. BIKE\n 6. MINI TRUCK\n 7. MICRO");

        op = scn.nextInt();

        System.out.println("The list is-\n(Serial - Passenger - Payment Mode)\n");

        switch (op) {
            case 1:
                if(BusCode.isEmpty()){
                    System.out.println("List is empty");
                }   for (int i = 0; i < BusCode.size(); i++) {
                    System.out.println(BusCode.get(i) + " - " + BusPassenger.get(i) + " - " + BusPaymentMode.get(i));
                }   break;
            case 2:
                if(CngCode.isEmpty()){
                    System.out.println("List is empty");
                }   for (int i = 0; i < CngCode.size(); i++) {
                    System.out.println(CngCode.get(i) + " - " + CngPassenger.get(i) + " - " + CngPaymentMode.get(i));
                }   break;
            case 3:
                if(TruckCode.isEmpty()){
                    System.out.println("List is empty");
                }   for (int i = 0; i < TruckCode.size(); i++) {
                    System.out.println(TruckCode.get(i) + " - " + TruckPassenger.get(i) + " - " + TruckPaymentMode.get(i));
                }   break;
            case 4:
                if(PrivateCarCode.isEmpty()){
                    System.out.println("List is empty");
                }   for (int i = 0; i < PrivateCarCode.size(); i++) {
                    System.out.println(PrivateCarCode.get(i) + " - " + PrivateCarPassenger.get(i) + " - " + PrivateCarPaymentMode.get(i));
                }   break;
            case 5:
                if(MotorBikeCode.isEmpty()){
                    System.out.println("List is empty");
                }   for (int i = 0; i < MotorBikeCode.size(); i++) {
                    System.out.println(MotorBikeCode.get(i) + " - " + MotorBikePassenger.get(i) + " - " + MotorBikePaymentMode.get(i));
                }   break;
            case 6:
                if(MiniTruckCode.isEmpty()){
                    System.out.println("List is empty");
                }   for (int i = 0; i < MiniTruckCode.size(); i++) {
                    System.out.println(MiniTruckCode.get(i) + " - " + MiniTruckPassenger.get(i) + " - " + MiniTruckPaymentMode.get(i));
                }   break;
            case 7:
                if(MicroCode.isEmpty()){
                    System.out.println("List is empty");
                }   for (int i = 0; i < MicroCode.size(); i++) {
                    System.out.println(MicroCode.get(i) + " - " + MicroPassenger.get(i) + " - " + MicroPaymentMode.get(i));
                }   break;
            default:
                break;
        }
    }

    public void setBusCode(int str) {
        BusCode.add(str);
    }

    public void setBusPassenger(int i) {
        BusPassenger.add(i);
    }

    public void setMotorBikePassenger(int i) {
        MotorBikePassenger.add(i);
    }

    public void setMotorBikeCode(int str) {
        MotorBikeCode.add(str);
    }

    public void setCngPassenger(int i) {
        CngPassenger.add(i);
    }

    public void setMiniTruckPaymentMode(String str) {
        MiniTruckPaymentMode.add(str);
    }

    public void setMicroPaymentMode(String str) {
        MicroPaymentMode.add(str);
    }

    public void setTruckCode(int str) {
        TruckCode.add(str);
    }

    public void setMotorBikePaymentMode(String str) {
        MotorBikePaymentMode.add(str);
    }

    public void setBusPaymentMode(String str) {
        BusPaymentMode.add(str);
    }

    public void setCngCode(int str) {
        CngCode.add(str);
    }

    public void setCngPaymentMode(String str) {
        CngPaymentMode.add(str);
    }

    public void setMiniTruckPassenger(int i) {
        MiniTruckPassenger.add(i);
    }

    public void setTruckPaymentMode(String str) {
        TruckPaymentMode.add(str);
    }

    public void setPrivateCarPassenger(int i) {
        PrivateCarPassenger.add(i);
    }

    public void setTruckPassenger(int i) {
        TruckPassenger.add(i);
    }

    public void setMicroCode(int str) {
        MicroCode.add(str);
    }

    public void setMicroPassenger(int i) {
        MicroPassenger.add(i);
    }

    public void setPrivateCarCode(int i) {
        PrivateCarCode.add(i);
    }

    public void setMiniTruckCode(int str) {
        MiniTruckCode.add(str);
    }

    public void setPrivateCarPaymentMode(String str) {
        PrivateCarPaymentMode.add(str);
    }

    public static String Mode(int i){
        String msg ="";
        if(i == 1){
            msg = "Online";
        }else{
            msg = "Manual";
        }
        return msg;
    }
}

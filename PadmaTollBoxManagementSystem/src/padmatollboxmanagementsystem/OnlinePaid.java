package padmatollboxmanagementsystem;

import static padmatollboxmanagementsystem.Database.TollBUS;
import static padmatollboxmanagementsystem.Database.TollCNG;
import static padmatollboxmanagementsystem.Database.TollMICRO;
import static padmatollboxmanagementsystem.Database.TollMINITRUCK;
import static padmatollboxmanagementsystem.Database.TollMOTORBIKE;
import static padmatollboxmanagementsystem.Database.TollPRIVATECAR;
import static padmatollboxmanagementsystem.Database.TollTruck;
import java.util.Scanner;

public class OnlinePaid implements Database {
    private long MobileNumber;
    private long Pin;
    int code;
    private double discounted;
    private double paid;
    private final long[] digits;
    double fine;
    Scanner scn;

    public OnlinePaid(int code, double fine) {
        scn = new Scanner(System.in);
        MobileNumber = -1;
        Pin = -1;
        this.code = code;
        discounted = 0;
        paid = 0;
        digits = new long[11];
        this.fine = fine;
    }

    public static void Printmsg() {
        System.out.println("\nEnter your mobile number: ");
    }

    public void discount() {
        if (TestNumber()) {
            switch (code) {
                case 1:
                    discounted = TollBUS * 20 / 100;
                    paid = TollBUS - discounted + fine;
                    break;
                case 3:
                    discounted = TollTruck * 20 / 100;
                    paid = TollTruck - discounted + fine;
                    break;
                case 2:
                    discounted = TollCNG * 20 / 100;
                    paid = TollCNG - discounted + fine;
                    break;
                case 6:
                    discounted = TollMINITRUCK * 20 / 100;
                    paid = TollMINITRUCK - discounted + fine;
                    break;
                case 4:
                    discounted = TollPRIVATECAR * 20 / 100;
                    paid = TollPRIVATECAR - discounted + fine;
                    break;
                case 7:
                    discounted = TollMICRO * 20 / 100;
                    paid = TollMICRO - discounted + fine;
                    break;
                case 5:
                    discounted = TollMOTORBIKE * 20 / 100;
                    paid = TollMOTORBIKE - discounted + fine;
                    break;
                default:
                    break;
            }
        }
        Registry.setTotalTaka(paid);
    }

    private boolean TestNumber() {
        boolean check = false;
        MobileNumber = scn.nextLong();
        int cnt = digit(MobileNumber);
        if (cnt == 10 && digits[10] == 0 && digits[9] == 1) {
            int tmp = password();
            if (tmp == 5) {
                check = true;
            }
        } else {
            System.out.println("Sorry!! Number could not found\n");
            Toll.setSuccess();
        }
        return check;
    }

    private int password() {
        System.out.println("Enter your account Pin Code : ");
        Pin = scn.nextLong();
        int cnt = digit(Pin);
        if (cnt != 5) {
            System.out.println("Invalid Password");
            Toll.setSuccess();
        }
        return cnt;
    }

    private int digit(long number) {
        long result = number;
        int cnt = 0;

        while (result != 0) {
            digits[cnt] = result % 10;
            result = result / 10;
            cnt++;
        }
        return cnt;
    }

    @Override
    public String toString() {
        String msg = "";
        if(fine > 0.0){
            msg = "(Passenger limit exceeded)";
        }
        return "Paid : " + paid + " taka (Discounted : " + discounted + "taka.)"+"\nFined : " + fine + " taka." +
                msg;

    }
}
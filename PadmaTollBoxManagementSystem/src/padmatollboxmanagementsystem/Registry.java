package padmatollboxmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Registry {
    private int CountBus;
    private int CountCng;
    private int CountTruck;
    private int CountMiniTruck;
    private int CountPrivateCar;
    private int CountMotorBike;
    private int CountMicro;
    private int CountLane1;
    private  int CountLane2;
    private static int Counter;
    private static double TotalTaka;
    List<String> Vehicle;

    static{
        Counter = 0;
        TotalTaka = 0.0;
    }

    public Registry() {
        CountBus = 0;
        CountCng = 0;
        CountTruck = 0;
        CountMiniTruck = 0;
        CountPrivateCar = 0;
        CountMotorBike = 0;
        CountMicro = 0;
        CountLane1 = 0;
        CountLane2 = 0;
        Vehicle = new ArrayList<>();
    }

    public void setCountBus() {
        CountBus++;
    }

    public void setCountCng() {
        CountCng++;
    }

    public void setCountMicro() {
        CountMicro++;
    }

    public void setCountMiniTruck() {
        CountMiniTruck++;
    }

    public void setCountMotorBike() {
        CountMotorBike++;
    }

    public void setCountTruck() {
        CountTruck++;
    }

    public void setCountPrivateCar() {
        CountPrivateCar++;
    }
    public void setCountLane1(){
        CountLane1++;
    }
    public void setCountLane2(){
        CountLane2++;
    }

    public void addVehicle(String str){
        Vehicle.add(str);
    }

    public static void setCounter(){
        Counter++;
    }

    public static int getCounter(){
       return Counter;
    }

    public static void setTotalTaka(double taka){
        TotalTaka += taka;
    }

    public void showDetails(){
        System.out.println("Total Toll Received : " + TotalTaka + " Tk.");
        System.out.println("\nList of all vehicles -\n(Vehicle Name - Lane No. - Serial No.)\n");
        if(Vehicle.isEmpty()){
            System.out.println("List is empty");
        }else{
            for (int i = 0; i < Vehicle.size(); i++) {
                System.out.println(Vehicle.get(i) + (i+1));
            }
        }
    }

    @Override
    public String toString() {
        return "Bus         --- " + CountBus + "\nTruck       --- " + CountTruck + "\nCng         --- " + CountCng
                + "\nPrivate Car --- " + CountPrivateCar + "\nMini Truck  --- " + CountMiniTruck + "\nMicro       --- "
                + CountMicro + "\nMotor Bike  --- " + CountMotorBike + "\n------------------- " + "\nTotal Vehicles -- "
                + ( CountMiniTruck + CountMotorBike + CountMicro + CountPrivateCar + CountCng + CountBus + CountTruck)
                +"\nNumber of vehicles in lane-1 : " + CountLane1 + "\nNumber of vehicles in lane-2 : " + CountLane2;
    }
}










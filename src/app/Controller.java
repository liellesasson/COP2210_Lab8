package app;

import toolkit.ArrayProcessor;
import vehicle.Car;

public class Controller {

    //------------------------------------------------------------
    // beginning of main(String[] args)) method

    public static void main(String[] args) {

        for(int i = 0; i < 4; i++){
            int[] array = ArrayProcessor.createArrayWithInts(10,-100,1000);
            ArrayProcessor.displayElementsOfIntArray(array);
            System.out.println();
            System.out.println("Array Average: " + ArrayProcessor.averageOfIntArray(array));
            System.out.println();
        }

        Car[] cars = new Car[15];
        for(int i = 0; i < 15; i++){
            cars[i] = new Car();
            cars[i].displayInfo();
        }

        System.out.println();
        ArrayProcessor.findCarWithBestMPG(cars);
        ArrayProcessor.findCarWithWorstMPG(cars);

        ArrayProcessor.averageOfCarPrices(cars);

        System.out.println();
        System.out.println("===============================================");
        System.out.println("2d Arrays");
        System.out.println("===============================================");
        int[][] arrayWithinArrayOfInts = { {1}, {1,2}, {1,2,3}, {1,2,3,4} };
        for(int[] array : arrayWithinArrayOfInts) {
            System.out.print("{ ");
            for(int i = 0; i < array.length;i++){
                if(i < array.length - 1){
                    System.out.print(array[i] + ",");
                } else {
                    System.out.print(array[i]);
                }
            }
            System.out.println(" }\t Average of Array Entry: " + ArrayProcessor.averageOfIntArray(array));
        }

        System.out.println();
        ArrayProcessor.getEventsProcessed();
        System.out.println();

        

        yourInfoHeader();

    }

    //--------------------------
    // beginning of yourInfoHeader() method

    public static void yourInfoHeader(){

            System.out.println("===============================================");
            System.out.println("PROGRAMMER: " + "Lielle Sasson");
            System.out.println("PANTHER ID: " + "6304972");
            System.out.println();
            System.out.println("CLASS: \t\t COP2210 ");
            System.out.println("SECTION: \t " + "UO1");
            System.out.println("SEMESTER: \t " + "Spring 2022");
            System.out.println("CLASSTIME: \t " + "T/TH 9:30-12:15");
            System.out.println();
            System.out.println("Assignment: " + "Lab8");
            System.out.println();
            System.out.println("CERTIFICATION: \nI understand FIU's academic policies, and I certify");
            System.out.println("that this work is my own and that none of it is the");
            System.out.println("work of any other person.");
            System.out.println("===============================================");
            System.out.println();

        }//end yourInfoHeader



}//end Controller

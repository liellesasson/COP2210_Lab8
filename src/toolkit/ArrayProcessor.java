package toolkit;

import vehicle.Car;
import java.util.Random;

public class ArrayProcessor {

    private static int eventsProcessed = 0;

    public static int getEventsProcessed() {
        eventsProcessed++;
        System.out.println("===============================================");
        System.out.println("ArrayProcessor Events");
        System.out.println("===============================================");
        System.out.println("ArrayProcessor Events: " + eventsProcessed);
        return eventsProcessed;
    }

    public static int [] createArrayWithInts(int sizeOfArray, int min, int max) {
        eventsProcessed++;
        Random rndGen = new Random();
        int array[] = new int[sizeOfArray];

        for(int i = 0; i < sizeOfArray; i++) {
            array[i] = rndGen.nextInt((max-min) + 1) + min;
            }
        return array;
    }

    public static void displayElementsOfIntArray(int[] array) {
        System.out.println("===============================================");
        System.out.println("displayElementsOfIntArray");
        System.out.println("===============================================");
        eventsProcessed++;
        for(int i = 0; i < array.length; i++){
            if(i == array.length -1){
                System.out.print(array[1]);
            } else {
                System.out.print(array[1] + ",");
            }
        }

    }

    public static double averageOfIntArray(int[] array){
        eventsProcessed++;
        double sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        double average = sum/array.length;
        return average;
    }

    public static void findCarWithBestMPG(Car[] cars){
        eventsProcessed++;
        System.out.println("===============================================");
        System.out.println("findCarWithBestMPG");
        System.out.println("===============================================");
        Car max = cars[0];
        for(int i = 0; i < cars.length;i++) {
            if(max.getMpg() < cars[i].getMpg()) {
                max = cars[i];
            }
        }
    max.displayInfo();
    System.out.println();

    }

    public static void findCarWithWorstMPG(Car[] cars){
        eventsProcessed++;
        System.out.println("===============================================");
        System.out.println("findCarWithWorstMPG");
        System.out.println("===============================================");
        Car min = cars[0];
        for(int i = 0; i < cars.length;i++){
            if(min.getMpg() < cars[i].getMpg()) {
                min = cars[i];
            }
        }
        min.displayInfo();
        System.out.println();
    }

    public static double averageOfCarPrices(Car[] cars) {
        double sum = cars[0].getPrice();

        for(int i = 0; i < cars.length; i++) {
            sum += cars[i].getPrice();
        }
        double average = sum / cars.length;
        System.out.printf("Car Average Price: $%-20.2f \n", average);
        return average;
    }



}// end class ArrayProcessor

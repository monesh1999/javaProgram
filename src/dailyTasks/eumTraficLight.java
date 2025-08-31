package dailyTasks;

import java.util.Scanner;

enum TrafficLight { RED, GREEN, YELLOW }

public class eumTraficLight {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the traffic light (R/G/Y) :");
        String input = obj.next().toUpperCase();

        TrafficLight light = null;

        switch (input) {
            case "R":
                light = TrafficLight.RED;
                break;
            case "G":
                light = TrafficLight.GREEN;
                break;
            case "Y":
                light = TrafficLight.YELLOW;
                break;
            default:
                System.out.println("Invalid input!");
                System.exit(0);
        }

        String color = (light == TrafficLight.RED) ? "RGB(255,0,0)"
                : (light == TrafficLight.GREEN) ? "RGB(0,255,0)"
                : "RGB(255,255,0)";

        System.out.println("Traffic Light: " + light + " -> " + color);
    }
}

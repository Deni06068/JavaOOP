package workingWithAbstaction.trafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lights = scanner.nextLine().split("\\s+");
        List<TrafficLight> trafficLights = new ArrayList<>();

        for (String light : lights) {
            TrafficLight trafficLight = new TrafficLight(Colours.valueOf(light));
            trafficLights.add(trafficLight);
        }
        int changeCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < changeCount; i++) {
            for (TrafficLight trafficLight : trafficLights) {
                trafficLight.changeColor();
                System.out.print(trafficLight.getColor() + " ");
            }
            System.out.println();
        }

    }
}

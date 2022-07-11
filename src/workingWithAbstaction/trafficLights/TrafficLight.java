package workingWithAbstaction.trafficLights;

import java.io.BufferedReader;
import java.security.PublicKey;

public class TrafficLight {
    private Colours color;

    public TrafficLight(Colours color) {
        this.color = color;
    }

    public Colours getColor() {
        return color;
    }

    public void setColor(Colours color) {
        this.color = color;
    }

    public void changeColor() {
        switch (color) {
            case RED:
                this.color = Colours.GREEN;
                break;
            case GREEN:
                this.color = Colours.YELLOW;
                break;
            case YELLOW:
                this.color = Colours.RED;
                break;
        }
    }
}

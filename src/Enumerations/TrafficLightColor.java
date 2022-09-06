package Enumerations;

public enum TrafficLightColor {
    RED     ("Stop."),
    YELLOW  ("Prepare to stop."),
    GREEN   ("Go.");

private final String action;

    TrafficLightColor(String action) {
        this.action = action;
    }
    String action() {return action;}
}

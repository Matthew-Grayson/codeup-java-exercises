package Enumerations;

public class Main {
    public static void main(String[] args) {
        System.out.println(TrafficLightColor.GREEN.action());
        System.out.println(TrafficLightColor.YELLOW.action());
        System.out.println(TrafficLightColor.RED.action());
//        makeDrivingDecision(TrafficLightColor.GREEN);
//        makeDrivingDecision(TrafficLightColor.YELLOW);
//        makeDrivingDecision(TrafficLightColor.RED);

    }
//    public static void makeDrivingDecision(TrafficLightColor color) {
//        switch (color) {
//            case GREEN -> System.out.println("Go.");
//            case RED -> System.out.println("Stop.");
//            case YELLOW -> System.out.println("Prepare to stop.");
//        }
//    }
}

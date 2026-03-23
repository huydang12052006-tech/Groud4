import java.util.Scanner;

public class RiverArea extends Area {

    public RiverArea() {
        super();
    }

    public RiverArea(String areaId, String areaName, String areaType, int pollutionLevel) {
        super(areaId, areaName, areaType, pollutionLevel);
    }

    @Override
    public void input(Scanner scanner) {
        System.out.println("=== Input river area ===");
        super.input(scanner);
    }

    @Override
    public String toString() {
        return "=== River Area ===\n" + super.toString();
    }
}

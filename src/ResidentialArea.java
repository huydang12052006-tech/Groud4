import java.util.Scanner;

public class ResidentialArea extends Area {

    public ResidentialArea() {
        super();
    }

    public ResidentialArea(String areaId, String areaName, String areaType, int pollutionLevel) {
        super(areaId, areaName, areaType, pollutionLevel);
    }

    @Override
    public void input(Scanner scanner) {
        System.out.println("=== Input residential area ===");
        super.input(scanner);
    }

    @Override
    public String toString() {
        return "=== Residential Area ===\n" + super.toString();
    }
}

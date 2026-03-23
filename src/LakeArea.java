import java.util.Scanner;

public class LakeArea extends Area {

    public LakeArea() {
        super();
    }

    public LakeArea(String areaId, String areaName, String areaType, int pollutionLevel) {
        super(areaId, areaName, areaType, pollutionLevel);
    }

    @Override
    public void input(Scanner scanner) {
        System.out.println("=== Input lake area ===");
        super.input(scanner);
    }

    @Override
    public String toString() {
        return "=== Lake Area ===\n" + super.toString();
    }
}

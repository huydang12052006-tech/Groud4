import java.util.Scanner;

public class Area {

    private String areaId;
    private String areaName;
    private String areaType;
    private int pollutionLevel;

    public Area() {
    }

    public Area(String areaId, String areaName, String areaType, int pollutionLevel) {
        this.areaId = areaId;
        this.areaName = areaName;
        this.areaType = areaType;
        this.pollutionLevel = pollutionLevel;
    }

    public String getAreaId() {
        return this.areaId;
    }

    public String getAreaName() {
        return this.areaName;
    }

    public int getPollutionLevel() {
        return this.pollutionLevel;
    }

    public void input(Scanner scanner) {

        System.out.print("Enter area id: ");
        this.areaId = scanner.nextLine().trim();

        System.out.print("Enter area name: ");
        this.areaName = scanner.nextLine().trim();

        System.out.print("Enter area type: ");
        this.areaType = scanner.nextLine().trim().toLowerCase();

        System.out.print("Enter pollution level: ");
        this.pollutionLevel = Integer.parseInt(scanner.nextLine().trim());
    }

    public String evaluatePollution() {

        if (this.pollutionLevel < 30) {
            return "Good";
        } else if (this.pollutionLevel < 70) {
            return "Medium";
        } else {
            return "High";
        }
    }

    @Override
    public String toString() {
        return "Area id: " + this.areaId +
                "\nArea name: " + this.areaName +
                "\nArea type: " + this.areaType +
                "\nPollution level: " + this.pollutionLevel +
                "\nStatus: " + this.evaluatePollution();
    }
}

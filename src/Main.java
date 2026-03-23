import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Area findById(ArrayList<Area> areaList, String searchId) {

        searchId = searchId.trim().toLowerCase();

        for (Area area : areaList) {
            if (area.getAreaId().toLowerCase().equals(searchId)) {
                return area;
            }
        }
        return null;
    }

    public static void searchByName(ArrayList<Area> areaList, String keyword) {

        keyword = keyword.trim().toLowerCase();
        boolean isFound = false;

        for (Area area : areaList) {
            if (area.getAreaName().toLowerCase().contains(keyword)) {
                System.out.println(area);
                System.out.println();
                isFound = true;
            }
        }

        if (!isFound) {
            System.out.println("No area found");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Area> areaList = new ArrayList<>();

        areaList.add(new RiverArea("R01", "Red River", "river", 75));
        areaList.add(new LakeArea("L01", "West Lake", "lake", 45));
        areaList.add(new ResidentialArea("RS01", "Green Town", "residential", 20));
        areaList.add(new RiverArea("R02", "Blue River", "river", 85));

        System.out.println("===== DISPLAY ALL =====");
        for (Area area : areaList) {
            System.out.println(area);
            System.out.println();
        }

        System.out.print("Enter id to search: ");
        String id = scanner.nextLine();

        Area result = findById(areaList, id);

        if (result != null) {
            System.out.println("Found:");
            System.out.println(result);
        } else {
            System.out.println("Not found");
        }

        System.out.print("\nEnter keyword to search name: ");
        String keyword = scanner.nextLine();

        searchByName(areaList, keyword);

        int count = 0;
        for (Area area : areaList) {
            if (area.getPollutionLevel() >= 70) {
                count++;
            }
        }

        System.out.println("\nHigh pollution areas: " + count);

        System.out.println("\n===== TYPE CHECK =====");
        for (Area area : areaList) {
            if (area instanceof RiverArea) {
                System.out.println(area.getAreaId() + " is River Area");
            } else if (area instanceof LakeArea) {
                System.out.println(area.getAreaId() + " is Lake Area");
            } else if (area instanceof ResidentialArea) {
                System.out.println(area.getAreaId() + " is Residential Area");
            }
        }
    }
}

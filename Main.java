package Logistics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracking logisticsSystem = new Tracking();

        while (true) {
            System.out.println("Logistics Tracking System");
            System.out.println("1. Add Parcel");
            System.out.println("2. View All Parcels");
            System.out.println("3. Track Parcel");
            System.out.println("4. Update Parcel Status");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Parcel ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Parcel Description: ");
                    String description = scanner.nextLine();
                    logisticsSystem.addParcel(new Parcel(id, description));
                    break;
                case 2:
                    logisticsSystem.viewAllParcels();
                    break;
                case 3:
                    System.out.print("Enter Parcel ID to track: ");
                    String trackId = scanner.nextLine();
                    logisticsSystem.trackParcel(trackId);
                    break;
                case 4:
                    System.out.print("Enter Parcel ID to update: ");
                    String updateId = scanner.nextLine();
                    System.out.print("Enter new status: ");
                    String status = scanner.nextLine();
                    logisticsSystem.updateParcelStatus(updateId, status);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


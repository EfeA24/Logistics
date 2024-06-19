package Logistics;


import java.util.HashMap;
import java.util.Map;

public class Tracking {
    private Map<String, Parcel> parcelDatabase;

    public Tracking() {
        parcelDatabase = new HashMap<>();
    }

    public void addParcel(Parcel parcel) {
        if (parcelDatabase.containsKey(parcel.getId())) {
            System.out.println("Parcel ID already exists. Please use a unique ID.");
        } else {
            parcelDatabase.put(parcel.getId(), parcel);
            System.out.println("Parcel added successfully.");
        }
    }

    public void viewAllParcels() {
        if (parcelDatabase.isEmpty()) {
            System.out.println("No parcels to display.");
        } else {
            System.out.println("All Parcels:");
            for (Parcel parcel : parcelDatabase.values()) {
                System.out.println(parcel);
            }
        }
    }

    public void trackParcel(String id) {
        Parcel parcel = parcelDatabase.get(id);
        if (parcel != null) {
            System.out.println("Tracking Parcel:");
            System.out.println(parcel);
        } else {
            System.out.println("Parcel not found.");
        }
    }

    public void updateParcelStatus(String id, String status) {
        Parcel parcel = parcelDatabase.get(id);
        if (parcel != null) {
            parcel.setStatus(status);
            System.out.println("Parcel status updated successfully.");
        } else {
            System.out.println("Parcel not found.");
        }
    }
}

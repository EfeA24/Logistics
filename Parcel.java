package Logistics;

public class Parcel {

    private String id;
    private String description;
    private String status;

    public Parcel(String id, String description) {
        this.id = id;
        this.description = description;
        this.status = "Pending"; // Default status
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Parcel ID: " + id + ", Description: " + description + ", Status: " + status;
    }
}

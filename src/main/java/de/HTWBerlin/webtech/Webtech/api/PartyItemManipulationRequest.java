package de.HTWBerlin.webtech.Webtech.api;

public class PartyItemManipulationRequest {
    private String drinks;
    private String food;
    private String track;
    private String supplies;
    private int price;
    private boolean brought;

    public PartyItemManipulationRequest(String drinks, String food, String track, String supplies, int price, boolean brought) {
        this.drinks = drinks;
        this.food = food;
        this.track = track;
        this.supplies = supplies;
        this.price = price;
        this.brought = brought;
    }
    public PartyItemManipulationRequest() {}
    public String getDrinks() {
        return drinks;
    }

    public void setDrinks(String drinks) {
        this.drinks = drinks;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public String getSupplies() {
        return supplies;
    }

    public void setSupplies(String supplies) {
        this.supplies = supplies;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isBrought() {
        return brought;
    }

    public void setBrought(boolean brought) {
        this.brought = brought;
    }
}

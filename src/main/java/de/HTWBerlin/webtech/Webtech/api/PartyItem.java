package de.HTWBerlin.webtech.Webtech.api;

public class PartyItem {

    private long id;
    private String name;
    private String drinks;
    private String food;
    private String track;
    private String supplies;
    private int price;
    private boolean brought;


    public PartyItem(long id,String name, String drinks, String food, String track, String supplies, int price, boolean brought) {
        this.id = id;
        this.name = name;
        this.drinks = drinks;
        this.food = food;
        this.track = track;
        this.supplies = supplies;
        this.price = price;
        this.brought = brought;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDrinks() { return drinks; }
    public void setDrinks(String drinks) { this.drinks = drinks; }

    public String getFood() { return food; }
    public void setFood(String food) { this.food = food; }

    public String getTrack() { return track; }
    public void setTrack(String track) { this.track = track; }

    public String getSupplies() { return supplies; }
    public void setSupplies(String supplies) { this.supplies = supplies; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public boolean isBrought() { return brought; }
    public void setBrought(boolean brought) { this.brought = brought; }
}
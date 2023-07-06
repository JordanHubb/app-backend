package de.HTWBerlin.webtech.Webtech.persistence;


import javax.persistence.*;


@Entity(name = "partylist")
public class PartyItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "drinks", nullable = false)
    private String drinks;

    @Column(name = "food", nullable = true)
    private String food;

    @Column(name = "track", nullable = true)
    private String track;

    @Column(name = "supplies", nullable = true)
    private String supplies;

    @Column(name = "price", nullable = false)
    private int price;

    @Column(name = "brought", nullable = true)
    private boolean brought;


    public PartyItemEntity(String name, String drinks, String food, String track, String supplies, int price, boolean brought) {
        this.name = name;
        this.drinks = drinks;
        this.food = food;
        this.track = track;
        this.supplies = supplies;
        this.price = price;
        this.brought = brought;
    }

    public PartyItemEntity() {}

    public long getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.drinks = name; }

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

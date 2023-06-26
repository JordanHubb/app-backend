package persistence;

import jakarta.persistence.*;



@Entity(name = "Partylist")
public class PartyItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

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


    public PartyItemEntity(String drinks, String food, String track, String supplies, int price, boolean brought) {
        this.drinks = drinks;
        this.food = food;
        this.track = track;
        this.supplies = supplies;
        this.price = price;
        this.brought = brought;
    }

    protected PartyItemEntity() {}

    public long getId() { return id; }

    public String getDrinks() { return drinks; }
    public void setDrinks(String article) { this.drinks = article; }

    public String getFood() { return food; }
    public void setFood(String brand) { this.food = brand; }

    public String getTrack() { return track; }
    public void setTrack(String shop) { this.track = shop; }

    public String getSupplies() { return supplies; }
    public void setSupplies(String size) { this.supplies = size; }

    public int getPrice() { return price; }
    public void setPrice(int amount) { this.price = amount; }

    public boolean isBrought() { return brought; }
    public void setBrought(boolean received) { this.brought = received; }
}

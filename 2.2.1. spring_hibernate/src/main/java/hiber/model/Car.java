package hiber.model;

import javax.persistence.*;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String model;

    private int series;

    @OneToOne (mappedBy="car")
    private User user;

    public Car() {}

    public Car(int series, String model) {
        this.model = model;
        this.series = series;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }
    public void setSeries(int series) {
        this.series = series;
    }
}

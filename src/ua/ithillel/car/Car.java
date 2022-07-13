package ua.ithillel.car;

public class Car {
    private Transmission transmission;
    private Engine engine;
    private String color;
    private String model;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }
}


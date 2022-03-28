package web.model;

public class Car {

    private String model;
    private int series;
    private int point;

    public Car(String model, int series, int point) {
        this.model = model;
        this.series = series;
        this.point = point;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public int getPoint() {
        return point;
    }
}

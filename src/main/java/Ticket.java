public class Ticket implements Comparable<Ticket> {
    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDeparture() {
        return departure;
    }

//    public void setDeparture(String departure) {
//        this.departure = departure;
//    }

    public String getArrival() {
        return arrival;
    }

//    public void setArrival(String arrival) {
//        this.arrival = arrival;
//    }

//    public int getTravelTime() {
//        return travelTime;
//    }
//
//    public void setTravelTime(int travelTime) {
//        this.travelTime = travelTime;
//    }

    public Ticket(int id, int price, String departure, String arrival, int travelTime) {
        this.id = id;
        this.price = price;
        this.departure = departure;
        this.arrival = arrival;
        this.travelTime = travelTime;
    }

    protected int id;
    protected int price;
    protected String departure;
    protected String arrival;
    protected int travelTime;


    @Override
    public int compareTo(Ticket o) {
        if (this.price < o.getPrice()) {
            return -1;
        } else if (this.price > o.getPrice()) {
            return 1;
        } else {
            return 0;
        }
    }
}
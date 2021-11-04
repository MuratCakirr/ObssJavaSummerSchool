public class Bus {

    private int capacity;
    private Destination destination;
    private Passenger[] passengers;
    int i=0;

    public Bus(Destination destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        passengers = new Passenger[capacity];
    }

    public void insertPassenger(Passenger passenger){
        if(i==capacity){
            System.out.println("Bus is full");
        } else if(passenger.getDestination().equals(destination)){
            passengers[i] = passenger;
            System.out.println("Passenger inserted: " + passengers[i].getName());
            i++;
        } else {
            System.out.println("Destinations do not match");
        }
    }
}

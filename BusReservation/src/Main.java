public class Main {

    public static void main(String[] args) {
        Bus bus1 = new Bus(Destination.ANKARA,4);
        bus1.insertPassenger(new Passenger("Ali",Destination.ANKARA));
        bus1.insertPassenger(new Passenger("Veli",Destination.ANKARA));
        bus1.insertPassenger(new Passenger("Mehmet",Destination.ANKARA));
        bus1.insertPassenger(new Passenger("Mehmet",Destination.ANKARA));
        bus1.insertPassenger(new Passenger("Mehmet",Destination.ANKARA));

    }
}

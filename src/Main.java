import java.util.ArrayList;
/* Tänk nu att du ska köra från Göteborg till Malmö (ca 200 km).

* Print: Skriv ut information om alla fordon i listan,
* Calc: Beräkna hur mycket bränsle som krävs för att köra från Göteborg till Malmö med varje fordon.
* Print all info: Tänk på att skriva ut ALL information om fordonet, inte bara dess vehicle-egenskaper.

 *
    Brand: Märke och modell på fordonet
    Year: År då fordonet tillverkades
    Speed: Högsta hastighet
    Fuel: och bränsleförbrukning på fordonet (l/100km)
*/
class Main {
    public static void main(String[] args) {
        System.out.println("Hej! Här kommer ett program som skall beräkna kostnaden emellan 3 olika fordonstyper, \noch vad som är mest kostnadseffektivast att resa emellan Göteborg och Malmö.");
        System.out.println("--------------------------");
        System.out.println("Avstånd att åka: 200 km");
        System.out.println("Bensinpris: 19.42 kr/l");
        System.out.println("--------------------------\n");

        //ArrayLista i main, 1st fordon av varje sort (just nu, iallafall)
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
            vehicles.add(new Motorcycle("Ducati", "Panigale V4 (2019)", 0.65, 100, false));
            vehicles.add(new Car("Ford", "Mustang (1970)", 1.5, 120, 4));
            vehicles.add(new Truck("Volvo", "FH16 (2000)", 3.0, 80, 2, 2000));

/*funkar*/  for (Vehicle vehicle : vehicles) {
/*Loop*/        System.out.println("Märke: " + vehicle.getMake());
                System.out.println("Modell: " + vehicle.getModel());
                System.out.println("Maxfart: " + vehicle.getMaxSpeed() + " Km/h");
                System.out.println("Bränsleförbrukning: " + vehicle.getFuelConsumption() + " Liter per mil.");
                System.out.println("Bränsle som behövs för resan: " + vehicle.getDistance()*vehicle.getFuelConsumption() + " Liter.");


/*funkar*/      if (vehicle instanceof Car) {       //Loopar; if, om instanceOf (=Ifall, den hittar: Bil) Printa ut attributerna för den)
/*Bil*/             Car car = (Car) vehicle;
                    System.out.println("Antal dörrar: " + car.getNumDoors());   //returnerar dörrarna enligt beskrivning

/*funkar*/      } else if (vehicle instanceof Truck) {     //Loopar; if, om instanceOf (=Ifall, den hittar: Truck) Printa ut attributerna för den)
/*Lastbil*/         Truck truck = (Truck) vehicle;
                    System.out.println("Antal dörrar: " + truck.getNumDoors()); //returnerar dörrarna enligt beskrivning, + Lastkapacitet nedan.
                    System.out.println("Lastkapacitet: " + truck.getLoadingCapacity() + " Kg");

/*funkar*/      } else if (vehicle instanceof Motorcycle) {      //Loopar; if, om instanceOf (=Ifall, den hittar: Motorcykel) Printa ut attributerna för den)
/*Motorsikkel!*/    Motorcycle motorcycle = (Motorcycle) vehicle;
                    System.out.println("Finns vindruta?: " + motorcycle.getHasWindShield());  //returnerar vindruta, om den har det enligt beskrivning nedan
                }

                //Sak kvar att reda ut bara, nedan ----- vvvvvv (Endast totalkostnaden kvar att fixa, resten funkar)
                double cost = vehicle.getDistance()*vehicle.getFuelConsumption()*vehicle.getGasPrice();    //sista instans i loop, deklarera variabel för kostnad och printa ut den totala för sträcka, per varje modell som precis blivit instansierad.

                System.out.println("--------------------------");
                System.out.println("Bränslepris för att åka ovan angiven sträcka för just denna fordonstyp: " + cost + " Kr.");
                System.out.println();
        }

    }
}

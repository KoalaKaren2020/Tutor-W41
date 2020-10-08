public class Main {

    public static void main(String[] args) {


        Driver a1 = new Driver("Elias", 27);

        Car c1 = new Car("lamborghini", "aventador", 2020, "sportscar" );

        Car c2 = new Car("ford", "Focus", 2003, "lowrider");

        c1.setDriver("Elias");

        System.out.println(c1);
        System.out.println(a1);

        System.out.println(c2);
        System.out.println(a1);
    }

}

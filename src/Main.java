import java.awt.print.Book;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Person[] persons ={
                new Person("Camina","Asina")};

        Country[] countries={
                new Country("Kyrgyzstan")};

        City[] cities={
                new City("Naryn")};

        Address[] addresses={
                new Address("Alieva 123",123456)};

        for (Person person:persons) {
            System.out.println(person.getFirstName()+"\n"+person.getLastName());
        }
        for (Country country:countries) {
            System.out.println(country.getName());
        }
        for (City city:cities){
            System.out.println(city.getName());
        }
        for (Address adress:addresses) {
            System.out.println(adress.getStreet()+"\n"+adress.getZip());
        }

        //  int[] variant2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
       /* String [] addresses={"gfvfr","frfvrdf"};
        for (String address : addresses) {
            System.out.println(address.getStreet() + " " + address.getZip());
        }
        for (int i = 0; i < addresses.length; i++) {
            addresses[i]=scanner.nextLine();
            addresses[i]=scanner.nextLine();

        }*/
       /* Address[] addresses = new Address[] {
                new Address("123 Main St", "10001"),
                new Address("456 Queen St", "M4C 1M1"),
                new Address("789 Av Reforma", "01000")
        };*/


                /*       new Country("USA"),
                       new Country("Canada"),
                       new Country("Mexico")
               };

               City[] cities = new City[] {
                       new City("New York"),
                       new City("Toronto"),
                       new City("Mexico City")
               };

               Address[] addresses = new Address[] {
                       new Address("123 Main St", "10001"),
                       new Address("456 Queen St", "M4C 1M1"),
                       new Address("789 Av Reforma", "01000")
               };

               Person[] identities = new Person[] {
                       new identities("John", "Doe"),
                       new P("Jane", "Doe"),
                       new Identity("Jim", "Smith")
               };

               for (Country country : countries) {
                   System.out.println(country.getName());
               }

               for (City city : cities) {
                   System.out.println(city.getName());
               }

               for (Address address : addresses) {
                   System.out.println(address.getStreet() + " " + address.getZip());
               }

               for (Identity identity : identities) {
                   System.out.println(identity.getFirstName() + " " + identity.getLastName());
               }*/

    }

}
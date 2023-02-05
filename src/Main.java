

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


    }

}
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        University university = new University();
        university.setNameUniver("Ala-Too");
        university.setPeoplsOfUniver(1452);
        university.setLocalDateOfStartWorkUni(LocalDate.of(2004, 1, 14));

        University university1 = new University();
        university1.setNameUniver("Manas");
        university1.setPeoplsOfUniver(1458);
        university1.setLocalDateOfStartWorkUni(LocalDate.of(2007, 1, 8));

        University university2 = new University();
        university2.setNameUniver("Ala-Buka");
        university2.setPeoplsOfUniver(4587);
        university2.setLocalDateOfStartWorkUni(LocalDate.of(2004, 4, 15));

        Shcool shcool = new Shcool();
        shcool.setNameOfSchool("J.Bokondaev");
        shcool.setLocalDatezofStarShcool(LocalDate.of(2004, 4, 23));
        shcool.setPeopleOfSchool(458);

        Shcool shcool1 = new Shcool();
        shcool1.setNameOfSchool("Koldoshev");
        shcool1.setLocalDatezofStarShcool(LocalDate.of(2004, 4, 7));
        shcool1.setPeopleOfSchool(4578);

        Shcool shcool2 = new Shcool();
        shcool2.setNameOfSchool("Nadirov");
        shcool2.setPeopleOfSchool(479);
        shcool2.setLocalDatezofStarShcool(LocalDate.of(2004, 4, 5));

        Person person = new Person();
        person.setName("Nurlan");
        person.setAge(15);
        person.setTelNomber("0777289688");

        Person person1 = new Person();
        person1.setTelNomber("0778965485");
        person1.setAge(45);
        person1.setName("Erjan");

        Person person2 = new Person();
        person2.setName("Erik");
        person2.setAge(47);
        person2.setTelNomber("0771457889");

        Car car = new Car();
        car.setNameOfCar("Mersedez");
        car.setPriceOfCar(4500);
        car.setLocalDateOfCar(LocalDate.of(2000, 1, 25));

        Car car1 = new Car();
        car1.setNameOfCar("Tiko");
        car1.setPriceOfCar(1000);
        car1.setLocalDateOfCar(LocalDate.of(2000, 4, 5));

        Car car2 = new Car();
        car2.setNameOfCar("Matiz");
        car2.setPriceOfCar(4700);
        car2.setLocalDateOfCar(LocalDate.of(2001, 4, 8));

        University[] allunivers = {university, university1, university2};
        Shcool[] allshools = {shcool, shcool2, shcool1};
        Person[] allpersons = {person, person1, person2};
        Car[] allcars = {car, car1, car2};
        for (int i = 0; i < allunivers.length; i++) {
            System.out.println("Name: " + allunivers[i].getNameUniver() + "|  People: " + allunivers[i].getPeoplsOfUniver() +
                    " | Date of Start work: " + allunivers[i].getLocalDateOfStartWorkUni());
        }
        System.out.println();
        for (int i = 0; i < allshools.length; i++) {
            System.out.println("Name: " + allshools[i].getNameOfSchool() + "| Peoples: " + allshools[i].getPeopleOfSchool() +
                    "| Date of Start work: " + allshools[i].getLocalDatezofStarShcool());

        }
        System.out.println();
        for (int i = 0; i < allcars.length; i++) {
            System.out.println("Name: " + allcars[i].getNameOfCar() + "| Price: " + allcars[i].getPriceOfCar() +
                    "|Date of found: " + allcars[i].getLocalDateOfCar());
        }
        System.out.println();
        for (int i = 0; i < allpersons.length; i++) {
            System.out.println("Name: " + allpersons[i].getName() + "| Age: " + allpersons[i].getAge() +
                    "| Telephone number: " + allpersons[i].getTelNomber());

        }


    }
}
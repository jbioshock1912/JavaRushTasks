package tasks.dogs;

public class Start {

    public static void main(String[] args) {
        Dog hound = new Dog(25, "winter", "haski");
        Owner person = new Owner("julia", "sabirova");
        hound.setPerson(person);
        person.setHound(hound);
        System.out.print(hound.toString());
        System.out.println(person.toString());
        hound.bark();
    }
}

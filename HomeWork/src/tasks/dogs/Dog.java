package tasks.dogs;

public class Dog {
    private int weight;
    private String name;
    private String type;
    private Owner person;

    public void setPerson(Owner person) {
        this.person = person;
    }

    public String toString() {
        return weight + " " + name + " " + type + " ";
    }

    public void bark() {
        System.out.println("sound");
    }

    public Dog(int weight, String name, String type, Owner person) {
        this.weight = weight;
        this.name = name;
        this.type = type;
        this.person = person;
    }

    public Dog(int weight, String name, String type) {
        this.weight = weight;
        this.name = name;
        this.type = type;
    }
}

//Маленькое, но важное уточнение. Конструктор в классе  пишется сразу после того места, где обьявлены переменные класса и до остальных методов в классе. Надо исправить.

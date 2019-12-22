package tasks.dogs;

public class Owner {
    private String name;
    private String secondName;
    private Dog hound;

    public void setHound(Dog hound) {
        this.hound = hound;
    }
    public String toString(){
        return name + " " + secondName;
    }

    public Owner(String name, String secondName, Dog hound) {
        this.name = name;
        this.secondName = secondName;
        this.hound = hound;
    }

    public Owner(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;

    }
}

//Маленькое, но важное уточнение. Конструктор в классе  пишется сразу после того места, где обьявлены переменные класса и до остальных методов в классе. Надо исправить.
//Удалить пустые строки.!!!Они лишние
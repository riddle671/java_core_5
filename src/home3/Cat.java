package home3;

public class Cat {

    String name;
    String color;
    int age;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(name + "sosat");

    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}


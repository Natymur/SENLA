package lesson1;

public class Test {
    public static void main(String[] args) {

        Cat cat = new Cat("Saimon", "white", 2,6);

        System.out.println("My cat\'s name "+ cat.getName() +", his color is "+ cat.getColor()+ ", he is " + cat.getAge() + " years old and his weight is " + cat.getWeight());
        System.out.println(cat.getName() + " can:");
        cat.voice();
        cat.run();


        Cat cat2 = new Cat("Vasiliy","black");
        System.out.println("Name: " + cat2.getName() + ", color: "+ cat2.getColor() + ", age: " + cat2.getAge() + ", weight: " + cat2.getWeight());
    }
}

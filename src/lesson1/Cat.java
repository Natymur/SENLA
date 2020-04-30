package lesson1;

public class Cat {

    private String name;
    private String color;
    private int age;
    private int weight;

    public Cat(String name, String color, int age, int weight){
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public Cat(String name, String color){
        this(name, color, 5, 5);
    }

    public Cat(){
        this("Unnamed cat", "some color", 5, 5);
    }


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }



    public void voice (){
        System.out.println("mrrr!");
    }
    public void run() {
        System.out.println("top-top");
    }
}

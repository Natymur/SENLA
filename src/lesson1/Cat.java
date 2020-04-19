package lesson1;

public class Cat {

    String color;
    private int maxAge = 10;
    int weight = 0;

    public int getMaxAge(){
        return maxAge;
    }

    public void voice (){
        System.out.println("МЯУ!");
    }
    public void run() {
        System.out.println("тыгыдык-тыгыдык");
    }
}

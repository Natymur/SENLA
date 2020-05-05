package task2;

public class Good {
    private static int counterOfGoods;
    private static int counterOfAllWeight;

    public Good(){
        Good.counterOfGoods++;
    }

    public static int getCounterOfGoods(){
        return counterOfGoods;
    }
    public static void setCounterOfAllWeight(int weight){
        Good.counterOfAllWeight += weight;
    }
    public static int getCounterOfAllWeight(){
        return counterOfAllWeight;
    }
}

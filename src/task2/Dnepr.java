package task2;

public class Dnepr extends Moto{
    public Dnepr(String model) {
        super(model);
        int weight = 200;
        Good.setCounterOfAllWeight(weight);
    }
}

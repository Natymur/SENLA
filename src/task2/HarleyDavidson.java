package task2;

public class HarleyDavidson extends Moto {


    public HarleyDavidson(String model) {
        super(model);
        int weight = 300;
        Good.setCounterOfAllWeight(weight);

    }
}

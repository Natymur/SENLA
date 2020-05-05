package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        Storage storage = new Storage();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String modelForDnepr = "Dnepr";
        String modelForHarley = "Harley";

        for(int i = 0; i <storage.getMaxCountOfGoods();i++){
            System.out.println("Enter the model");
            String modelIn = reader.readLine();

            if (modelIn.equals(modelForDnepr)){
                Good dnepr = new Dnepr(modelIn);
            } else if (modelIn.equals(modelForHarley)){
                Good harley = new HarleyDavidson(modelIn);
            } else {
                System.out.println("Model is wrong. Please, enter \"Dnepr\" or \"Harley\"");
            }
            System.out.println("Moto№" + (i+1) +": model is " + modelIn);
        }

        System.out.println("The number of goods on the stopage is " + Good.getCounterOfGoods());
        System.out.println("The total weight of goods in stock is: " + Good.getCounterOfAllWeight());
    }
}

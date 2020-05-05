package task1;

public class Solution {
    public static void main(String[] args) {
        int number = new java.util.Random().nextInt(999);
        System.out.println(number);
        System.out.println(sumOfNumbers(number));
    }


    public static int sumOfNumbers(int number){
        int result = 0;
        while (number>0){
            result += number%10;
            number /= 10;
        }
        return result;
    }

}

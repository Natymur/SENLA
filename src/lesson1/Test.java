package lesson1;

public class Test {
    public static void main(String[] args) {

        Siamese myCat = new Siamese();

        System.out.println("Мой цвет " + myCat.color + ", я могу прожить " + myCat.getMaxAge() + " лет, если ты меня будешь любить и я могу весить " + myCat.weight + " кг, если ты меня будешь хорошо кормить :)");
        System.out.println("А сейчас я покажу тебе всё, на что я способен:");
        myCat.voice();
        myCat.run();
        myCat.jump();




    }
}

import Fruits.Apple;
import Fruits.Orange;
public class Lesson1<T> {
    public static void main(String[] args) {
        Box<Apple> boxWithApples = new Box<>();
        boxWithApples.addFruits(new Apple(), new Apple(), new Apple());
        System.out.println("Box with Apples = " + boxWithApples.getWeight());

        Box<Orange> boxWithOranges = new Box<>();
        boxWithOranges.addFruits(new Orange(), new Orange());
        System.out.println("Box with Oranges = " + boxWithOranges.getWeight());


        System.out.println("Compare Box = " + boxWithApples.compare(boxWithOranges));
        System.out.println("Put Apple in Box:");
        boxWithApples.addFruits(new Apple());
        System.out.println("Compare Box = " + boxWithApples.compare(boxWithOranges));


        Box<Apple> emptyBoxOfApples = new Box<Apple>();
        boxWithApples.transferTo(emptyBoxOfApples);


        System.out.println("Total:");
        System.out.println("Weight Box with Apples = " + boxWithApples.getWeight());

        System.out.println("Weight Box with Oranges = " + boxWithOranges.getWeight());
    }
}
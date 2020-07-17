import Fruits.Fruit;
import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> content = new ArrayList<>();

    public void addFruits(T... fruit) {
        for(T item: fruit) content.add(item);
    }

    public double getWeight() {
        if (content.size() == 0) return 0f;
        return content.get(0).getWeight() * content.size();
    }

    public boolean compare(Box<?> withBox) {
        return getWeight() == withBox.getWeight();
    }

    public void transferTo(Box<T> toBox) {
        if (getWeight() == 0) return;

        toBox.content.addAll(content);
        content.clear();
    }
}
package DZ03;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Olga Shestakova
 * Date 23.07.2021
 */
public class Box<T extends Fruit> implements Comparable<Box<? extends Fruit>> {
    private List<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public List<T> getFruits() {
        return fruits;
    }

    public float getWeight() {
        if (fruits.isEmpty()) {
            return 0.0f;
        }
        return fruits.get(0).getWeight() * fruits.size();
    }

    public boolean compare(Box<? extends Fruit> that) {
        return getWeight() == that.getWeight();
    }

    @Override
    public int compareTo(Box<? extends Fruit> that) {
        return Float.compare(getWeight(), that.getWeight());
    }

    public void bulk(Box<T> that) {
        fruits.addAll(that.getFruits());
        that.getFruits().clear();
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }
}

package Box;

import java.util.ArrayList;
import java.util.Arrays;


public class Box<T extends Fruit> {

    private ArrayList<T> list;
    private ArrayList<T> Box;

    public Box() {
        this.list = new ArrayList<>();
    }

    @SafeVarargs
    public Box(T... fruits) {
        this.list = new ArrayList<>(Arrays.asList(fruits));
    }

    public float getWeight() {
        float weight = 0.0f;

        for (T o : list) {
            weight += o.getWeight();
        }

        return weight;
    }

    public void pour(Box<T> another) {
        another.list.addAll(list);
        list.clear();
    }

    public void add(T fruit) {
        list.add(fruit);
    }

    public void addFruit(T orange, int i) {
    }

    public String compare(Box.Box<Apple> ap) {

        class box<T extends Fruit> {
            public ArrayList<T> list;
            private ArrayList<T> box = new ArrayList<>();

            public void Box(T... fruits) {
                box = new ArrayList<>(Arrays.asList(fruits));
            }

            public float getWeight() {
                float weight = 0.0f;
                for (int i = 0; i < box.length; i++) {
                }
                for (T o : box) {
                    weight += o.getWeight();
                }
                return weight;
            }

            public boolean compare(Box anotherBox) {
                if (getWeight() == anotherBox.getWeight()) return true;
                return false;
            }

            public void pourTo(Box<T> anotherBox) {
                anotherBox.Box.addAll(box);
                box.clear();
            }

            //еще способ добавить фрукты
            public void addFruit(T fruit, int amount) {
                for (int i = 0; i < amount; i++) {
                    box.add(fruit);
                }
            }
        }
    }
package test;

public class MyCarsList {
    private String[] cars = new String[10];

    private int size = 0;

    public String get(int index){
        return cars[index];
    }

    public void add(String element) {
        cars[size] = element;
        size++;
        if (size == cars.length) {
            String[] newCarsArray = new String[cars.length * 2];
            for (int i = 0; i < cars.length; i++) {
                newCarsArray[i] = cars[i];
            }
            cars = newCarsArray;
        }
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            cars[i] = cars[i + 1];
        }
        cars[size] = null;
        size--;
    }

    public void remove(String name) {
        for (int i = 0; i < size; i++) {
            if(cars[i].equals(name)) {
                remove(i);
                return;
            }
        }
    }

    public int getSize() {
        return size;
    }
}

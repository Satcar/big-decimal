import java.util.Arrays;

public class IntArrayList implements  IntList{

    private int[] data;
    private int size;

    public IntArrayList() {
        data = new int[10];
        size = 0;
    }

    protected boolean isFull(){
        return size == data.length;
    }

    @Override
    public void add(int number) {
        if (isFull()) {
            int newSize = data.length + data.length / 2;
            data = Arrays.copyOf(data, newSize);
        }
        data[size] = number;
        size++;

    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) {
            System.out.printf("Error: El indice introducido debe estar entre 0 y %d", data.length);
            return -1;
        }

        return data[id];
    }
}

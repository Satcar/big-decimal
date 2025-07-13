import java.util.Arrays;

public class IntVector implements IntList {

    private int[] data;
    private int size;

    public IntVector() {
        data = new int[20];
        size = 0;
    }

    private boolean isFull() {
        return size == data.length;
    }

    @Override
    public void add(int number) {
        if (isFull()) {
            int newSize = data.length * 2;
            data = Arrays.copyOf(data, newSize);
        }
        data[size] = number;
        size++;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) {
            System.out.printf("Error: El indice debe estar entre 0 y %d\n", size - 1);
            return -1;
        }
        return data[id];
    }
}

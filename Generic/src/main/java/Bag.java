import java.util.ArrayList;
import java.util.List;

public class Bag<T extends Tool>{

    private List<T> tools;

    public Bag() {
        tools = new ArrayList<>();
    }

    public float getSize() {
        float result = 0;
        for (T tool : tools) {
            result += tool.getSize();
        }
        return result;
    }

    public void add(T tool) {
        tools.add(tool);
    }

    public int compare(Bag<?> another) {
        return Float.compare(getSize(), another.getSize());
    }

    public static <U extends Tool> void transfer(Bag<? extends U> src, Bag<? super U> dst) {
        dst.tools.addAll(src.tools);
        src.tools.clear();
    }
}

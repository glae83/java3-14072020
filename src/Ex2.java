import java.util.ArrayList;
public class Ex2<T> {


    public ArrayList<T> convertToArrayList (T... arr) {
        ArrayList<T> result = new ArrayList<T>();

        for (T item: arr ) result.add(item);

        return result;
    }
}
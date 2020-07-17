public class Ex1<T> {

    public void swapElements (T arr[],  int indxFirst, int indxSecond) {
        T tmp;
        tmp = arr[indxSecond];
        arr[indxSecond] = arr[indxFirst];
        arr[indxFirst] = tmp;
    }
}
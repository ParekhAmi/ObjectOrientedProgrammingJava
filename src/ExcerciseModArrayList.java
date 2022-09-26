import java.util.ArrayList;

//---------------Inheritance---------------------------------

public class ExcerciseModArrayList<D> extends ArrayList<D> {
    public D getUsingMod(int index) {
        int validIndex = Math.abs(index) % this.size();
        return this.get(validIndex);
    }
}

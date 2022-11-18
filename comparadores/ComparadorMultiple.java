package comparadores;

import java.util.Comparator;

public class ComparadorMultiple<T> implements Comparator<T> {
    Comparator<T> c1, c2;

    public ComparadorMultiple(Comparator<T> c1, Comparator<T> c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public int compare(T a1, T a2) {
        int resu = c1.compare(a1,a2);
        if (resu == 0)
            return c2.compare(a1,a2);
        return resu;
    }
}

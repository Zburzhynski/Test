package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import entity.Pair;

/**
 * @author Uladzimir_Zburzhynski
 */
public class GenericUtil {

    public static <T extends Comparable<T>> Pair<T> minmax(T[] arr) {
        if (arr == null || arr.length == 0)
            return null;
        T max = arr[0];
        T min = arr[0];
        for (T t : arr) {
            if (min.compareTo(t) > 0)
                min = t;
            if (max.compareTo(t) < 0)
                max = t;
        }
        return new Pair<T>(min, max);
    }

    public static void swap(Pair<?> p) {
        swapHelper(p);
    }

    public static <T> void swapHelper(Pair<T> p) {
        T obj = p.getFirst();
        p.setFirst(p.getSecond());
        p.setSecond(obj);
    }

    public static <T> void copyList(List<? extends T> src, List<? super T> dest) {
        for (T t : src) {
            dest.add(t);
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> List<T> listFromFile(String filename)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(
                filename));
        List<T> list = (List<T>) in.readObject();
        in.close();
        return list;
    }

    public static <T> Pair<T> makePair(Class<T> clazz)
            throws InstantiationException, IllegalAccessException {
        return new Pair<T>(clazz.newInstance(), clazz.newInstance());
    }
}

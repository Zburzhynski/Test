package generic;

import entity.Pair;

/**
 * @author Uladzimir_Zburzhynski
 */
public class Main {

    public static void main(String[] args) {
        Long[] arr = {1L, 2L, 3L, 4L, 5L};
        Pair<Long> pair = GenericUtil.minmax(arr);
        System.out.println("Min=" + pair.getFirst() + " Max=" + pair.getSecond());

        Pair<Long> p = new Pair<Long>(1L, 2L);
        System.out.println("First=" + p.getFirst() + " Second=" + p.getSecond());
        GenericUtil.swap(p);
        System.out.println("First=" + p.getFirst() + " Second=" + p.getSecond());
    }

}

package recursion;

/**
 * @author Uladzimir_Zburzhynski
 */
public class Recursion {

    public Long factorial(Long a) {
        if (a == 1) {
            return 1L;
        }
        return a * factorial(--a);
    }

    public void inc(Long to) {
        if (to < 1) {
            return;
        }
        inc(--to);
        System.out.println(to);
    }

}

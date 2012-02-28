package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Uladzimir_Zburzhynsk
 */
public class TraceHandler implements InvocationHandler {

    private Test test;

    public TraceHandler(Test test) {
        this.test = test;
    }

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        System.out.println("*** Intercept ***");
        return method.invoke(test, args);
    }

}

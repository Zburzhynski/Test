package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Uladzimir_Zburzhynski
 */
public class Main {

    public static void main(String[] args) {
        Test test = new Test();
        test.setField("Zburzhynski");
        InvocationHandler handler = new TraceHandler(test);
        Class[] interfaces = test.getClass().getInterfaces();
        ProxyInterface proxy = (ProxyInterface) Proxy.newProxyInstance(
                Test.class.getClassLoader(), interfaces, handler);
        System.out.println("Request for name:" + proxy.getField());
    }
}

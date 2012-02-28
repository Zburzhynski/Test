package callback;

import java.util.List;

import entity.Employee;

/**
 * @author Uladzimir_Zburzhynski
 */
public class CallbackTest {

    public void execution(List<Employee> list, CallbackFunction function) {
        for (Employee employee : list) {
            function.cMethod(employee);
        }

    }

}

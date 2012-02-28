package callback;

import entity.Employee;

/**
 * @author Uladzimir_Zburzhynsk
 *
 */
public class Division implements CallbackFunction {

    public void cMethod(Employee employee) {
        employee.setSalary(employee.getSalary()/2L);
    }

}

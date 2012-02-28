package callback;

import entity.Employee;


/**
 * @author Uladzimir_Zburzhynski
 */
public class Multiplication implements CallbackFunction {

    public void cMethod(Employee employee) {
        employee.setSalary(employee.getSalary()*2);
    }

}

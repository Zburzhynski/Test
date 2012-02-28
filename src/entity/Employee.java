package entity;

import java.io.Serializable;

/**
 * @author Uladzimir_Zburzhynsk
 */
public class Employee implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 3846647387649641794L;

    /**
     *
     */

    private Long id;

    private String name;

    private String surname;

    private String patronymic;

    private Long salary;

    /**
     *
     */
    public Employee() {
        salary = 0L;
    }

    /**
     *
     */
    public Employee(Long id, String name, String surname, String patronymic,
            Long salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.salary = salary;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the patronymic
     */
    public String getPatronymic() {
        return patronymic;
    }

    /**
     * @param patronymic the patronymic to set
     */
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    /**
     * @return the salary
     */
    public Long getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "[" + name + " " + surname + " " + patronymic + " Salary="
               + salary + "]";
    }

}

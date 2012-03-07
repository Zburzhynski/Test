import java.util.ArrayList;
import java.util.List;

import entity.Employee;
import entity.Manager;
import generic.GenericUtil;


/**
 * @author Uladzimir_Zburzhynski
 */
public class Main {

    // public static void main(String[] args) throws FileNotFoundException,
    // IOException {
    // // Employee employee3 = new Employee(3L, "A", "A", "A");
    // // Employee employee1 = new Employee(2L, "B", "B", "B");
    // // Employee employee2 = new Employee(1L, "C", "C", "C");
    // //
    // // class EmployeeComporator implements Comparator<Employee> {
    // // public int compare(Employee e1, Employee e2) {
    // // //return e1.getName().compareTo(e2.getName());
    // // return (int) (e1.getId()-e2.getId());
    // // }
    // // }
    // ////
    // //// Set<Employee> list = new TreeSet<Employee>(new
    // EmployeeComporator());
    // // List<Employee> list = new ArrayList<Employee>();
    // //// map.put("1", employee1);
    // //// map.put("2", employee2);
    // //// map.put("3", employee3);
    // // //Set<Employee> list = new TreeSet<Employee>();
    // // list.add(employee2);
    // // list.add(employee1);
    // // list.add(employee3);
    // // System.out.println("BEFORE: "+list);
    // //
    // // Collections.sort(list, Collections.reverseOrder(new
    // EmployeeComporator()));
    // // System.out.println("AFTER: "+list);
    //
    // // map.remove("2");
    //
    // // for(Map.Entry<String, Employee> entry : map.entrySet()) {
    // // String key = entry.getKey();
    // // Employee employee = entry.getValue();
    // // System.out.println(key + " " + employee.getName());
    // // }
    //
    // //Collections.sort(list);
    // //System.out.println("AFTER: "+list);
    // // Iterator<Employee> iterator = list.iterator();
    // // while (iterator.hasNext()) {
    // // Employee e = iterator.next();
    // // //System.out.println(e);
    // // if (e.getName() == "A")
    // // e.setName("XZ");
    // // }
    // // System.out.println(list);
    // //
    // // List<Employee> lnkList = new LinkedList<Employee>(list);
    // // lnkList.add(new Employee(999L,"Q","Q","Q"));
    // // System.out.println(lnkList);
    // // Pair<String> pair = new Pair<String>("Topor", "Laptop");
    // // System.out.println(pair.getFirst()+ " " + pair.getSecond());
    //
    // // Long[] arr = {7L,5L,1L,4L,2L};
    // // Pair<Long> pair =ArrayAlg.minmax(arr);
    // // String[] arr = {"Vladimir","Boris","Andrey","Roma","Kiril"};
    //
    //
    //
    // // Pair<String> pair =ArrayAlg.minmax(arr);
    // // System.out.println("Min="+pair.getFirst()+ " Max=" +
    // pair.getSecond());
    //
    // Manager manager1 = new Manager();
    // manager1.setName("Vladimir");
    // manager1.setSurname("Zburzhyski");
    // manager1.setPatronymic("Vitalyevich");
    // manager1.setLanguage("English");
    // manager1.setExperience(5L);
    //
    // Manager manager2 = new Manager();
    // manager2.setName("Roman");
    // manager2.setSurname("Pleshkov");
    // manager2.setPatronymic("Sergeevich");
    // manager2.setLanguage("Spanish");
    // manager2.setExperience(9L);
    //
    // List<Employee> employees = new ArrayList<Employee>();
    // employees.add(manager1);
    //
    // List<Manager> managers = new ArrayList<Manager>();
    // managers.add(manager2);
    //
    // System.out.println(employees);
    // System.out.println(managers);
    //
    // ArrayAlg.copyList(managers,employees);
    //
    // System.out.println("---------------------------------------------------");
    // System.out.println(employees);
    //
    // ObjectOutputStream out = new ObjectOutputStream(new
    // FileOutputStream("employee.dat"));
    // out.writeObject(employees);
    //
    // System.out.println("Read from file:");
    // // ObjectInputStream in = new ObjectInputStream(new
    // FileInputStream("employee.dat"));
    // // try {
    // // @SuppressWarnings("unchecked")
    // // List<Employee> list = (List<Employee>) in.readObject();
    // // in.close();
    // // System.out.println(list);
    // // } catch (ClassNotFoundException ex) {
    // // ex.printStackTrace();
    // // }
    // // try {
    // // List<Employee> list = ArrayAlg.listFromFile("employee.dat");
    // // System.out.println(list);
    // // } catch (ClassNotFoundException ex) {
    // // System.out.println("File not found!!!");
    // // ex.printStackTrace();
    // // }
    // //
    // // try {
    // // Pair<Employee> pair = ArrayAlg.makePair(Employee.class);
    // // Pair<Employee> pair1 = new Pair<Employee>();
    // // System.out.println(pair.getFirst()+" "+pair.getSecond());
    // // System.out.println(pair1.getFirst()+" "+pair1.getSecond());
    // // } catch (InstantiationException ex) {
    // // // TODO Auto-generated catch block
    // // ex.printStackTrace();
    // // } catch (IllegalAccessException ex) {
    // // // TODO Auto-generated catch block
    // // ex.printStackTrace();
    // // }
    // String className="Employee";
    // try {
    // Employee employee = (Employee) Class.forName(className).newInstance();
    // employee.setName("name");
    // employee.setSurname("surname");
    // employee.setPatronymic("patronymic");
    // System.out.println("Before: " + employee);
    //
    // Class<Employee> clazz = Employee.class;
    // Field field = clazz.getDeclaredField("name");
    // field.setAccessible(true);
    // field.set(employee, "Uladzimir");
    // System.out.println("After: " + employee);
    // System.out.println("------------------");
    // Method m = ArrayAlg.class.getDeclaredMethod("fromFile",String.class);
    // m.setAccessible(true);
    // try {
    // System.out.println("Method invoke: " + m.invoke(null,"employee.dat"));
    // Seazon seazon = Seazon.AUTUMN;
    // System.out.println(seazon);
    // } catch (IllegalArgumentException ex) {
    // ex.printStackTrace();
    // } catch (InvocationTargetException ex) {
    // ex.printStackTrace();
    // }
    //
    // } catch (InstantiationException ex) {
    // ex.printStackTrace();
    // } catch (IllegalAccessException ex) {
    // ex.printStackTrace();
    // } catch (ClassNotFoundException ex) {
    // ex.printStackTrace();
    // } catch (SecurityException ex) {
    // ex.printStackTrace();
    // } catch (NoSuchFieldException ex) {
    // ex.printStackTrace();
    // } catch (NoSuchMethodException ex) {
    // ex.printStackTrace();
    // }
    //
    // }
    //
    // enum Seazon {
    // WINTER, SPRING, AUTUMN, SUMMER
    // }

    public static void  main(String[] args) {
//         Recursion rec = new Recursion();
//         Long b = rec.factorial(5L);
//         System.out.println(b);
//         rec.inc(10L);
//        List<Employee> list = new ArrayList<Employee>();
//        Employee e1 = new Employee(1L, "1", "1", "1");
//        Employee e2 = new Employee(2L, "2", "2", "2");
//        Employee e3 = new Employee(3L, "3", "3", "3");
//        Employee e4 = new Employee(4L, "4", "4", "4");
//        Employee e5 = new Employee(5L, "5", "5", "5");
//        Employee e6 = new Employee(6L, "6", "6", "6");
//        Employee e7 = new Employee(7L, "7", "7", "7");
//        Employee e8 = new Employee(8L, "8", "8", "8");
//        Employee e9 = new Employee(9L, "9", "9", "9");
//        Employee e10 = new Employee(10L, "10", "10", "10");
//        list.add(e1);
//        list.add(e2);
//        list.add(e3);
//        list.add(e4);
//        list.add(e5);
//        list.add(e6);
//        list.add(e7);
//        list.add(e8);
//        list.add(e9);
//        list.add(e10);
//
//        int buffer = 5;
//        int count = list.size() / buffer;
//        int i;
//        for (i = 0; i < count; i++) {
//            System.out.println(list.subList(i * buffer, (i + 1) * buffer));
//        }
//        if (list.size() % buffer != 0)
//            System.out.println(list.subList(count * buffer, list.size()));

        // Integer a = 7;
        // Integer b = 8;
        // System.out.println(b/a);

        // System.out.println(list.subList(, toIndex));
        // System.out.println(list.subList(0, 5));
        // System.out.println(list.subList(5, 10));

        List<Employee> e = new ArrayList<Employee>();
        List<Manager> m = new ArrayList<Manager>();
//
        GenericUtil.copyList(m, m);
		System.out.println("Test of work");

    }

}


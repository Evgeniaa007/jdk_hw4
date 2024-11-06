import java.util.ArrayList;

public class Register {

    private static final ArrayList<Employee> employees = new ArrayList<>();

    public static ArrayList<Employee> findByExperience(int experience){
        ArrayList<Employee> experienceList = new ArrayList<>();
        for (Employee employee : employees){
            if(employee.getExperience() == experience){
                experienceList.add(employee);
            }
        }
        return experienceList;
    }

    public static ArrayList<Employee> findPhoneNumber(String name){
        ArrayList<Employee> phoneList = new ArrayList<>();
        for (Employee employee : employees) {
            if(employee.getName().equals(name)){
                phoneList.add(employee);
            }
        }
        return phoneList;
    }

    public static Employee findById(int id){
        for (Employee employee : employees){
            if(employee.getId() == id){
                return employee;
            }
        }
        return null;
    }

    public static void addEmployee(Employee employee){
        employees.add(employee);
    }


}


public class Main {

    public static void main(String[] args) {

        Register.addEmployee(new Employee(1, 66423, "Евгения", 4));
        Register.addEmployee(new Employee(2, 66418, "Иван", 10));
        Register.addEmployee(new Employee(3, 44453, "Артур", 4));
        Register.addEmployee(new Employee(4, 40478, "Евгения", 1));
        Register.addEmployee(new Employee(5, 66447, "Анна", 4));

        System.out.println(Register.findByExperience(4));
        System.out.println();
        System.out.println(Register.findById(2));
        System.out.println();
        System.out.println(Register.findPhoneNumber("Евгения"));

    }

}

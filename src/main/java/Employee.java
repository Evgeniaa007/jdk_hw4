public class Employee {

    private final int id;
    private final int phoneNum;
    private final String name;
    private final int experience;

    public Employee(int id, int phoneNum, String name, int experience) {
        this.id = id;
        this.phoneNum = phoneNum;
        this.name = name;
        this.experience = experience;
    }
    public int getId() {
        return id;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s, стаж работы: %d, номер телефона: %d", name, experience, phoneNum);
    }
}

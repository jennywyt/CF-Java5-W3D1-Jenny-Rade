package Jenny;

class Employee {
    private String name;
    private String surname;
    private int yearOfBirth;
    private double salaryInEuro;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Jane");
        System.out.println(e1.getName());
    }
}
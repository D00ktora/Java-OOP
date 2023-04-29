/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 17.4.2023 г.
 * Time: 5:20
 */
package P03EncapsulationLab._P04FirstAndReserveTeam;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() >= 3) {
            this.firstName = firstName;

        } else {
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
    }

    public void setLastName(String lastName) {
        if (lastName.length() >= 3) {
            this.lastName = lastName;

        } else {
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        } else {
            this.age = age;

        }
    }

    public void setSalary(double salary) {
        if (salary < 460.00) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        } else {
            this.salary = salary;

        }
    }

    public Person(String firstName, String lastName, int age, double salary) {
        try {
            setFirstName(firstName);
            setLastName(lastName);
            setAge(age);
            setSalary(salary);
        } catch (IllegalArgumentException e) {
            //System.out.println(e.getMessage());
            throw e;
        }
    }

    public void increaseSalary(double bonus) {
        if (this.age >= 30) {
            this.salary = this.salary + (this.salary * (bonus / 100));
        } else {
            this.salary = this.salary + ((this.salary * (bonus / 100))/2);
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %f leva", this.firstName, this.lastName, this.salary);
    }
}

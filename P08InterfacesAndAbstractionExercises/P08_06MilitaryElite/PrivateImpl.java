/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 21.4.2023 г.
 * Time: 19:31
 */
package P08InterfacesAndAbstractionExercises.P08_06MilitaryElite;


public class PrivateImpl extends SoldierImpl implements Private{
    private double salary;
    public PrivateImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s Salary: %.2f", super.toString(), this.salary);
    }
}

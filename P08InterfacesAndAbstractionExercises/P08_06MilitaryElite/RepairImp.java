/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 21.4.2023 г.
 * Time: 19:51
 */
package P08InterfacesAndAbstractionExercises.P08_06MilitaryElite;

public class RepairImp implements Repair{
    private String partName;
    private int hours;

    public RepairImp(String partName, int hoursWorked) {
        this.partName = partName;
        this.hours = hoursWorked;
    }

    @Override
    public String toString() {
        return String.format("Part Name: %s Hours Worked: %d", this.partName, this.hours);
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String getPartName() {
        return this.partName;
    }

    @Override
    public int getHours() {
        return this.hours;
    }

}

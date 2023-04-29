/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 21.4.2023 г.
 * Time: 19:50
 */
package P08InterfacesAndAbstractionExercises.P08_06MilitaryElite;

import java.util.ArrayList;
import java.util.Collection;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer{
    private Collection<RepairImp> repairs;

    public EngineerImpl(int id, String firstName, String lastName, double salary, String corp, Collection<RepairImp> repairs) {
        super(id, firstName, lastName, salary, corp);
        this.repairs = new ArrayList<>();
    }
    public void addRepair(RepairImp repair) {
        repairs.add(repair);
    }
    @Override
    public Collection<RepairImp> getRepairs() {
        return this.repairs;
    }

    public void setRepairs(Collection<RepairImp> repairs) {
        this.repairs = repairs;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString()).append(System.lineSeparator());
        //stringBuilder.append(String.format("Corps: %s", this.getCorp().name())).append(System.lineSeparator());
        stringBuilder.append("Repairs:");
        for (RepairImp repair : repairs) {
            stringBuilder.append(System.lineSeparator());
            stringBuilder.append("  ");
            stringBuilder.append(repair);
        }
        return stringBuilder.toString().trim();
    }
}

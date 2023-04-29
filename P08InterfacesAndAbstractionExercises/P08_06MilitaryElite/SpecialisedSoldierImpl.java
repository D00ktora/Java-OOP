/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 21.4.2023 г.
 * Time: 19:39
 */
package P08InterfacesAndAbstractionExercises.P08_06MilitaryElite;

public abstract class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier{
    private static final String AIRFORCES = "Airforces";
    private static final String MARINES = "Marines";
    private String corp;
    public SpecialisedSoldierImpl(int id, String firstName, String lastName, double salary, String corp) {
        super(id, firstName, lastName, salary);
        this.corp = corp;
    }

    @Override
    public String getCorp() {
        return corp;
    }

    public void setCorp(String corp) {
        this.corp = corp;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString()).append(System.lineSeparator());
        stringBuilder.append(String.format("Corps: %s", this.corp));
        return stringBuilder.toString().trim();
    }
}

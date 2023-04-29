/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 21.4.2023 г.
 * Time: 19:33
 */
package P08InterfacesAndAbstractionExercises.P08_06MilitaryElite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral{
    private Collection<PrivateImpl> privates;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary, Collection<Private> somePrivates) {
        super(id, firstName, lastName, salary);
        privates = new ArrayList<>();
    }

    public void addPrivate(PrivateImpl priv) {
        privates.add(priv);
    }

    @Override
    public Collection<PrivateImpl> getPrivates() {
        return privates;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString()).append(System.lineSeparator());
        stringBuilder.append("Privates:");
        //this.getPrivates().forEach(p -> stringBuilder.append("  ").append(p).append(System.lineSeparator()));
        List<PrivateImpl> toAppend = privates.stream().sorted((l, r) -> {
            int compare = Integer.compare(r.getId(), l.getId());
            return compare;
        }).collect(Collectors.toList());
        for (PrivateImpl aPrivate : toAppend) {
            stringBuilder.append(System.lineSeparator());
            stringBuilder.append("  ");
            stringBuilder.append(aPrivate.toString());
        }
        return stringBuilder.toString().trim();
    }
}

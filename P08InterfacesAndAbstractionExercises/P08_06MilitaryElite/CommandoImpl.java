/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 21.4.2023 г.
 * Time: 19:53
 */
package P08InterfacesAndAbstractionExercises.P08_06MilitaryElite;

import java.util.ArrayList;
import java.util.Collection;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {
    private Collection<MissionImp> missions;

    public CommandoImpl(int id, String firstName, String lastName, double salary, String corp, Collection<MissionImp> missions) {
        super(id, firstName, lastName, salary, corp);
        setMissions(missions);
    }

    public void addMission(MissionImp mission) {
        missions.add(mission);
    }
    @Override
    public Collection<MissionImp> getMissions() {
        return this.missions;
    }

    public void setMissions(Collection<MissionImp> missions) {
        if (missions != null) {
            this.missions = new ArrayList<>(missions);
            return;
        }
        this.missions = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString()).append(System.lineSeparator());
        //stringBuilder.append(String.format("Corps: %s", this.getCorp().name())).append(System.lineSeparator());
        stringBuilder.append("Missions:");
        for (MissionImp mission : missions) {
            stringBuilder.append(System.lineSeparator());
            stringBuilder.append("  ");
            stringBuilder.append(mission);
        }
        return stringBuilder.toString().trim();
    }
}

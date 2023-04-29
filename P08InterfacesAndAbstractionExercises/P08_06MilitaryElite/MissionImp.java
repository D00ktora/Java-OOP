/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 21.4.2023 г.
 * Time: 19:54
 */
package P08InterfacesAndAbstractionExercises.P08_06MilitaryElite;


public class MissionImp implements Mission {
    private static final String MISSION_FINISHED_STATUS = "Finished";
    private static final String MISSION_IN_PROGRESS_STATUS = "inProgress";
    private String codeName;
    private String state;

    public MissionImp(String codeName, String state) {
        this.codeName = codeName;
        setState(state);
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public void setState(String state) {
        if (MISSION_IN_PROGRESS_STATUS.equals(state) || MISSION_FINISHED_STATUS.equals(state)) {
            this.state = state;
        }
    }

    @Override
    public String getCodeName() {
        return this.codeName;
    }

    @Override
    public String getState() {
        return this.state;
    }

    public void completeMission() {
        this.setState(MISSION_FINISHED_STATUS);
    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s", this.codeName, this.state);
    }
}

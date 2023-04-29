package P08InterfacesAndAbstractionExercises.P08_06MilitaryElite;

/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 21.4.2023 г.
 * Time: 20:06
 */
//първа разлика е че тук аз не extend Soldier а другите го наследяват
//Втора разлика е че моя тип на данните е Corps а техния е String
public interface SpecialisedSoldier extends Soldier {

    String getCorp();
}

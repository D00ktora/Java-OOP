package P08InterfacesAndAbstractionExercises.P08_06MilitaryElite;

import java.util.Collection;

/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 21.4.2023 г.
 * Time: 20:04
 */
public interface LieutenantGeneral {
    //Аз съм го направил със Set а другите със Collection
    Collection<PrivateImpl> getPrivates();
}

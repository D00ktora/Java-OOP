/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 20.4.2023 г.
 * Time: 18:16
 */
package P07InterfacesAndAbstractionLab.P07_04SayHelloExtended;

public class Bulgarian extends BasePerson implements Person{
    public Bulgarian(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}

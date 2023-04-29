/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 20.4.2023 г.
 * Time: 18:17
 */
package P07InterfacesAndAbstractionLab.P07_04SayHelloExtended;

public class European extends BasePerson implements Person{
    public European(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}

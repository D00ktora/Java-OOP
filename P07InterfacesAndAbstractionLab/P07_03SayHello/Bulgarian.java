/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 20.4.2023 г.
 * Time: 18:16
 */
package P07InterfacesAndAbstractionLab.P07_03SayHello;

public class Bulgarian implements Person{
    public Bulgarian(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}

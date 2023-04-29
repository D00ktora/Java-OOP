/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 21.4.2023 г.
 * Time: 18:23
 */
package P08InterfacesAndAbstractionExercises.P08_05Тelephony;

import java.util.List;

public class Smartphone implements Callable, Browsable{
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public List<String> getUrls() {
        return urls;
    }

    public void setNumbers(List<String> numbers) {
        this.numbers = numbers;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    @Override
    public String call() {
        StringBuilder printPhoneNumbers = new StringBuilder();
        for (String number : numbers) {
            char[] chars = number.toCharArray();
            boolean containSymbol = false;
            for (char aChar : chars) {
                if (aChar < '0' || aChar > '9') {
                    containSymbol = true;
                    break;
                }
            }
            if (!containSymbol) {
                //System.out.printf("Calling... %s%n",number);
                printPhoneNumbers.append(String.format("Calling... %s",number)).append(System.lineSeparator());
            } else {
                printPhoneNumbers.append("Invalid number!").append(System.lineSeparator());
                //System.out.println("Invalid number!");
            }
        }
        return printPhoneNumbers.toString().trim();
    }

    @Override
    public String browse() {
        StringBuilder printPhoneNumbers = new StringBuilder();

        for (String url : urls) {
            char[] urlSymbols = url.toCharArray();
            boolean containsNumber = false;
            for (char symbol : urlSymbols) {
                if (symbol >= '0' && symbol <= '9') {
                    containsNumber = true;
                    break;
                }
            }
            if (!containsNumber) {
                //System.out.printf("Browsing: %s!%n" ,url);
                printPhoneNumbers.append(String.format("Browsing: %s!" ,url)).append(System.lineSeparator());
            } else {
                printPhoneNumbers.append("Invalid URL!").append(System.lineSeparator());
                //System.out.println("Invalid URL!");
            }
        }
        return printPhoneNumbers.toString().trim();
    }
}

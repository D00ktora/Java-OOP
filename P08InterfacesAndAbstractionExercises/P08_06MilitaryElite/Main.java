/**
 * Created by IntelliJ IDEA
 * User: Stilyan Petrov
 * Date: 21.4.2023 г.
 * Time: 20:14
 */
package P08InterfacesAndAbstractionExercises.P08_06MilitaryElite;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Soldier> army = new LinkedHashMap<>();

        String line = "";
        while (!"End".equals(line = reader.readLine())) {
            String[] tokens = line.split("\\s+");

            String type = tokens[0];
            int id = Integer.valueOf(tokens[1]);
            String firstName = tokens[2];
            String lastName = tokens[3];

            switch (type) {
                case "Private":
                    army.putIfAbsent(id, new PrivateImpl(id, firstName, lastName, Double.valueOf(tokens[4])));
                    break;
                case "LeutenantGeneral":
                    Collection<Private> somePrivates = new ArrayList<>();
                    Stream.of(tokens).skip(5)
                            .map(Integer::parseInt)
                            .collect(Collectors.toList()).forEach(e -> {
                                somePrivates.add(Private.class.cast(army.get(e)));
                            });
                    army.putIfAbsent(id, new LieutenantGeneralImpl(id, firstName, lastName, Double.valueOf(tokens[4]),
                            somePrivates
                    ));
                    break;
                case "Engineer":
                    SpecialisedSoldier engineer = new EngineerImpl(id, firstName, lastName, Double.valueOf(tokens[4]), tokens[5], parseRepairs(tokens));
                    if (engineer.getCorp() != null)
                        army.putIfAbsent(id, engineer);
                    break;
                case "Commando":
                    SpecialisedSoldier soldier = new CommandoImpl(id, firstName, lastName, Double.valueOf(tokens[4]), tokens[5], parseMissions(tokens));
                    if (soldier.getCorp() != null)
                        army.putIfAbsent(id, soldier);
                    break;
                case "Spy":
                    army.putIfAbsent(id, new SpyImpl(id, firstName, lastName, Integer.valueOf(tokens[4])));
                    break;

            }
        }

        for (Soldier soldier : army.values()) {
            System.out.println(soldier.toString().trim());
        }
    }

    private static Collection<RepairImp> parseRepairs(String... args) {
        Collection<RepairImp> rp = new ArrayList<>();
        for (int i = 6; i < args.length; i += 2) {
            rp.add(new RepairImp(args[i], Integer.valueOf(args[i + 1])));

        }
        return rp;
    }

    private static Collection<MissionImp> parseMissions(String... args) {
        Collection<MissionImp> rp = new ArrayList<>();
        for (int i = 6; i < args.length; i += 2) {
            MissionImp m = new MissionImp(args[i], args[i + 1]);
            if (m.getState() != null)
                rp.add(m);


        }
        return rp;
    }
}

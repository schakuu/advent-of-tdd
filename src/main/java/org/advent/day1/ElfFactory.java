package org.advent.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ElfFactory {
    public static Stream<Elf> createElves(Stream<String> elfLines) {
        return Stream.empty();
    }

    public static List<Elf> createElves(List<String> elfLines) {
        if (elfLines != null && elfLines.size() > 0) {
            var elves = new ArrayList<Elf>();
            Elf elf = null;
            for (var line: elfLines) {
                if (!line.isBlank()) {
                    if (elf == null) {
                        elf = new Elf();
                        elves.add(elf);
                    }
                    elf.addCalories(Integer.parseInt(line.trim()));
                } else {
                    elf = new Elf();
                    elves.add(elf);
                }
            }

            return elves;
        }
        return Collections.EMPTY_LIST;
    }

}

package thePackage.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Reader {
    public static List<String> fromFileAsList(String directory) {
        List<String> lines = new ArrayList<>();
        File dir = new File(directory);
        if (dir.isDirectory()) {
            for (File file : Objects.requireNonNull(dir.listFiles())) {
                if (!file.getName().equals(".DS_Store") && file.getName().equals("in.txt")) {
                        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                            lines = reader.lines().collect(Collectors.toList());
                            return lines;
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                }
            }
        }
        return lines;
    }
}

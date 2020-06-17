package thePackage.utils;

import java.io.*;
import java.util.List;
import java.util.Objects;

public class Writer {
    public static void toDirectory(List<String> lines, String directory) {
        File dir = new File(directory);
        if (dir.isDirectory()) {
            for (File file : Objects.requireNonNull(dir.listFiles())) {
                if (!file.getName().equals(".DS_Store") && file.getName().equals("out.txt")) {
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                        for (int i = lines.size() - 1; i >= 0; i--) {
                            writer.write(lines.get(i));
                            writer.newLine();
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

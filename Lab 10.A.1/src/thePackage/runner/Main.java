/*
 * Глава 10. Вариант А. Задание 1.
 * Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.
 */

package thePackage.runner;

import thePackage.utils.Reader;
import thePackage.utils.Writer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lines = Reader.fromFileAsList("resources");
        Writer.toDirectory(lines, "resources");
    }
}

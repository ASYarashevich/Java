/*
 * ����� 10. ������� �. ������� 1.
 * ������ ������ �� �����, �������� � ������. ������� ������ � ���� � �������� �������.
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

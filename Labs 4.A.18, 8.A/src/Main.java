/*
 * ����� 4. ������� �. ������� 18.
 * ������� ������ ������ �������, ��������� ������ �������, ������. ������: ���������, ������ �� �������, �������� �������.
 * ����� 8. ������� �.
 * ����������������� ��������� ������� �����/������. ��� ������������� ������, ��������� � ������������� ���������� �������������� ��������, ������������ � ������������ �������������� ��������.
 * ������������� ��������� ����������, ����������� ��� �������� ������, ���������� ��������� ������ (�������) � �����, ������������ �������� ���� � �. �.
 */

public class Main {

    public static void main(String[] args) throws PianoException {
        Piano piano = new Piano(new Key(), new Pedal());
        System.out.println(piano.tunePiano());
        System.out.println(piano.pressKey());
        System.out.println(piano.playPiano());
        System.out.println(piano.toString());
    }
    
}

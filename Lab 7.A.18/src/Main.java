/*
 * ����� 7. ������� �. ������� 18.
 * � ������ ���������� ��� ��������� �����, ������������� �� ����� ��� � ���� ������.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
            int j = 0;
            
            int[] mass1 = { '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�' };
            int[] mass2 = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
            
            Scanner sc = new Scanner(System.in);
            System.out.println("������� �����: ");
            String text = sc.nextLine();
            String[] words = text.split(" ");
            
            for (String word : words) {
                j = j + 1;
                for (int i = 0; i < mass1.length; i++) {
                    int currentChar = mass1[i];
                    if (word.indexOf(currentChar) > -1) {
                        mass2[i]++;
                    }
                }
            }

            char[] mass3 = { '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�' };
            
            for (int i = 1; i < mass1.length; i++) {
                if ((mass2[i] < 3) && (mass2[i] != 0)) {
                    System.out.println("����� '" + mass3[i] + "' ����������� � " + mass2[i] + " �����(-��)");
                }
            }
            sc.close();
    }
}


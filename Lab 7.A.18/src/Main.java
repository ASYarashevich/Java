/*
 * Глава 7. Вариант А. Задание 18.
 * В тексте определить все согласные буквы, встречающиеся не более чем в двух словах.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
            int j = 0;
            
            int[] mass1 = { 'б', 'в', 'г', 'д', 'ж', 'з', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'ц', 'ч', 'ш', 'щ', 'х' };
            int[] mass2 = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите текст: ");
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

            char[] mass3 = { 'б', 'в', 'г', 'д', 'ж', 'з', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'ц', 'ч', 'ш', 'щ', 'х' };
            
            for (int i = 1; i < mass1.length; i++) {
                if ((mass2[i] < 3) && (mass2[i] != 0)) {
                    System.out.println("Буква '" + mass3[i] + "' встречается в " + mass2[i] + " слове(-ах)");
                }
            }
            sc.close();
    }
}


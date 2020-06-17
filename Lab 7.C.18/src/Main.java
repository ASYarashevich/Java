/*
 * √лава 7. ¬ариант C. «адание 18.
 * ¬се слова текста рассортировать в пор€дке убывани€ их длин,
 * при этом все слова одинаковой длины рассортировать в пор€дке возрастани€ в них количества гласных букв.
 */

import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        System.out.println("¬ведите текст: ");
        String text = sc.nextLine();
        String[] words = text.split(" ");
    	
        Comparator<String> byLength = Comparator.comparingInt(String::length);
        Comparator<String> byNumberOfVowels = Comparator.comparingInt(Main::countVowels);
        Comparator<String> composition = byLength.reversed().thenComparing(byNumberOfVowels);

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length - 1 - i; j++) {
                if (composition.compare(words[j], words[j + 1]) > 0) {
                    String str = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = str;
                }
            }
        }

        System.out.println("—лова в пор€дке убывани€ их длин: ");
        for (String s : words) {
            System.out.println("   " + s);
        }
        
        sc.close();
    }

    private static int countVowels(String string) {
        return string.replaceAll("[^уеэоаы€ию”≈Ёќјџя»ё]", "").length();
    }
}
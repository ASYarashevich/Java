/*
 * Глава 7. Вариант В. Задание 2.
 * Создать программу обработки текста учебника по программированию с использованием классов:
 * Символ, Слово, Предложение, Абзац, Лексема, Листинг, Знак препинания и др.
 * Во всех задачах с формированием текста заменять табуляции и последовательности пробелов одним пробелом.
 * Предварительно текст следует разобрать на составные части, выполнить одно из перечисленных ниже заданий и вывести полученный результат.
 * Вывести все предложения заданного текста в порядке возрастания количества слов в каждом из них. 
 */

import java.util.*;
import java.io.FileReader;
import java.io.IOException;

public class Main
{
    // function to count number of words in every sentence
    int countWords(String s)
    {
        StringTokenizer str = new StringTokenizer(s," .,?!");
        int c = str.countTokens();
        return c;
    }

    // function sorting the sentences in ascending order of their number of words
    void sort(String w[], int p[])
    {
        int n = w.length, t1 = 0;
        String t2 = "";

        for(int i = 0; i < n - 1; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(p[i] > p[j]) // for descending use p[i] < p [j]
                {
                    t1 = p[i];
                    p[i] = p[j];
                    p[j] = t1;
                    t2 = w[i];
                    w[i] = w[j];
                    w[j] = t2;
                }
            }
        }
        printResult(w,p); // calling function for printing the result
    }

    void printResult(String w[], int p[]) // function to print the final result
    {
        int n = w.length;
        for(int i=0; i<n; i++)
        {
            System.out.println(w[i] + " >> " + p[i] + " words");
        }
    }

    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(new FileReader("Text.txt"));
        sc.useDelimiter(" ");
        Main ob = new Main();
        String pg = sc.nextLine();
        StringTokenizer str = new StringTokenizer(pg,".?!");
        int count = str.countTokens(); // counting number of sentences in the paragraph
        if(count > 200)
            System.out.println("A maximum of 200 sentences are allowed in the paragraph");
        else
        {
            String sent[] = new String[count]; // array to store the sentences separately
            int p[] = new int[count]; // array to store no. of words of each sentence

            for(int i = 0; i < count; i++)
            {
                sent[i] = str.nextToken().trim(); // saving sentences one by one in an array
                p[i] = ob.countWords(sent[i]); // saving number of words of every sentence
            }
            ob.sort(sent,p);
        }
    }
}

/*
 * Глава 6. Вариант А. Задание 2.
 * Создать и реализовать интерфейсы, также использовать наследование и полиморфизм для следующих предметных областей: 
 * interface Абитуриент << abstract class Студент << class Студент-Заочник. 
 */

public class Main {

    public static void main(String[] args) {
	    Extramural theStudent = new Extramural();
	    theStudent.show();
	    theStudent.study();
	    theStudent.rest();
    }
}

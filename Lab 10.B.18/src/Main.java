/*
 * Глава 10. Вариант В. Задание 18.
 * На прямой гоночной трассе стоит N автомобилей,
 * для каждого из которых известны начальное положение и скорость.
 * Определить, сколько произойдет обгонов.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Main {
    static final int LENGTH = new Random().nextInt(100) + 109;
    static final int AUTOS_QUANTITY = 4;

        public static void main(String[] args) {
            System.out.println("Road length = " + LENGTH);
            ArrayList<Auto> autos = new ArrayList<>();

            for (int i = 0; i < AUTOS_QUANTITY; i++) {
                autos.add(new Auto("Auto " + i));
            }
            // first sort by current position
            autos.sort(new CompareAuto());

            // write down which car in which place
            int i = 0;
            for (Auto auto : autos) {
                auto.beMoreFirst = i;
                i++;
            }

            // start race
            boolean endOfRace = false;
            while (!endOfRace) {
                endOfRace = true;
                for (Auto auto : autos) {
                    if (auto.currentPosition + auto.speed <= LENGTH) {
                        auto.currentPosition = auto.currentPosition + auto.speed;
                        endOfRace = false;
                    } else
                        auto.currentPosition = LENGTH; // this auto finish race
                }
                autos.sort(new CompareAuto());
            }
            // count again which car in which place
            int count = 0;
            i = 0;
            for (Auto auto : autos) {
                if (i > auto.beMoreFirst) {
                    count = count + (i - auto.beMoreFirst);
                }
                i++;
            }
            System.out.println("Result = " + count);
        }
    }

    class Auto {
        String name;
        int firstPosition;
        int speed;
        int currentPosition;
        int beMoreFirst; // how many cars is this car ahead of at the start

        Auto(String name) {
            super();
            this.name = name;
            this.firstPosition = new Random().nextInt(11);
            this.speed = new Random().nextInt(7) + 1;
            this.currentPosition = this.firstPosition;
            System.out.println(this);
        }

        @Override
        public String toString() {
            return name + " (sp. " + speed + ") pos. " + currentPosition;
        }
    }

    class CompareAuto implements Comparator<Auto> {

        @Override
        public int compare(Auto o1, Auto o2) {
            return Integer.compare(o1.currentPosition, o2.currentPosition);
        }
    }
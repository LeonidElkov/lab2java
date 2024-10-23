import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.printf("Выберите действие от 0 до 2: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Ошибка! Введите целое число: ");
                scanner.next();
            }
            int d = scanner.nextInt();
            if (d < 0 || d > 2) {
                System.out.println("Введено неверное значение!");
                continue;
            }
            switch (d) {
                case 0:
                    System.out.println("Программа завершена.");
                    return;
                case 1:
                    // Задача 1.1: Создание точек
                    Point point1 = new Point(3, 5);
                    Point point2 = new Point(25, 6);
                    Point point3 = new Point(7, 8);
                    System.out.println("Точки:");
                    System.out.println(point1);
                    System.out.println(point2);
                    System.out.println(point3);
                    // Задача 2.1: Создание линий
                    MyLine line1 = new MyLine(point1, point2); // Линия между point1 и point2
                    MyLine line2 = new MyLine(new Point(5, 10), new Point(25, 10)); // Линия между двумя новыми точками
                    MyLine line3 = new MyLine(point1, line2.getEnd()); // Линия между началом line1 и конечной точкой line2
                    System.out.println("Линии:");
                    System.out.println(line1);
                    System.out.println(line2);
                    System.out.println(line3);

                    line1.setEnd(new Point(30, 15));
                    line2.setStart(new Point(10, 10));
                    System.out.println("После изменения координат:");
                    System.out.println(line1);
                    System.out.println(line2);
                    System.out.println(line3);
                    break;
                case 2:
                    // Задача 3.1: Создание студентов и работа с оценками
                    // 1. Создать студента Васю с оценками: 3, 4, 5
                    Student vasya = new Student("Вася", 3, 4, 5);
                    System.out.println(vasya);

                    // 2. Создать студента Петю и скопировать оценки Васи.
                    Student petya = new Student("Петя", vasya.getGrades());
                    // 3. Заменить первую оценку Пети на 5
                    petya.getGrades()[0] = 5; // Это не сработает, так как массивы передаются по ссылке
                    System.out.println(petya);
                    // Изменение оценок Пети не повлияло на оценки Васи, так как мы создали новый массив для Пети

                    // 4. Создать студента Андрея и скопировать ему оценки Васи
                    Student andrey = new Student("Андрей", Arrays.copyOf(vasya.getGrades(), vasya.getGrades().length));
                    System.out.println(andrey);

                    // Задача 4.7: Создание студентов с новыми требованиями
                    // 1. Студент Вася с оценками: 3, 4, 5
                    Student vasya2 = new Student("Вася", 3, 4, 5);
                    System.out.println(vasya2);

                    // 2. Студент Максим без оценок
                    Student maxim = new Student("Максим");
                    System.out.println(maxim);

                    // Задача 5.6: Проверка средней оценки и статуса отличника
                    Student vasya3 = new Student("Вася", 3, 4, 5, 4);
                    Student petya2 = new Student("Петя", 5, 5, 5, 5);

                    // Вывод информации о среднем балле и статусе отличника
                    System.out.println(vasya3.getAverage() + " - " + vasya3.isExcellentStudent());
                    System.out.println(petya2.getAverage() + " - " + petya2.isExcellentStudent());
            }
        }
            }
        }

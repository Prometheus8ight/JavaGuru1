package students.Dmitry_Gr.lesson_3.level_5.task_22;

import java.util.Scanner;

/* Тема: создание класса Dog. Продолжение.

        Создать класс собака (Dog)
        и продемонстрировать его работу с ним в программе.

        Бизнес требования:
        - Должна быть возможность менять цвет собаки на другой.

        PS: создайте в классе Dog метод:

        void changeColor(String newColor) {
        // напишите тут команду сохранения нового цвета в свойство класса
        }

        Создать отдельный класс DogDemo,
        объявить в нём main() метод и продемонстрировать
        использование класса собака (Dog).

        Создайте собаку,
        заставьте её подать голос,
        заставте её поменять цвет,
        заставьте её подать голос снова и убедитесь в том,
        что собака изменила свой цвет.
        и заодно день рождение праздновала
*/

 class Dog {
    String name;
    int age;
    String color;

         Dog(String name, int age, String color) {
            this.name = name;
            this.age = age;
            this.color = color;
        }

     void voice() {
        System.out.println("NameDog: " + this.name + System.lineSeparator()
                         + "ageDog: " + this.age + " year " + System.lineSeparator()
                         + "Color dog: " + this.color);
    }

    void happyBirthday() {
        this.age += 1;
    }

    void changeColor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre dog color: ");
        this.color = scanner.nextLine();
        scanner.close();
    }
}


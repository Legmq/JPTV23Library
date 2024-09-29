package org.example;

public class App {
    private Input input;


    public App(Input input) {
        this.input = input;
    }

    public void run() {
        boolean repeat = true;
        do {
            System.out.println("Список задач:");
            System.out.println("0. Выйти из программы");
            System.out.println("1. Добавить пользователя");
            System.out.print("Введите номер задачи: ");
            int task = input.nextInt(); input.nextLine();
            switch (task) {
                case 0:
                    System.out.println("Выход из программы");
                    repeat = false;
                    break;
                case 1:
                    System.out.println("1. Добавить пользователя");
                    break;
                default:
                    System.out.println("Выберите номер из списка задач!");
                    break;
            }
        } while (repeat);
    }
}

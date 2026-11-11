package tasks;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Dodaj zadanie");
            System.out.println("2. Pokaż zadania");
            System.out.println("3. Usuń zadanie");
            System.out.println("4. Wyjdź");

            System.out.print("Twój wybór: ");

            int choose;
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Podaj liczbę!");
                continue;
            }

            switch (choose) {
                case 1: {
                    System.out.print("Podaj nowe zadanie: ");
                    try {
                        manager.addTask(new Task(scanner.nextLine()));
                        System.out.println("Zadanie dodano!");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                }
                case 2:
                    manager.showTasks();
                    break;
                case 3: {
                    manager.showTasks();
                    System.out.print("Podaj numer indeksu lub treść zadania do usunięcia: ");

                    if (scanner.hasNextInt()) {
                        try {
                            manager.deleteTask(scanner.nextInt());
                            System.out.println("Zadanie usunięto!");
                        } catch (TaskNotFoundException e) {
                            System.out.println("Error: " + e.getMessage());
                        } finally {
                            scanner.nextLine();
                        }

                    } else {
                        try {
                            manager.deleteTask(scanner.nextLine());
                            System.out.println("Zadanie usunięto!");
                        } catch (TaskNotFoundException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    break;
                }
                case 4:
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Brak takiej opcji");
                    break;


            }


        }
    }
}

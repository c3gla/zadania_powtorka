package tasks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TaskManager manager = new TaskManager(new InMemoryTaskRepository());
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
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
                case 1 -> {
                    System.out.print("Podaj nowe zadanie: ");
                    try {
                        Priority priority = Priority.LOW;
                        String description = scanner.nextLine();
                        System.out.println("Wybierz priorytet zadania: ");
                        System.out.println("1. Niski \n2. Średni \n3. Wysoki");
                        System.out.print("Twój wybór: ");
                        int priorityChoose;
                        try {
                            priorityChoose = Integer.parseInt(scanner.nextLine());
                            switch (priorityChoose){
                                case 2 -> priority = Priority.MEDIUM;
                                case 3 -> priority = Priority.HIGH;
                                default -> System.out.println("Brak takiej opcji.");
                            }
                            manager.addTask(new Task(description,priority));
                        } catch (NumberFormatException e) {
                            System.out.println("Podaj liczbę!");
                            continue;
                        }


                        System.out.println("Zadanie dodano!");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }


                }
                case 2 ->
                    manager.showTasks();

                case 3 -> {
                    manager.showTasks();
                    System.out.print("Podaj numer indeksu zadania do usunięcia: ");

                    try {
                        int id = Integer.parseInt(scanner.nextLine());
                        manager.deleteTask(id);
                        System.out.println("Zadanie usunięto!");
                    } catch (TaskNotFoundException e) {
                        System.out.println("Error: " + e.getMessage());
                    } catch (NumberFormatException e) {
                        System.out.println("Podaj liczbę!");
                    }

                }
                case 4 -> {
                    scanner.close();
                    running = false;
                }

                default ->
                    System.out.println("Brak takiej opcji");



            }


        }
    }
}

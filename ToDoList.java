import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of tasks: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter task " + (i + 1) + ": ");
            tasks.add(sc.nextLine());
        }

        StringBuffer taskList = new StringBuffer();

        taskList.append("\n--- To-Do List ---\n");

        for (int i = 0; i < tasks.size(); i++) {
            taskList.append((i + 1) + ". " + tasks.get(i) + "\n");
        }

        System.out.println(taskList);

        sc.close();
    }
}
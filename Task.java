import java.util.Scanner;

public class Task {
    String Title = "Not Set";
    String Description = "Not Set";
    int Priority = 5;

    public static void main(String[] args) {
        Task task = new Task();
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        while (!string.contains("exit")) {
            if (string.contains("exit")) {
                input.close();
                System.exit(0);
            } else {
                if (string.contains("create")) {
                    task.createTask(string.replace("create ", ""));
                }
                if (string.contains("setTitle")) {
                    task.setTitle(string.replace("setTitle ", ""));
                }
                if (string.contains("setDescription")) {
                    task.setDescription(string.replace("setDescription ", ""));
                }
                if (string.contains("setPriority")) {
                    task.setPriority(string.replace("setPriority ", ""));
                }
                if (string.contains("display")) {
                    task.display();
                }
                string = input.nextLine();
            }
        }
        input.close();
    }

    public void createTask(String string) {
        this.Title = string;
        System.out.println("Task Created : " + string);
    }

    public void setTitle(String string) {
        this.Title = string;
        System.out.println("Title Changed : " + string);
    }

    public String getTitle() {
        return Title;
    }

    public void setDescription(String string) {
        this.Description = string;
        System.out.println("Description Changed : " + string);
    }

    public String getDescription() {
        return Description;
    }

    public void setPriority(String string) {
        this.Priority = Integer.parseInt(string);
        System.out.println("Priority Changed : " + string);
    }

    public int getPriority() {
        return Priority;
    }

    public void display() {
        System.out.println("Task Info : ");
        System.out.println("Title : " + getTitle());
        System.out.println("Description : " + getDescription());
        System.out.println("Priority : " + getPriority());
    }

}
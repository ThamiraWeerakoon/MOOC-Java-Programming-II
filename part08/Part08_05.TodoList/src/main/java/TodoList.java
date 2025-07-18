import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String task) {
        this.tasks.add(task);
    }

    public void print() {
        for (int j = 0; j < this.tasks.size(); j++) {
            System.out.println((j + 1) + ": " + this.tasks.get(j));
        }
    }

    public void remove(int number) {
        this.tasks.remove(number - 1);
    }
}

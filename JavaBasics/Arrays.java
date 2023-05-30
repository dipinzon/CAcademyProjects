import java.util.ArrayList;

public class Arrays {

    public static void main(String[] args) {
        // Arrays (fixed size)
        String[] words = { "Uno", "Dos", "Tres" };

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        // ArrayList
        ArrayList<String> toDoList = new ArrayList<String>();
        String toDo1 = "Task1";
        String toDo2 = "Task2";
        String toDo3 = "Task3";

        toDoList.add(toDo1);
        toDoList.add(toDo2);
        toDoList.add(toDo3);

        System.out.println(toDoList);

        System.out.println(toDoList.size());
        toDoList.add("Todo4");

        System.out.println(toDoList);

        toDoList.set(1, "Todo_Dos");

        System.out.println(toDoList);

        toDoList.remove(0);

        System.out.println(toDoList);

    }

}

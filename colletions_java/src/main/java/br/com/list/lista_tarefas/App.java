package br.com.list.lista_tarefas;

public class App {

    public static void main(String[] args) {

        ListTask listTask = new ListTask();
        listTask.add(new Task("Fazer café", false));
        listTask.add(new Task("Remover o lixo", false));
        listTask.add(new Task("Ir a academia", false));

        listTask.completeTask(new Task("Remover o lixo", false));
        listTask.getTasksCompleted();
        System.out.println("----------------------------");
        listTask.getTasksNotCompleted();
    }
}

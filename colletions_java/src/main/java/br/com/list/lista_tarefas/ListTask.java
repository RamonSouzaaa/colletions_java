package br.com.list.lista_tarefas;

import java.util.List;
import java.util.ArrayList;

public class ListTask {
    private final List<Task> list;
    
    public ListTask(){
        this.list = new ArrayList<>();
    }
    
    public void add(Task task) {
        this.list.add(task);
    }
    
    public void add(int index, Task task) {
        this.list.add(index, task);
    }
    
    public void remove(Task task) {
        this.list.remove(task);
    }
    
    public int size() {
        return this.list.size();
    }
    
    public void getDescriptionTasks() {
        this.list.forEach(task -> {
            System.out.println(task.description());
        });
    }
    
    private void getDescriptionTasks(List<Task> list) {
        list.forEach(task -> {
            System.out.println(task.description());
        });
    }
    
    private List<Task> getTasksByStatus(boolean isCompleted) {
        List<Task> filteredList = new ArrayList<>();
        
        this.list.forEach(task -> {
            if(task.isCompleted() == isCompleted) filteredList.add(task);
        });
        
        return filteredList;
    }
    
    public void getTasksCompleted() {
        this.getDescriptionTasks(this.getTasksByStatus(true));
    }
    
    public void getTasksNotCompleted() {
        this.getDescriptionTasks(this.getTasksByStatus(false));
    }
    
    public int getIndexTask(Task task) {
        return this.list.indexOf(task);
    }
    
    public void completeTask(Task task) {
        int index = this.list.indexOf(task);
        if(index >= 0) {
            this.list.remove(index);
            this.add(index, new Task(task.description(), true));
        } else {
            throw new IndexOutOfBoundsException("Task não encontrada!");
        }
    }
}

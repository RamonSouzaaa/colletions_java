package br.com.list.ordenacao_pessoas;

public class App {
    public static void main(String[] args) {
        SortPeople sp = new SortPeople();
        sp.addPeople(new People("João", 25, 1.81));
        sp.addPeople(new People("Maria", 32, 1.67));
        sp.addPeople(new People("Mariana", 21, 1.76));
        sp.addPeople(new People("Jorge", 33, 1.93));
        
        //sp.sortByAge().forEach((System.out::println));
        sp.sortByHeight().forEach((System.out::println));
    }
}

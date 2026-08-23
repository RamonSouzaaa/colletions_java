
package br.com.list.ordenacao_pessoas;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class SortPeople {
    private final List<People> list;
    
    public SortPeople() {
        this.list = new ArrayList<>();
    }
    
    public void addPeople(People people) {
        this.list.add(people);
    }
    
    public List<People> sortByAge() {
        List<People> sortedList = new ArrayList<>();
        
        sortedList.addAll(this.list);
        
        sortedList.sort(new Comparator<People>(){
            @Override
            public int compare(People p1, People p2){
                return Integer.compare(p1.age(), p2.age());
            }
        });
        return sortedList;
    }
    
    public List<People> sortByHeight() {
        List<People> sortedList = new ArrayList<>();
        
        sortedList.addAll(this.list);
        
        sortedList.sort(new Comparator<People>(){
            @Override
            public int compare(People p1, People p2){
                return Double.compare(p1.height(), p2.height());
            }
        });
        return sortedList;
    }
}

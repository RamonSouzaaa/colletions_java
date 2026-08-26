package br.com.set.conjunto_convidados;

public record Guest(String name,
                    int id) { 

    @Override
    public int hashCode(){
        return java.util.Objects.hash(id);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(!(obj instanceof Guest other)) return false;
        return java.util.Objects.equals(this.id, other.id);
    }
}

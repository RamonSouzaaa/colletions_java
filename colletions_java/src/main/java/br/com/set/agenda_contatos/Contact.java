package br.com.set.agenda_contatos;

public record Contact (String name, int number) {
    
    @Override
    public int hashCode(){
        return java.util.Objects.hash(number);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Contact)) return false;
        final Contact other = (Contact) obj;
        return java.util.Objects.equals(this.number, other.number);
    }
}

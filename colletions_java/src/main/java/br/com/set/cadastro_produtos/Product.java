package br.com.set.cadastro_produtos;

public record Product(int id,
                     String name,
                     double price,
                     int amount) {

    @Override
    public int hashCode(){
        return java.util.Objects.hash(this.id);
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj == this) return true;
        if(!(obj instanceof Product other)) return false;
        return java.util.Objects.equals(this.id, other.id);
    }
}

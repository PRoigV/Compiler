package threeAddressCode;

/**
 * Assignatura 21780 - Compiladors
 * Estudis: Grau en Informàtica UIB
 * Itinerari: Intel·ligència Artificial i Computació
 *
 * Professor: Pere Palmer
 * Alumnes: Bernat Parera
 *          Pere Roig
 *
 */
public class Variable{
    String ID;
    String type;
    int np;

    public Variable(String id,String type, int np){
        this.ID = id;
        this.type = type;
        this.np = np;
    }

    public int getNp() {
        return np;
    }

    public String getID() {
        return ID;
    }

    public String getType() {
        return type;
    }

    public String toString(){return "ID: "+this.ID+", Type: "+this.type+", NP: "+this.np;}
}



package Core.Tools;

public class Calcul {

    private int varA = 0;
    private int varB = 0;
    
    public Calcul() {}
    
    public Calcul(int varA, int varB) {
        this.varA = varA;
        this.varB = varB;
    }

    public int getVarA(){ return this.varA; }
    public int getVarB(){ return this.varB; }
    
    public void setVarA(int varA){ this.varA = varA; }
    public void setVarB(int varB){ this.varB = varB; }
    
    public int addition(){ return this.varA+this.varB; }

    public int addition(int varA, int varB){ return varA+varB; }
    
    public int soustraction(){ return this.varA-this.varB; }
    
    public int soustraction(int varA, int varB){ return varA-varB; }

    public int multiplication(){ return this.varA*this.varB; }

    public int multiplication(int varA, int varB){ return varA*varB; }
    
    public double division(){
        return this.varA==0 || this.varB==0 ? 0 : this.varA/this.varB;
    }
    
    public double division(int varA, int varB){
        return (varA==0||varB==0) ? 0 : varA/varB;
    }
    
    public String toString(){ return this.varA+" / "+this.varB; }
}
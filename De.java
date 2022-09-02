package pier;
public class De {
    private int num;
    private int nbFaces;
    private int valeur;
    private boolean estTruque;
    

    public int getNum() {
        return num;
    }

    public int getNbFaces() {
        return nbFaces;
    }

    public int getValeur() {
        return valeur;
    }
    
    public De(){    //appeler un construceur qui a deux paramétre
        this(0,6);
    }
    public De(int nbFaces){        //appel le premier construteur
        this(0,nbFaces);
    }
    public De(int num, int nbFaces){    //appel le premier constructeur
        this.nbFaces = nbFaces;
        this.num = num;
        this.valeur = 0;
        this.estTruque =false;
    }
    public void lancer(){
        valeur =((int) (Math.random()*nbFaces)) + 1;
        if (estTruque){
            if (valeur == 3){
                this.valeur = 2;
            } else if (valeur ==5){
                this.valeur = 4;
            } else if (valeur ==6){
                valeur = 1;
            }
        }
    }

    @Override
    public String toString() {
        return "De{" + "num=" + num + ", valeur=" + valeur + '}';
    }
    public void piper(){
        estTruque = true; 
    }
    
}

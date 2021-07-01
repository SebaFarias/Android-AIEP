package contador;

public class Contador {
    private int cont;
    
    public Contador(){
        this.cont =(int)(Math.random() * 100);
    }
    public Contador(int cont){
        if(cont < 0){
            this.cont = 0;
        }else{
            this.cont = cont;
        }
    }
    public int getCont(){
        return this.cont;
    }
    public void setCont(int cont){
        if(cont < 0){
            this.cont = 0;
        }else{
            this.cont = cont;
        }
    }
    public int incrementar(){
        this.cont++;
        return this.cont;
    }
    public int decrementar(){
        this.cont--;
        if(this.cont<0){
            this.cont = 0;
        }
        return this.cont;
    }
    
}

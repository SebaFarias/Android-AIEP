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
        this.setCont(this.cont + 1);
        return this.cont;
    }
    public int decrementar(){
        this.setCont(this.cont - 1);
        return this.cont;
    }    
}

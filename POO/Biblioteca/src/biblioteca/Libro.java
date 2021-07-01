package biblioteca;

public class Libro {
    protected String titulo, autor;
    private int stock, prestados;
    
    public Libro(){
        this.titulo = "";
        this.autor = "";
        this.stock = 0;
        this.prestados = 0;
    }
    public Libro(String titulo, String autor, int stock, int prestados){
        this.titulo = titulo;
        this.autor = autor;
        this.stock = stock;
        this.prestados = prestados;
    }
    public String titulo(){
        return this.titulo;
    }
    public String autor(){
        return this.autor;
    }
    public int stock(){
        return this.stock;
    }
    public int prestados(){
        return this.prestados;
    }
    public void setTitulo( String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
    public void setPrestados(int prestados){
        this.prestados = prestados;
    }
    public boolean prestamo(){
        if(this.stock < 1){
            return false;
        }else{
            this.prestados++;
            this.stock--;
            return true;
        }
    }
    public boolean devolucion(){
        if(this.prestados < 1){
            return false;
        }else{
            this.prestados--;
            this.stock++;
            return true;
        }        
    }
}

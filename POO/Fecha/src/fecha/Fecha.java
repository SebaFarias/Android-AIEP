package fecha;

public class Fecha {
  private int dia, mes, año;
  public Fecha(){
    this.dia = 1;
    this.mes = 1;
    this.año = 0;
  }
  public Fecha(int dia, int mes, int año){
    this.dia = dia;
    this.mes = mes;
    this.año= año;
  }
  public int getDia(){
    return this.dia;
  }
  public int getMes(){
    return this.mes;
  }
  public int getAño(){
    return this.año;
  }
  public void setDia( int newDia){
    this.dia = newDia;
  }
  public void setMes(int newMes){
    this.mes = newMes;
  }
  public void setAño(int newAño){
    this.año = newAño;
  }
  public boolean fechaCorrecta(){
    if(this.dia < 1 || this.dia > diasDelMes()){
      return false;
    }
    if(this.mes<1 || this.mes>12){
      return false;
    }
    return true;
  }
  private int diasDelMes(){
    switch(this.mes){
      case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        return 31;
      case 2:
        if(esBisiesto()){
          return 29;
        }else{
          return 28;
        }
      case 4: case 6: case 9: case 11:
        return 30;
      default: return 0;
    }
  }
  private boolean esBisiesto(){
    return (this.año % 4 == 0) && ((this.año % 100 != 0) || (this.año % 400 == 0));
  }
  public void diaSiguiente(){
    if(fechaCorrecta()){
      if(this.dia < diasDelMes()){
        this.dia++;
      }else{
        this.dia = 1;
        if(this.mes == 12){
          this.mes=1;
          this.año++;
        }else{
          this.mes++;
        }
      }            
    }        
  }
}

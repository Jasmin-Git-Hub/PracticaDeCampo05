public class Cuenta {
    private String titular; 
    private double saldo; 
    public Cuenta(String titular, double saldo){
        this.titular = titular; 
        this.saldo = saldo; 
    }
    @Override
    public String toString(){
        return "Titular: "+titular+", Saldo: " + saldo + ", Tasa interés: " + Banco.mostrarTasaInteres()+"%"; 
    }
}

import java.util.ArrayList;

public class Banco {
    public  static double tasaInteres;
    //Colección 
    private ArrayList<Cuenta> cuentas = new ArrayList<>(); 
    
    public static void actulizartasaInteres (double nuevaTasa)
    {
        tasaInteres=nuevaTasa;
    }
    
    public static double  mostrarTasaInteres(){
        return tasaInteres;
    }
    public void agregarCuenta(Cuenta c){
        cuentas.add(c);
    }
    public void mostrarCuentas(){
        for (Cuenta c: cuentas){
            System.out.println(c);
        }
    }
}

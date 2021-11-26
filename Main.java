import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
    
    Cliente cliente = new Cliente();
    
    cliente.setNombre("Indra");
    System.out.println(cliente.getNombre);
    
    cliente.setCiudad("Madrid");
    System.out.println(cliente.getCiudad);
        
    cliente.setPresupuesto(10000);
    System.out.println(cliente.getPresupuesto);
        
    }
}

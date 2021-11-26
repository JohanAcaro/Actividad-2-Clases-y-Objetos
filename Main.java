import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
    
    Cliente cliente = new Cliente();
    
    cliente.setNombre("Indra");
    System.out.println(cliente.getNombre());
    
    cliente.setCiudad("Sevilla");
    System.out.println(cliente.getCiudad());
        
    cliente.setPresupuesto(10000);
    System.out.println(cliente.getPresupuesto());
    
    System.out.println("El cliente "+cliente.getNombre()+"-"+cliente.getCiudad()+" tiene un presupuesto de "+cliente.getPresupuesto()+" euros");
    
    Cliente2 cliente2 = new Cliente2();
    
    cliente2.setNombre("Vass");
    System.out.println(cliente2.getNombre());
    
    cliente2.setCiudad("Valencia");
    System.out.println(cliente2.getCiudad());
    
    cliente2.setPresupuesto(12000);
    System.out.println(cliente2.getPresupuesto());
    
        System.out.println("El cliente "+cliente2.getNombre()+"-"+cliente2.getCiudad()+" tiene un presupuesto de "+cliente2.getPresupuesto()+" euros");

    }
}

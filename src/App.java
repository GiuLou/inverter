public class App {
    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.enfileirar("A"); 
        fila.enfileirar("B"); 
        fila.enfileirar("C"); 

        System.out.println("Fila original: " + fila); 
        
        fila.inverter(); 
        System.out.println("Fila invertida: " + fila); 
    }
}

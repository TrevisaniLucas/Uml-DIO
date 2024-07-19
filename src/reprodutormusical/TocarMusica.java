package reprodutormusical;
import java.util.Scanner;


public class TocarMusica {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Reproduzir Musica?");
        String answear = scanner.nextLine();

        if (answear.equalsIgnoreCase("Sim")){
            System.out.println("Reproduzindo Musica");
        
                     }
        else{
            System.out.println("Voltando ao menu inicial do reprodutor musical.");
        }
        
       
   
        scanner.close();
}

}

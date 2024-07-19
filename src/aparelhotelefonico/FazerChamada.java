    package aparelhotelefonico;
    import java.util.Scanner;


    public class FazerChamada {
        public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Gostaria de ligar para essa pessoa?");
            String answear = scanner.nextLine();

            if (answear.equalsIgnoreCase("Sim")){
                System.out.println("Chamando");
            }
            else {
                System.out.println("Retornando");
            }
            

            
            
        
    
            scanner.close();
    }

    }

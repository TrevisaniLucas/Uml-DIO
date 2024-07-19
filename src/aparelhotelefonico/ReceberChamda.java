    package aparelhotelefonico;
    import java.util.Scanner;


    public class ReceberChamda {
        public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Recebendo chamada");
            System.out.println("Gostaria de atender?");
            String answear = scanner.nextLine();

            if (answear.equalsIgnoreCase("Sim")){
                System.out.println("Ligação atendida");
            }
            else {
                System.out.println("Ligação recusada");
            }
            

            
            
        
    
            scanner.close();
    }

    }

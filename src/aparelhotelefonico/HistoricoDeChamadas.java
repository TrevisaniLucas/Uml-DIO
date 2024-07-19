    package aparelhotelefonico;
    import java.util.Scanner;


    public class HistoricoDeChamadas {
        public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Gostaria de acessar o histórico de chamadas");
            String answear = scanner.nextLine();

            if (answear.equalsIgnoreCase("Sim")){
                System.out.println("Histórico exibido");
            }
            else {
                System.out.println("Retornando");
            }
            

            
            
        
    
            scanner.close();
    }

    }

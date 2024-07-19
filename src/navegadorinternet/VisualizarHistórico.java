    package navegadorinternet;
    import java.util.Scanner;


    public class VisualizarHistórico {
        public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Gostaria de acessar o histórico?");
            String answear = scanner.nextLine();

            if (answear.equalsIgnoreCase("Sim")){
                System.out.println("Histórico aberto");
            }
            else {
                System.out.println("Retornando ao navegador");
            }
            

            
            
        
    
            scanner.close();
    }

    }

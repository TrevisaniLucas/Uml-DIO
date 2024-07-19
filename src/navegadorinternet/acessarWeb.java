    package navegadorinternet;
    import java.util.Scanner;


    public class acessarWeb {
        public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Gostaria de acessar a web?");
            String answear = scanner.nextLine();

            if (answear.equalsIgnoreCase("Sim")){
                System.out.println("Navegador aberto");
            }
            else {
                System.out.println("Retornando");
            }
            

            
            
        
    
            scanner.close();
    }

    }

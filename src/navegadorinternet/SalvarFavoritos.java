    package navegadorinternet;
    import java.util.Scanner;


    public class SalvarFavoritos {
        public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Gostaria de salvar como favorito?");
            String answear = scanner.nextLine();

            if (answear.equalsIgnoreCase("Sim")){
                System.out.println("Salvo como favorito");
            }
            else {
                System.out.println("Continuando a navegação");
            }
            

            
            
        
    
            scanner.close();
    }

    }

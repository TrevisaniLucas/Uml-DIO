    package reprodutormusical;
    import java.util.Scanner;


    public class BaixarMusicas {
        public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Gostou da musica?");
            String answear = scanner.nextLine();

            if (answear.equalsIgnoreCase("Sim")){
                System.out.println("Gostaria de fazer o download?");
                String answearDownload = scanner.nextLine();
                if (answearDownload.equalsIgnoreCase("Sim")){
                    System.out.println("Fazendo Download.");
                    System.out.println("Carregando");
                    System.out.println("Download Finalizado");
                    
                } 
                else {
                System.out.println("Retornando a reprodução");
                }
            
            }
            
            else {
                System.out.println("Retornando ao menu Principal");
            }

            
            
        
    
            scanner.close();
    }

    }

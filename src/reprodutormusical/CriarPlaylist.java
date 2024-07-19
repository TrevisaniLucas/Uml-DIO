package reprodutormusical;

import java.util.Scanner;

public class CriarPlaylist {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gostaria de fazer uma playlist com suas músicas favoritas?");
        String answer = scanner.nextLine();

        while (answer.equalsIgnoreCase("Sim")) {
            System.out.println("Selecione as músicas");

            String answerPlayList;
            do {
                System.out.println("Playlist montada?");
                answerPlayList = scanner.nextLine();
                
                if (!answerPlayList.equalsIgnoreCase("Sim")) {
                    System.out.println("Voltando à seleção");
                }

            } while (!answerPlayList.equalsIgnoreCase("Sim"));

            System.out.println("Voltando ao menu principal");
            
            // Pergunta novamente se deseja fazer outra playlist
            System.out.println("Gostaria de fazer outra playlist com suas músicas favoritas?");
            answer = scanner.nextLine();
        }

        scanner.close();
    }
}

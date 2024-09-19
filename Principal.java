import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Informe uma string: ");
        String texto = scanner.nextLine();

        
        int verificacao = verificarLetraA(texto);

        
        if (verificacao > 0) {
            System.out.println("A letra 'a' aparece " + verificacao + " vez(es) na string");
        } else {
            System.out.println("A letra 'a' não aparece na string");
        }

        scanner.close();
    }

    
    public static int verificarLetraA(String texto) {
        int contagem = 0;

        
        for (char c : texto.toCharArray()) {
            if (c == 'a' || c == 'A') {
                contagem++;
            }
        }

        return contagem;
    }
}
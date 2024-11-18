import java.util.Scanner;

public class MesDoAno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número do mês (1-12): ");
        int mes = scanner.nextInt();
        
        String nomeMes;
        switch (mes) {
            case 1: nomeMes = "janeiro"; break;
            case 2: nomeMes = "fevereiro"; break;
            case 3: nomeMes = "março"; break;
            case 4: nomeMes = "abril"; break;
            case 5: nomeMes = "maio"; break;
            case 6: nomeMes = "junho"; break;
            case 7: nomeMes = "julho"; break;
            case 8: nomeMes = "agosto"; break;
            case 9: nomeMes = "setembro"; break;
            case 10: nomeMes = "outubro"; break;
            case 11: nomeMes = "novembro"; break;
            case 12: nomeMes = "dezembro"; break;
            default: 
                System.out.println("Mês inválido");
                return;
        }
        
        System.out.println("O mês é " + nomeMes);
        
        scanner.close();
    }
}

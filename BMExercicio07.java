import java.util.Scanner;

public class BMExercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        
        int valorX = entrada.nextInt();
        
        while (valorX != 1) {
            int valorY = 3 * valorX + 1;
            
            if (valorX % 2 == 0) {
               valorY = valorX / 2;
            }
            
            System.out.print(valorY + " ");

            valorX = valorY;
        }
    }
}

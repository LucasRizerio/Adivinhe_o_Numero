import java.util.Scanner;

public class AdivinheNumero {

    public static void Adivinhe(){
        Scanner sc = new Scanner(System.in); // Criando a classe scanner.in para a entrada de dados

        int num = 1 + (int)(100 * Math.random()); // Gerando o numero aleatorio entre 1 e 100

        int vida = 5; // definindo o numero de vidas
        int i, guess;

        System.out.println("Um numero foi escolhido entre 1 e 100. Adivinhe o numero, você só tem 5 vidas");

        for(i = 0; i < vida; i++){
            System.out.println("Adivinhe o numero: ");

            guess = sc.nextInt(); // Entrada de dados do usiario

            if(num == guess){
                System.out.println("Parabens"+"Você acertou");
                break;

            } else if(num > guess && i != vida -1){
                System.out.println("O numero é maior que: " + guess);

            } else if(num < guess && i != vida -1){
                System.out.println("O numero é menor que: "+ guess);
            }
        }

        if (i == vida){
            System.out.println("Você perdeu todas as suas vida");
            System.out.println("O numero era "+ num);
        }
    }
    public static void main(String[] args) {
        
        Adivinhe(); // Chamando a função
    }
}

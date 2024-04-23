import java.util.Scanner;

public class Imc {
    public static void main(String[] args){
        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = lerTeclado.nextLine();

        System.out.println("Informe seu Genero com M ou F: ");
        String genero = lerTeclado.nextLine();
        char generoChar = genero.charAt(0);

        System.out.println("Informe sua altura: ");
        double altura = lerTeclado.nextFloat();

        System.out.println("Informe seu peso:");
        int peso = lerTeclado.nextInt();

        lerTeclado.close();

        float imc = (float) (peso / Math.pow(altura , 2));

        String classificacao = "";

        if (genero.equals("m")) {
            if( imc < 20){
                classificacao = "Abaixo do normal";
            }else if (imc >= 20 && imc <= 24.9){
                classificacao = "Normal";
            }else if (imc >= 25 && imc <= 29.9){
                classificacao = "Obesidade Leve";
            }else if (imc >= 30 && imc <= 39.9){
                classificacao = "Obesidade Moderada";
            } else {
                classificacao = "Obesidade Mórbida";
            }
        } else {
            if( imc < 19){
                classificacao = "Abaixo do normal";
            }else if (imc >= 19 && imc <= 23.9){
                classificacao = "Normal";
            }else if (imc >= 24 && imc <= 28.9){
                classificacao = "Obesidade Leve";
            }else if (imc >= 29 && imc <= 38.9){
                classificacao = "Obesidade Moderada";
            } else {
                classificacao = "Obesidade Mórbida";
            }
        }

      
        String texteBlock = """
                RESULTADO:
                    --- Nome: %S
                    --- Gênero: %s
                    --- Altura: %.2f
                    --- Peso: %d
                    --- IMC: %.2f
                    --- Classificaçâo: %s
                """.formatted(nome, generoChar, altura, peso, imc, classificacao);
        
        System.out.println(texteBlock);
        
    }
}

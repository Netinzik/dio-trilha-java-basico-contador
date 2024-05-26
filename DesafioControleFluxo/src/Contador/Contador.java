package Contador;

import java.util.Scanner;

/**
 * Classe Contador para contar de um número inicial até um número final.
 * 
 * <p>
 * Esta classe solicita ao usuário dois números inteiros e conta do primeiro
 * número até o segundo número, imprimindo cada número no console.
 * </p>
 * 
 * <p>
 * Exemplo de uso:
 * 
 *  <pre>
 *      {@code
 *      Contador contador = new Contador();
 *      contador.main(new String[0]);
 *      }
 *  </pre>
 * </p>
 * 
 * @version 1.0
 * @author Sebastião Gonçalves Ferreira Neto
 */
public class Contador {

    /**
     * Construtor padrão para a classe Contador.
     */
    public Contador() {
    }

    /**
     * Método principal que inicia a aplicação.
     * 
     * <p>
     * Este método solicita dois parâmetros do usuário e chama o método contar
     * para realizar a contagem. Se o segundo parâmetro for menor ou igual ao
     * primeiro, uma exceção será lançada.
     * </p>
     * 
     * @param args Argumentos da linha de comando (não utilizados).
     * @throws ParametrosInvalidosException se o segundo parâmetro for menor ou
     *                                      igual ao primeiro.
     */
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();
        terminal.close();

        // Chamando o método contendo a lógica de contagem
        contar(parametroUm, parametroDois);
    }

    /**
     * Método que realiza a contagem de um número inicial até um número final.
     * 
     * <p>
     * Este método valida se o primeiro parâmetro é maior que o segundo e lança uma
     * exceção caso esta condição seja verdadeira. Caso contrário, imprime os
     * números de 0
     * até a diferença entre o segundo e o primeiro parâmetro.
     * </p>
     * 
     * @param parametroUm   O primeiro número (número inicial da contagem).
     * @param parametroDois O segundo número (número final da contagem).
     * @throws ParametrosInvalidosException se o primeiro parâmetro for maior que o
     *                                      segundo.
     */
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é maior que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        // Realizar o for para imprimir os números com base na variável contagem
        for (int i = 0; i <= contagem; i++) {
            System.out.println(i);
        }
    }
}

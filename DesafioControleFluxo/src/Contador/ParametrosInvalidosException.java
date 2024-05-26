package Contador;

/**
 * Exceção personalizada para parâmetros inválidos.
 * 
 * <p>
 * Esta exceção é lançada quando o segundo parâmetro é menor ou igual ao
 * primeiro.
 * </p>
 * 
 * @version 1.0
 * @author Sebastião Gonçalves Ferreira Neto
 */
public class ParametrosInvalidosException extends Exception {
    /**
     * Construtor para a exceção ParametrosInvalidosException.
     * 
     * @param message A mensagem de erro a ser exibida.
     */
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

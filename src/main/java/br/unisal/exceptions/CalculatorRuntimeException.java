package br.unisal.exceptions;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class CalculatorRuntimeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1348935907886197059L;
	
	public CalculatorRuntimeException() {
	}
	
	public CalculatorRuntimeException(String message) {
		super(message);
	}

}

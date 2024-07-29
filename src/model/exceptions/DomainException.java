package model.exceptions;

public class DomainException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) { //permitir que possa instanciar a excecão personalizada passando uma mensagem pra ela 
		super(msg);
	}
	
	
}

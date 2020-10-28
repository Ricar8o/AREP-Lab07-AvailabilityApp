package edu.escuelaing.arep.exceptions;

public class PadovanException extends Exception{

    private static final long serialVersionUID = 5447457695822877940L;

    public PadovanException(String msg) {
        super(msg);
    }
	
	public PadovanException(String msg, Exception e) {
        super(msg,e);
    
    }

}

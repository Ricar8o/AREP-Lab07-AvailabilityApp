package edu.escuelaing.arep.services;

import java.math.BigInteger;

import edu.escuelaing.arep.exceptions.PadovanException;

public class PadovanNumber {

    public PadovanNumber(){
    }

    /**
     * Función que calcula el numero n de la suceción de Padovan de manera
     * recurrente.
     * 
     * @param number El numero de la sucesión
     * @return BigInteger con el valor de la sucesion
     * @throws PadovanException 
     */
    public BigInteger getNumber(int number) throws PadovanException {
        BigInteger answer = BigInteger.ZERO;

        if (number == 0  || number == 1  || number ==2){
            answer = BigInteger.ONE;
        }else if(number>2){
            BigInteger p1 = getNumber(number-2);
            BigInteger p2 = getNumber(number-3);
            answer = p1.add(p2);
        }else{
            throw new PadovanException("Negative Number");
        }

		return answer;
	}
    
}

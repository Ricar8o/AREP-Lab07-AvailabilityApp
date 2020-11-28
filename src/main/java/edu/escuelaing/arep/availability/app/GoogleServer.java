package edu.escuelaing.arep.availability.app;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;
import java.io.BufferedWriter;
import java.io.IOException;
import edu.escuelaing.arep.exceptions.PadovanException;
import edu.escuelaing.arep.services.PadovanNumber;
import java.math.BigInteger;
import java.util.Optional;

public class GoogleServer implements HttpFunction {
  // Simple function to return "Hello World"
  @Override
    public void service(HttpRequest request, HttpResponse response)throws IOException {
        BufferedWriter writer = response.getWriter();
        Optional<String> optional = request.getFirstQueryParameter("number");
        if (optional.isPresent()){
            String val = optional.get();
            writer.write(getPadovanNumber(val));
        }else{
            writer.write("No hay");
        }
    }

    private String getPadovanNumber(String val) {
        PadovanNumber pNumber = new PadovanNumber();
        int number = Integer.parseInt(val);
        BigInteger answer;
        try {
            answer = pNumber.getNumber(number);
            return answer.toString();
        } catch (PadovanException e) {
            return e.getMessage();
        }
    }
}
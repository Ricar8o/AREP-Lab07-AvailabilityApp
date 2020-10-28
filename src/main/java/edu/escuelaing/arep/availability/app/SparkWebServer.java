package edu.escuelaing.arep.availability.app;

import static spark.Spark.*;
import edu.escuelaing.arep.services.PadovanNumber;
import spark.Request;
import spark.Response;
import java.math.BigInteger;

/**
 * web server using Sparkweb
 * 
 * @author Ricar8o
 */

public class SparkWebServer {
    public static void main(String... args) {
        staticFileLocation("/public");
        port(getPort());
        get("hello", (req, res) -> "Hello Service! :)");
        get("/api/v1/getPadovanNumber", (req, res) -> getPadovanNumber(req, res));
        
    }

    /**
     * Función que devuelve el numero correspondiente de la sucesion de Padovan.
     * @param req Spark Request 
     * @param res Spark Response
     * @return
     */
    private static BigInteger getPadovanNumber(Request req, Response res) {
        PadovanNumber pNumber = new PadovanNumber();
        String s = req.queryParams("number");
        int number = Integer.parseInt(s);
        BigInteger answer =  pNumber.getNumber(number);
        return answer;
    }

    private static int getPort() {
         if (System.getenv("PORT") != null) {
             return Integer.parseInt(System.getenv("PORT"));
         }
         return 5001;
    }

}
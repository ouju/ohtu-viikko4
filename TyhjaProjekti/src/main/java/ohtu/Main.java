import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;
import ohtu.Submission;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.io.IOUtils;

public class Main {

    public static void main(String[] args) throws IOException {
        String studentNr = "014144224";
        if ( args.length>0) {
            studentNr = args[0];
        }

        String url = "http://ohtustats2016.herokuapp.com/students/"+studentNr+"/submissions";

        HttpClient client = new HttpClient();
        GetMethod method = new GetMethod(url);
        client.executeMethod(method);

        InputStream stream =  method.getResponseBodyAsStream();

        String bodyText = IOUtils.toString(stream);

        //System.out.println("json-muotoinen data:");
        //System.out.println( bodyText );

        Gson mapper = new Gson();
        Submission[] subs = mapper.fromJson(bodyText, Submission[].class);

        int kaikki = 0;
        int tunnit = 0;
        
        System.out.println("opiskelijanumero " + studentNr + "\n");
        //System.out.println("Oliot:");
        for (Submission submission : subs) {
            System.out.println(submission);
            kaikki += submission.yhteensa();
            tunnit += submission.getHours();
        }

        System.out.println("\nyhteensä: " + kaikki + " tehtävää " + tunnit + " tuntia");
    }
}
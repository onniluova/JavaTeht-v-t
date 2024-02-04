package src.Moduuli3.tehtavisto4;
import java.io.*;
import java.net.*;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class tehtava1 {
    public static void main(String[] args) {
        // first, create the url
        URL myUrl;
        try {
            myUrl = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
        } catch (MalformedURLException e) {
            System.err.println(e);
            return;
        }

        try {
            // open the connection and get the input stream
            // it will automatically generate HTTP GET-request
            InputStream istream = myUrl.openStream();

            // jump to character streams
            InputStreamReader istreamreader = new InputStreamReader(istream);

            // and to buffered reader for efficiency
            BufferedReader reader = new BufferedReader(istreamreader);

            // we use StringBuilder for efficiency, concatenating ordinary Strings is slow and
            // generates unnecessary objects
            String line;
            StringBuilder response = new StringBuilder();

            float sum = 0;
            int count = 0;
            NumberFormat nf = NumberFormat.getInstance(Locale.FRENCH);

            // here we read the content of the web page line by line
            while ((line = reader.readLine()) != null) {
                String[] columns = line.split(";");
                String date = columns[0];
                if (date.contains("01.01.2023")) {
                    //response.append(columns[1] + "\n");
                    sum += nf.parse(columns[1]).floatValue();
                    count++;
                }
            }

            System.out.println("Average: " + (sum / count));

            // now it is time to print the result
            reader.close();
            System.out.println(response.toString());
        } catch (IOException e) {
            System.err.println(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
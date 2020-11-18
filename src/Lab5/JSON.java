package Lab5;


import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class JSON extends Thread {
    public String jsonIn;
    public static String URL;

    private String read(Reader reader) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        int cp;
        while ((cp = reader.read()) != -1) {
            stringBuilder.append((char) cp);
        }
        return stringBuilder.toString();
    }

    public String ConnectAndGetData() {
        jsonIn = "";
        InputStream is;
        try {
            is = new URL(URL).openStream();
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
                try {
                    jsonIn = read(reader);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } finally {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonIn;
    }

    @Override
    public void run() {
        ConnectAndGetData();
        super.run();
    }
}


/*
* Project Test
* @version 1.0
* @date January2018
* @author George Stahovski
*/
package Programs_from_book;

import java.io.*;
import java.net.*;

public class DailyAdviceClient {
    private void go() {
        try {
                Socket s = new Socket("192.168.88.8",65535);
                InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
                BufferedReader reader = new BufferedReader(streamReader);
                String advice = reader.readLine();
                System.out.println("Сегодня ты должен " + advice);
                reader.close();
        } catch(IOException ex) {
                ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
    }
}

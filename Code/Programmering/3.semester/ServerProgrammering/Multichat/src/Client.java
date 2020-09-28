import javax.swing.*;
import java.io.*;
import java.net.Socket;
import java.util.Date;

public class Client {


    public static void main(String[] args) {

        try {
            Socket socket = new Socket("localhost", 9090);

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            while (true) {
                System.out.print("> ");
                String command = keyboard.readLine();
                if(command.equals("quit")){
                    break;
                }
                out.println(command);

                //Server response
                String serverResponse = input.readLine();
                //JOptionPane.showMessageDialog(null, serverResponse);
                System.out.println(serverResponse);

            }



            socket.close();
            System.exit(0);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler implements Runnable {

    private Socket client;
    private BufferedReader input;
    private PrintWriter out;


    public ClientHandler(Socket client) throws IOException {
        this.client = client;
        input = new BufferedReader(new InputStreamReader(client.getInputStream()));
        out = new PrintWriter(client.getOutputStream(), true);
    }

    @Override
    public void run() {

        try {

            while (true) {
                String request = input.readLine();
                System.out.println(request);

                if(request.contains("name")){
                    out.println(DataServer.getRandomName());
                }
                else {
                    out.println("Type 'tell me a name' to get a random name");
                }

            }

        }catch (IOException e ){
            e.printStackTrace();
        }



    }


    public void sendToAll(){
        for(client){

        }
    }
}

import org.json.simple.JSONObject;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class InputHandler implements Runnable {


    private PrintWriter printWriter;
    private Scanner scanner;
    private JSONObject jsonObject = new JSONObject();

    public InputHandler(PrintWriter printWriter, Scanner scanner) {
        this.printWriter = printWriter;
        this.scanner = scanner;
    }

    @Override
    public void run() {

        //Send navn engang
        System.out.print("Type your name to start: ");
        String sendName = keyboardInput();
        printWriter.println(sendName);
        while (true){


            //Send JSON objetk
            String chat = keyboardInput();
            jsonObject.put("Message", chat);
            // Send color obj
//            String color;
//            if(chat.startsWith("#")){
//                color = chat.split(" ")[0];
//            }
//            else {
//                color = "#black";
//            }
            jsonObject.put("color", "\u001B[32");
                printWriter.println(jsonObject.toJSONString());




        }

    }

    public String keyboardInput(){

        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }




}

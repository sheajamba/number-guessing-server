import java.net.*;
import java.util.Random;
import java.io.*;

public class Server {
	
	public static void main (String[] args) throws IOException{
		
		int portNumber = Integer.parseInt(args[0]);
		
		ServerSocket socket = new ServerSocket(portNumber);
		Socket s = socket.accept();
		
		System.out.println("Client connected.");
		
		InputStreamReader input = new InputStreamReader(s.getInputStream());
		BufferedReader bf = new BufferedReader(input);
		
		PrintWriter pr = new PrintWriter (s.getOutputStream(), true);
		pr.println("+ Hello. I'm thinking of a number between 1 and 100. Can you guess it?");
		Random random = new Random();
		
		
		int serverNumber = random.nextInt(100 - 1 + 1) + 1;
		int count = 1;

		
		while (true) {
		
		
		try {
			int clientGuess = Integer.parseInt(bf.readLine());
			
			if (clientGuess <= 1 || clientGuess >= 100) {
				pr.println("Invalid input, please enter only numbers between 1 and 100.");
				
			}
			
			else if (clientGuess < serverNumber) {
				pr.println("> My number is higher.");
				count++;
			}
			
			else if  (clientGuess > serverNumber) {
					pr.println("< My number is lower.");
					count++;
			}
			
			
			else if (clientGuess == serverNumber) {
				pr.println("* That's it. Good job. It took you " + count + " guesses. Thanks for playing.");
				socket.close();
				break;
			}
		
			} catch (NumberFormatException e) {
			pr.println("Invalid input, please enter only numbers between 1 and 100.");
			
			}
		
		}	
	}
}
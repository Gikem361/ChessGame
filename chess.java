import board.board;
import java.util.Scanner;
public class chess{
	public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);
	boolean game=false;
	int[][][] gameBoard = board.init();
	while(game==false){
		board.printBoard(gameBoard);
		System.out.println("What is the old position?");
		String oldPos = keyboard.nextLine();
		int oldPlace = position(oldPos);
		System.out.println("What is the new position?");
		String newPos = keyboard.nextLine();
		int newPlace = position(newPos);
		gameBoard=board.change(gameBoard, oldPlace, newPlace);
		//board.printBoard(gameBoard);
	}
	}
	public static int position(String place){
		char rowChar = place.charAt(0);
		int row = Integer.parseInt(place.replaceAll("[\\D]", "")) -1;
		// 97-104
		int col = (int)rowChar - 97;
		return (8*(7-row))+col;
	}
}
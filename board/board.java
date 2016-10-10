package board;
public class board{
	public static int[][][] init(){
		int[] bRook = {2, 0};
		int[] bKnight = {3, 0};
		int[] bBishop = {4, 0};
		int[] bQueen = {5, 0};
		int[] bKing = {6, 0};
		int[] bPawn = {1, 0};
		int[] wRook = {2, 1};
		int[] wKnight = {3, 1};
		int[] wBishop = {4, 1};
		int[] wQueen = {5, 1};
		int[] wKing = {6, 1};
		int[] wPawn = {1,1};
		int[] empty = {0,2};
		int[][] a = {wRook,wKnight,wBishop,wQueen,wKing,wBishop, wKnight,wRook};
		int[][] b = {wPawn, wPawn, wPawn, wPawn, wPawn, wPawn, wPawn, wPawn};
		int[][] c = {empty, empty, empty, empty, empty, empty, empty, empty};
		int[][] d = {empty, empty, empty, empty, empty, empty, empty, empty};
		int[][] e = {empty, empty, empty, empty, empty, empty, empty, empty};
		int[][] f = {empty, empty, empty, empty, empty, empty, empty, empty};
		int[][] g = {bPawn, bPawn, bPawn, bPawn, bPawn, bPawn, bPawn, bPawn};
		int[][] h = {bRook,bKnight,bBishop,bQueen,bKing,bBishop, bKnight,bRook};
		int[][][] board =  {a,b,c,d,e,f,g,h};
		return board;
	}
	public static int[][][] change(int[][][] Board, int oldPos, int newPos){
		int[] identity = Board[oldPos/8][oldPos%8];
		int[] empty = {0, 2};
		Board[newPos/8][newPos%8]=identity;
		Board[oldPos/8][oldPos%8]=empty;
		return Board;
	}
	public static void printBoard(int[][][] board){
		for (int i = 0; i<8; i++){
			for (int j = 0; j<8; j++){
				int current = board[i][j][0];
				if (current==1){
					System.out.print("p ");
				}
				else if(current==2){
					System.out.print("r ");
				}
				else if(current==3){
					System.out.print("n ");
				}
				else if(current==4){
					System.out.print("b ");
				}
				else if(current==5){
					System.out.print("q ");
				}
				else if(current==6){
					System.out.print("k ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");
	}
}
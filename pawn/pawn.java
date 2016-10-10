package pawn;
public class pawn{
	public static boolean move(int place, int change, int[][][] board){
		if (board[change/8][change%8][0]==0){
			if (change==place+8){
				return true;
			}
			if (place/8==1){
				if (change==place+16){
					return true;
				}
			}
		}
		return false;
	}
	public static boolean capture(int place, int change, int[][][] board){
		if (place%8==0){
			if ((change==place+9)&&(board[change/8][change%8][1]!=board[place/8][place%8][1])){
				return true;
			}
		}
		else if (place%8==7){
			if ((change==place+7)&&(board[change/8][change%8][1]!=board[place/8][place%8][1])){
				return true;
			}
		}
		else if ((change==place+7)||(change==place+9)){
			if (board[change/8][change%8][1]!=board[place/8][place%8][1]){
				return true;
			}
		}
		return false;
	}
}
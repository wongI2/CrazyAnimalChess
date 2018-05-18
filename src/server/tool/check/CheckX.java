package server.tool.check;

public class CheckX {
	/**
	 * 检查X轴
	 *
	 * */

	public static int checkX(int line ,int row ,int id,int[][] chessBoard){

		int check = 0;
		int checkLeft = 0;
		int checkRight = 0;

		for(int i = 0; i < 5; i++){

			if(line - i > -1){

				if( chessBoard[line-i][row] == id){

					checkLeft++;
				}
				else{

					break;
				}
			}

		}

		for(int i = 1; i < 5; i++){

			if(line + i < 15 ){

				if(chessBoard[line+i][row] == id){

					checkRight++;
				}
				else{
					break;
				}
			}

		}

		check = checkLeft + checkRight;
		return (check);
	}
}

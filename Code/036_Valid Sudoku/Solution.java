import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            Set<Character>row=new HashSet<>();
            Set<Character>col=new HashSet<>();
            Set<Character> cube=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'&&!row.add(board[i][j]))
                    return false;
                if(board[j][i]!='.'&&!col.add(board[j][i]))
                    return false;
                int cubeRow = 3 * (i / 3) + j / 3;
                int cubeCol = 3 * (i % 3) + j % 3;
                if (board[cubeRow][cubeCol] != '.'
                        && !cube.add(board[cubeRow][cubeCol]))
                    return false;
            }
        }
        return true;
    }
}

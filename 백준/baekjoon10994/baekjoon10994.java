import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int size = 1+4*(N-1);
        char[][] board = new char[size][size];
        int num = size/2 + 1;


        for(int i = 0; i < num; i++){
            search(board,i,size-i);
        }

        for(int i = 0; i<size;i++){
            for(int j = 0 ; j < size;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    static void search(char[][] board,int start,int end){
        char ch = ' ';
        if(start%2 == 0)
            ch = '*';


        for(int i = start; i< end; i++){
            board[i][start] = ch;
            board[start][i] = ch;
            board[i][end-1] = ch;
            board[end-1][i] = ch;
        }
    }

}

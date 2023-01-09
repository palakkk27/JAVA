import java.util.*;

public class rat_maze {
    
public static boolean isSafe(int arr[][], int row , int col){ // check karo ki kahi bahar toh nahi chala gya yaa fir kahi 0 blockage toh nahi hai 
    return(row<arr.length && col<arr.length && 
           col>=0 && row>=0 && arr[row][col]==1);
}
public static boolean findPathUtil(int arr[][], int solution[][], int row , int col){

    if(row==arr.length-1 && col==arr.length-1 && arr[row][col]==1){
        solution[row][col] = 1;
        return true;
    }
   if( isSafe(arr, row, col)){
    solution[row][col] = 1;

    if(findPathUtil(arr, solution, row +1, col )){ // down
        return true;
    }

    if(findPathUtil(arr, solution, row, col+1 )){ //right
        return true;
    }

    solution[row][col] = 0;
    return false;
   }

   return false;
}

//print array 

public static void printarr(int[][] arr){
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[i][j]+ " ");
        }
        System.out.println();
    }
}

public static void findPath(int[][] arr , int n){
    int[][] solution = new int [n][n];
    if(findPathUtil(arr, solution , 0,0)){
    printarr(solution);
    }

    else{
        System.out.println("no solution");
    }
}

public static void main(String[] args) {
    int maze[][]= {{1,1,0,0},
                   {1,1,0,0},
                   {1,1,0,0},
                   {0,1,1,1}};

    int n = maze.length;

    findPath(maze, n);
}
}

class Solution {
    static boolean isSafeToPlace(int rowIndex,int colIndex,int n,char[][]board){
        //checkleft horizonatal
        int row = rowIndex;
        int col = colIndex;
        while(col >= 0){
            if(board[row][col] == 'Q'){
                return false;
            }
            //row index mein koi change ni krna h
            //col index ki valuw zero tak travel kregi
            col--;
        }
        //check left upper diagonal 
        row = rowIndex;
        col = colIndex;

        while(row >=0 && col >= 0){
            if(board[row][col] =='Q'){
                return false;
            }
            row = row-1;
            col = col-1;
        }
        //check left lower diagonal 
        row = rowIndex ;
        col = colIndex;
         while(row<n && col>=0){
            if(board[row][col] =='Q'){
                return false;

            }
            row = row+1;
            col = col-1;

         }
         return true;

    }
    static void solve(char[][] board,int n, int colIndex,List<List<String>> ans){
        //base case
        if(colIndex >= n){
            //iska mtlb board pe mere ko ek valid aranagement mil gyi h
            //iss valid arrangement ko ans me store kr lo
            List<String> temp = new ArrayList<>();
            for(int i=0;i<n;i++){
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }
        //1 case main solve krta hu,baaki recursion sambhal elga
        //cuurent colum k har celll pr jaake ye fer current column k har row pr jakr 
        //queen place krunga and retsrecursion ko de dunga solve krne ke liye
        for(int rowIndex = 0; rowIndex<n; rowIndex++){
            if(isSafeToPlace(rowIndex,colIndex,n,board)) {
                //place queen
                board[rowIndex][colIndex] = 'Q';
                //baki bacha hua recurson ko dedo
                solve(board,n,colIndex+1,ans);
                //important -> undo ya backtrackung wala step khte h
                board[rowIndex][colIndex] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(board[i],'.');
        }

        int colIndex = 0;
        List<List<String>> ans = new ArrayList<>();

        solve(board,n,colIndex,ans);

        return ans;
        
    }
}
package Mat;

public class str {
    public static void main(String args[]){
        String s = "the man went to his office";
        s = s.replace(" ","");
        int row = 7;
        int col = 3;

        char matrix[][] = new char[row][col];
        int index = 0;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                matrix[i][j] = s.charAt(index++);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int j=0; j<col; j++){
            for(int i=0; i<row; i++){
                sb.append(matrix[i][j]);
            }
        }
        System.out.println(sb);
    }
}

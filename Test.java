public class Test {
    public static void main(String[] args) {
            int row = Integer.parseInt(args[0]);
            int column = Integer.parseInt(args[1]);
            int count = 2;
            int arr[][] = new int[row][column];
            for(int i = 0;i<row;i++){
                for(int j = 0;j<column;j++){
                    arr[i][j] = Integer.parseInt(args[count]);
                    count++;
                }
            }
        for(int i = 0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int l = arr.length;
        int[] b = new int[l];
        int c = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                b[c] = arr[i][j];
                System.out.print(b[c]+" ");
                c++;
            }
        }
}
}

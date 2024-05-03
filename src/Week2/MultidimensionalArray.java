package Week2;

public class MultidimensionalArray {

    public static void main(String[] args) {

        String[][] list = new String[7][4];
        makeB(list);
    }

    static void makeB(String[][] arr) {
        for (int i=0;i<arr.length;i++) {
            for (int j=0;j<arr[i].length;j++) {
                if (i==0 || i==3 || i==6) {
                    arr[i][j] = " * ";
                } else if (j==0 || j==3) {
                    arr[i][j] = " * ";
                } else {
                    arr[i][j] = "   ";
                }
            }
        }
        for (String[] row:arr) {
            for (String column:row) {
                System.out.print(column);
            }
            System.out.println();
        }
    }

}

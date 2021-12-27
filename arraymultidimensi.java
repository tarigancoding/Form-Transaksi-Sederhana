
package chapter9;


public class arraymultidimensi {

    
    public static void main(String[] args) {
        String[][] arrayData = new String [4][3];
        arrayData[0][0]  = "197501";
        arrayData[0][1]  = "Dita";
        arrayData[0][2]  = "70";
        arrayData[1][0]  = "197502";
        arrayData[1][1]  = "Sarah";
        arrayData[1][2]  = "90";
        arrayData[2][0]  = "197503";
        arrayData[2][1]  = "Gilang";
        arrayData[2][2]  = "77";
        arrayData[3][0]  = "197504";
        arrayData[3][1]  = "Fitri";
        arrayData[3][2]  = "70";
 
        System.out.println("NIM \t\t Nama \t\t Nilai UTS");
        for (int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(arrayData [i][j] + "\t\t");
            }
            System.out.print("\n");
        }
    }
    
}

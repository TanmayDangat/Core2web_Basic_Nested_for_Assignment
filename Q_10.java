public class Q_10 {
    public static void main(String[] args) {
        int k = 1;
        for(int i =1; i <= 4; i++){
            for(int j = 1; j <= 4; j++){
                System.out.print(k++ + " ");
            }
            k-=3;
            System.out.println();
        }
    }
}

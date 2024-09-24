public class Q_8 {
    public static void main(String[] args) {
        int k = 1;
        char ch = 'C';
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 3; j++){
                System.out.print(ch);
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
}

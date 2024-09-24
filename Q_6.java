// package core2web.Control_Statements.BasicNestedForAssignment;

public class Q_6 {
    public static void main(String[] args) {
        
        for(int i = 1; i <= 4; i++){
            int k = 1;
            char ch = 'A';
            for(int j = 1; j <= 4; j++){
                System.out.print(k++);
                System.out.print(ch++ + " ");
            }
            
            System.out.println();
        }
    }
}

package multTable;

public class multTable{
    public static void main(String[] args){
     mult();   
    }
    public static void mult(){
        for(int i=1; i<=10; i++){
            for(int h = 1;h <= 10; h++){
                System.out.print(i * h+"\t");
            }
            System.out.println();
            System.out.println();
        }
    }
}
                

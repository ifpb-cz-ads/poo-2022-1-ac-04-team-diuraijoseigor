public class BMExercicio07 {
    public static void main(String[] args) {
        int x = 13, y;
        do{
            if(x % 2 == 0){
                y = x / 2;
            }
            else{
                y = 3 * x + 1;
            }
            System.out.println(y);
            x = y;
        }while(y != 1);
    }
}

package Control_Flow_Statements;
//While is used when we don't know how many times to run the loop, and
// so we continue to loop until certain condition becomes true

public class whileDoWhile {
    public static void main(String[] args) {
        int count = 0;
//        while (count != 5) {
//            System.out.println("count value is: " + count);
//            count++;
//        }
//        count = 0;
//        while (true) {
//            if (count == 5) {
//                break;
//            }
//            System.out.println("count value is: " + count);
//            count++;
//        }
        count = 1;
        do{
            System.out.println("count value is: " + count);
            count++;
            if (count > 10){
                //System.out.println("count value is: " + count);
                break;  // when count >=5 sop is printed and breaks the loop when count = 10!
            }
        }while(count !=5);

    }
}

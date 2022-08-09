package Control_Flow_Statements;

public class switchChallenge {
    public static void main(String[] args) {
        char myChar = 'a';
        //Case Sensitive
        switch (myChar) {
            case 'a':
                System.out.println("Value is a!");
                break;
            case 'b':
                System.out.println("Value is b!");
                break;
            case 'c':
                System.out.println("Value is c!");
                break;
            case 'd':
                System.out.println("Value is d!");
                break;
            case 'e':
                System.out.println("Value is e!");
                break;
            default:
                System.out.println("Char not found!");
                break;
        }
        //O/P: Value is d!
    }
}

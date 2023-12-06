/* Rashid Warsajee
 * Lab Exercise 05
 * Harleen Kaur
 * Due August 4th 2023
 * Method main 
 */
public class Program {
    public static final int ENTER_DATA = 1;           // declarations for the 4 choices
    public static final int DISPLAY_REPORT = 2;
    public static final int RESET_DATA = 3;
    public static final int EXIT_PROGRAM = 4;

    public static void main(String[] args) {        // our main method with object instantiation 
        User user = new User();
        AirQualityhealthIndexRecorder aqhi = new AirQualityhealthIndexRecorder();

        int choice;                                   // our choice integer with do while loop
        do {
            System.out.println("1 Enter AQHI Values");    
            System.out.println("2 Display Report");
            System.out.println("3 Reset AQHI Data");
            System.out.println("4 Exit Program");
            choice = user.inputInteger("Enter your choice: ");   

            switch (choice) {                // our switch with the cases for the choices we have
                case ENTER_DATA:
                    aqhi.enterData(user);
                    break;
                case DISPLAY_REPORT:             // the choices are instantiated from the user class
                    aqhi.printReport();
                    break;
                case RESET_DATA:
                    aqhi.resetData();
                    break;
                case EXIT_PROGRAM:
                    System.out.println("Exiting program.");
                    break;
                default:                    // default output for the switch chase printing invalid input to the user
                    System.out.println("Invalid input, please select again");
            }
        } while (choice != EXIT_PROGRAM);          // while statement that only occurs while the choice is not exit 
        
        
        System.out.println("Program By Rashid Warsajee");
    }
}

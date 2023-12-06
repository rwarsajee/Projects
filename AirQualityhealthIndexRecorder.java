/* Rashid Warsajee
 * Lab Exercise 05
 * Harleen Kaur
 * Due August 4th 2023
 * AirQualityhealthIndexRecorder class
 */
class AirQualityhealthIndexRecorder {        // Our AirQualityhealthIndexRecorder
    private static final int AQHI_MAX = 10;   // Our AQHI MAX Value of 10 as our index maxes out at 10
    private int[] values;                     // Our values variable of int
 
    public AirQualityhealthIndexRecorder() {     // constructor and iniatilzing our values with AQHI_MAX
        values = new int[AQHI_MAX];
    }

    public void enterData(User user) {     // our enterData method with our index initialized at 0 and our char for continuieInput that is used i n the method
        int index = 0;
        char continueInput;

        do {                       // our do while loop with an if statement 
            values[index] = user.inputInteger("Enter AQHI value: ");    
            index++;

            if (index >= AQHI_MAX) {
                System.out.println("Maximum number of values reached.");
                break;
            }

            System.out.print("Enter another? (y/n): "); 
            continueInput = user.inputString("").charAt(0);      // 
        } while (continueInput == 'y' || continueInput == 'Y');      // our while that requires continueInput value of Y to continue
    }

    public void printReport() {
        System.out.println("AQHI Report:");
        for (int i = 0; i < AQHI_MAX; i++) {         // for loop of i = 0, while i is less than AQHI_MAX, increment i by one
            System.out.printf("%3d ", (i + 1));     // Spacing of 3 
            for (int j = 1; j <= values[i]; j++) {   // Our j variable that will print * if it is less than or equal to values of i
                System.out.print("*");
            }
            System.out.println();
        }
    }
 
    public void resetData() {           // our reset data method that sets the values of [i] to 0
        for (int i = 0; i < AQHI_MAX; i++) {
            values[i] = 0;
        }
    }
}
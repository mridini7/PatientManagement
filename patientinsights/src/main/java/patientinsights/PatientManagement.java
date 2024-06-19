package patientinsights;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class PatientManagement
{
    public static void main( String[] args )
    {
         HashMap<Integer, Patients> newPatients = new HashMap<>();
         String [] arrOfString = null;
/* 
        if (args.length > 0) {
            System.out.println("The command line arguments are:");
            for (String val : args)
                System.out.println(val);
        }
*/

        try {
            File myObj = new File("/Users/mridinikulkarni/PatientData/PatientData.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            arrOfString = data.split(",", 6); 
            System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

  
        newPatients.put(1, new Patients(arrOfString[0], arrOfString[1], arrOfString[2], arrOfString[3], arrOfString[4], arrOfString[5]));
        //newPatients.put(2, new Patients("Mary", "Moon", "7", "2010", "mary@gmail.com", "132-465-7809"));
        //newPatients.put(3, new Patients("Anne", "Anand", "10", "2002", "anne@gmail.com", "213-546-8790"));
    }
}

import java.io.*;
import java.util.Scanner;

public class Sudoku_Files extends Sudoku_Cards {


    public static void main(String[] args) throws IOException {

/*

        FileWriter signup = new FileWriter("C:\\Users\\Gaia\\Desktop\\Sudoku_GaiaMihalič\\Signup.txt");
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Gaia\\Desktop\\Sudoku_GaiaMihalič\\Signup.txt"));



        //signup.write();




        //Reading the word to be found from the user
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the word to be found: ");
        String word = sc1.next();
        boolean flag = false;
        int count = 0;
        System.out.println("Contents of the line");

        //Reading the contents of the file
        Scanner sc2 = new Scanner(new FileInputStream("C:\\Users\\Gaia\\Desktop\\Sudoku_GaiaMihalič\\Signup.txt"));
        while(sc2.hasNextLine()) {
            String line = sc2.nextLine();
            System.out.println(line);
            if(line.indexOf(word)!=-1) {
                flag = true;
                count = count+1;
            }
        }
        if(flag) {
            System.out.println("File contains the specified word");
            System.out.println("Number of occurrences is: "+count);
        } else {
            System.out.println("File does not contain the specified word");
        }

     */


    }



 /*public String
    stringgettext = userText1.getText();

    public void getText(){

        System.out.print(stringgettext);
        String getPassword = passwordText1.getText();
        System.out.print(getPassword);
    }*/

    public static void writeInFile(String username, String password) throws IOException {
        String userDataStructure = String.format("%s,%s\n", username, password);

        try {
            FileWriter fw = new FileWriter("Signup.txt", true);
            fw.write(userDataStructure);
            fw.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public static Boolean login(String username, String password) throws FileNotFoundException {
        Scanner reader = new Scanner(new File("Signup.txt"));

        System.out.println(username);
        System.out.println(password);
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            System.out.println(line);

            String[] credentials = line.split(",");

            if (credentials[0].equals(username) && credentials[1].equals(password)) {
                return true;
            }
        }
        return false;
    }
}

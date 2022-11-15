//Christopher Miller
//HW6 CIS-2571
	
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class WordCount {
	
	public static void main(String[] args) throws MalformedURLException, IOException {

	Scanner sc = null;

	int numberWords = 0; //Set variable used for word counting

	try {

	URL url = new URL("https://github.com/kbenoit/ITAUR/blob/master/data/inaugural/1861-Lincoln.txt"); //Grabs the info from the URL

	sc = new Scanner(new InputStreamReader(url.openStream())); //Open the info from URL

	String line; //variable used for each line

	while (sc.hasNext()) //Search through variables in the info from URL
	{

	line = sc.nextLine(); //Gets the line info

	String words[] = line.split(" "); //Separates lines by the space.

	numberWords += words.length; //Sets the numberWords variable to the amount of variables in words

	}

	System.out.println("The total number of words is: " + numberWords); //When loop is done will print out the variable numberWords

	} catch (Exception e) 
	{

	e.printStackTrace();

	}

	sc.close(); //Closes info from URL

	}

}

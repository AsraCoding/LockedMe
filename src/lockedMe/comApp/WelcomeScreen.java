import java.io.File;
import java.io.IOException;
import java.util.*;

public class WelcomeScreen {

	public static void main(String[] args) {
		
		String filename;
		char ch;
		File directory = new File("C:\\Locker");
		
		String[] flist = directory.list();
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("******* Simplilearn Assignment 1 ********");
		System.out.println("------------------------------------------");
		System.out.println("******* Asra Tabassum *********************");
		System.out.println("******* Full Stack Developer  ************");
		System.out.println();
		
		do {
			System.out.println("Select File Option to perform any operation:-");
			System.out.println("1.File Creation");
			System.out.println("2.File List");
			System.out.println("3.File Delete");
			System.out.println("4.Search file");
			System.out.println("5.Exit");
			
			int choice = input.nextInt();
			switch (choice) {

			case 1:

				System.out.println("Enter the file name for crating new file");
				filename = input.next();

				try {
					File file = new File("C:\\Locker"+ filename + ".txt");

					if (file.createNewFile()) {

						System.out.println("File Created Successfully \n");
					} else {
	
						if (file.exists()) {
							System.out.println("File Already Exists");
						} else {
							System.out.println("File Doesen't exist");
						}


						boolean b = file.delete();
						if (b == true) {
							System.out.println("File  Deleted");
						} else {
							System.out.println("File  not Deleted");
						}
					}
				} catch (IOException e) {
					
					e.printStackTrace();
				}

				break;
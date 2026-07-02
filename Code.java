package file;

import java.io.*;

public class intro {

	    public static void main(String[] args) {

	    	String inputFile = "input.txt";
	        String outputFile = "output.txt";

	        int lineCount = 0;
	        int wordCount = 0;

	        try {

	            BufferedReader br = new BufferedReader(new FileReader(inputFile));

	            String line;

	            while ((line = br.readLine()) != null) {

	                lineCount++;

	                String[] words = line.split("\\s+");
	                wordCount += words.length;
	            }

	            br.close();

	            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));

	            bw.write("Number of Lines: " + lineCount);
	            bw.newLine();
	            bw.write("Number of Words: " + wordCount);

	            bw.close();

	            System.out.println("Data processed successfully.");
	            System.out.println("Result saved in output.txt");

	        } catch (FileNotFoundException e) {

	            System.out.println("Input file not found!");

	        } catch (IOException e) {

	            System.out.println("Error while reading or writing file.");
	        }
	    }
	
}

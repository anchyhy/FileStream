import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


// The class of reading files.
public  class ReadFileUtil {
	public static FileContent read(String fileLocation) {
		// Output container
		FileContent fileContent = new FileContent();
		
        File file = new File(fileLocation);
        if(file.isFile() && file.exists()){
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

                String line = bufferedReader.readLine();
                if (line != null) {
                	String[] lineArr = line.split(" ");
                	fileContent.setDays(Integer.parseInt(lineArr[0]));
                	fileContent.setWindowSize(Integer.parseInt(lineArr[1]));
                }
                
                List<Integer> prices = new ArrayList<>();
                while ((line = bufferedReader.readLine()) != null) {
                	for (String item : line.split(" ")) {
                		prices.add(Integer.parseInt(item));
                	}
                }
                fileContent.setPrices(prices);
            } catch (IOException e) {
            	System.err.println("SOMETHING GOES WRONG!");
            }
        }
        return fileContent;
	}
}

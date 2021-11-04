import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        HashMap<String,Integer> occurrenceMap = new HashMap<>();
        File file = new File("sample_text.txt");
        FileReader fileReader = new FileReader(file);
        String line;

        BufferedReader br = new BufferedReader(fileReader);

        while ((line = br.readLine()) != null) {
            String[] wordArr = line.split(" ");

            for (int i = 0; i < wordArr.length; i++) {
                occurrenceMap.put(wordArr[i], occurrenceMap.getOrDefault(wordArr[i],0)+1);
            }

        }
        br.close();

        List<String> order = new ArrayList<>(occurrenceMap.keySet());

        Collections.sort(order,String.CASE_INSENSITIVE_ORDER);

        for (String word1: order) {
            System.out.println("Key: " + word1 + " Value: " + occurrenceMap.get(word1));
        }


    }
}

package subzero;

import java.io.*;
import java.util.*;

import org.apache.commons.lang3.StringUtils;

public class Subtitle {

    private String rawContent;

    public Subtitle(String rawContent) {
        this.rawContent = rawContent;
    }

    public static Subtitle load(InputStream fileStream) {
        String rawContent = readFile(fileStream); 
        return new Subtitle(rawContent);
    }

    public List<String> entries() {
        return Arrays.asList(rawContent.split("\n\n"));
    }
    
    private static String readFile(InputStream fileStream) {
        try {
            BufferedReader in = new BufferedReader(
                new InputStreamReader(fileStream));
            List<String> lines = new ArrayList<String>();
            String line = null;
            while ((line = in.readLine()) != null)
                lines.add(line);
            in.close();
            return StringUtils.join(lines, "\n");
        }
        catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

}

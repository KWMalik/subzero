package subzero;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class SubtitleTest {

    @Test
    public void testReadSubtitleEntries() {
        Subtitle subtitle = Subtitle.load(
            ClassLoader.getSystemResourceAsStream("subtitle.srt"));
        List<String> entries = subtitle.entries(); 
        assertEquals(2, entries.size());
        assertEquals("1\n00:02:17,440 --> 00:02:20,375\nSenator, " + 
        	"we're making\nour final approach into Coruscant.", entries.get(0));
        assertEquals("2\n00:02:20,476 --> 00:02:22,501\nVery good, Lieutenant.", 
        	entries.get(1));
    }
}

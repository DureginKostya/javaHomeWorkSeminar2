import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;

public class ParseJsonLine {
    public void parseJsonRequest() throws RuntimeException {
        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader("jsonLine.txt")) {
            JSONArray jRArray = (JSONArray) parser.parse(reader);
            StringBuilder sBJson = new StringBuilder();
            for (Object item: jRArray) {
                JSONObject jRLine = (JSONObject) item;
                sBJson.append("Студент ");
                sBJson.append((String) jRLine.get("фамилия"));
                sBJson.append(" получил ");
                sBJson.append((String) jRLine.get("оценка"));
                sBJson.append(" по предмету ");
                sBJson.append((String) jRLine.get("предмет"));
                sBJson.append(".\n");
            }
            System.out.print(sBJson);
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }
}

import java.io.*;
public class JsonRequest {
    public void jsonRequest() {
        StringBuilder request = new StringBuilder(readFile());
        String[] arrayRequest = editingLine(request);
        StringBuilder myRequest = new StringBuilder("SELECT * FROM STUDENTS WHERE ");
        for (int i = 0; i < arrayRequest.length; i++) {
            if (arrayRequest[i].indexOf("null") == -1) {
                arrayRequest[i] = deleteSymbol(arrayRequest[i]);
                arrayRequest[i] = deleteSymbol(arrayRequest[i]);
                myRequest.append(arrayRequest[i]);
                myRequest.append(" AND ");
            }
        }
        myRequest.delete(myRequest.lastIndexOf(" AND "), myRequest.length());
        System.out.println(myRequest);
    }
    public String readFile() {
        try (BufferedReader bR = new BufferedReader(new FileReader("jsonRequest.txt"))) {
            StringBuilder sB = new StringBuilder();
            String line = bR.readLine();
            return sB.append(line).toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public String[] editingLine(StringBuilder lineJsonRequest) {
        lineJsonRequest.deleteCharAt(0);
        lineJsonRequest.deleteCharAt(lineJsonRequest.length() - 1);
        String lineRequest = lineJsonRequest.toString();
        lineRequest = lineRequest.replace(':', '=');
        return lineRequest.split(", ");
    }
    public String deleteSymbol(String line) {
        StringBuilder sB = new StringBuilder(line);
        sB.deleteCharAt(sB.indexOf("\""));
        return sB.toString();
    }
}

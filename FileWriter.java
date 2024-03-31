import java.io.IOException;
import java.util.List;

public class FileWriter {
    public void writeInFile(List<String> resultList) {
        try(java.io.FileWriter writer = new java.io.FileWriter("notes.txt", false)) {
            for (String row : resultList) {
                writer.write(row);
                // запись по символам
                writer.append('\n');
                writer.flush();
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
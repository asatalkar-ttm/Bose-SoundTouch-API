package boseapi;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadWriteFile {

    public void usingFileWriter(String filename, String fileContent) throws IOException {
        FileWriter fileWriter = new FileWriter(System.getProperty("user.dir") + File.separator + filename);
        fileWriter.write(fileContent);
        fileWriter.close();
    }

    public String readFileAsString(String fileName)throws Exception {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
}
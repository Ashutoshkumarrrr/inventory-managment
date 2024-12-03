package utils;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

public class Database {
    public static <T> List<T> readFromJSON(String filePath, Class<T[]> clazz) { /* Implementation */ }
    public static <T> void writeToJSON(String filePath, List<T> data) { /* Implementation */ }
}

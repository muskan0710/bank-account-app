package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CSV {
    //read data form csv file and return a list
    public static List<String[]> read(String file) {
        List<String[]> data = new LinkedList<String[]>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            data = br.lines()
                    .map(dataRow -> dataRow.split(","))
                    .collect(Collectors.toCollection(() -> new LinkedList<String[]>()));
        } catch (IOException e) {
            System.out.println("Couldn't find file");
            e.printStackTrace();
        }
        return data;
    }
}

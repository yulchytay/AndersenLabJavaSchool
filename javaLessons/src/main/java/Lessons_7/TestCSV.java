package Lessons_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestCSV {

    public static void main(String args[]) {
        try (PrintWriter writer = new PrintWriter(new File("test.csv"))) {

            StringBuilder sb = new StringBuilder();
            sb.append("Value1");
            sb.append(';');
            sb.append("Value2");
            sb.append(';');
            sb.append("Value3");
            sb.append('\n');

            sb.append("100");
            sb.append(';');
            sb.append("200");
            sb.append(';');
            sb.append("123");
            sb.append('\n');

            sb.append("300");
            sb.append(';');
            sb.append("400");
            sb.append(';');
            sb.append("500");
            sb.append('\n');

            writer.write(sb.toString());
            writer.close();
            System.out.println("done!");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        TestCSV testCSV = new TestCSV();
        testCSV.readCSVFile();
    }

    public void readCSVFile() {
        List<List<String>> records = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("test.csv"));) {
            while (scanner.hasNextLine()) {
                records.add(getRecordFromLine(scanner.nextLine()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(records.toString());
    }

    private List<String> getRecordFromLine(String line) {
        List<String> values = new ArrayList<String>();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(";");
            while (rowScanner.hasNext()) {
                values.add(rowScanner.next());
            }
        }
        return values;
    }

}


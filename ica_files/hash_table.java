package ica_files;
import java.util.Hashtable;

public class hash_table {
    public static void main(String[] args) {
        Hashtable <String, String> table = new Hashtable<String, String>();
        table.put("1", "apple");
        table.put("2", "banana");
        table.put("3", "apricot");
        table.put("4", "grapes");

        System.out.println("two = " + table.get("1"));
        System.out.println("grapes = " + table.get("grapes"));
    }
}

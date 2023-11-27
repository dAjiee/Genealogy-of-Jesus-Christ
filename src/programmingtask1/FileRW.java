/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programmingtask1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexander
 */
public class FileRW {
    private final String filename = "Genealogy.csv";
    private DoublyLinkedList list;

    public FileRW(DoublyLinkedList list) {
        this.list = list;
    }
    
    public void read() {
        try (BufferedReader bufferedreader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = bufferedreader.readLine()) != null) {
                String[] arr = line.split(",");
                String name = arr[0];
                int born = Integer.parseInt(arr[1]);
                int death = Integer.parseInt(arr[2]);
                int lived = Integer.parseInt(arr[3]);
                String verse = arr[4];
                String description = arr[5];
                Node node = new Node(name, born, death, lived, verse, description);
                list.InsertTail(node);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error Reading File!", "Error!", JOptionPane.ERROR_MESSAGE);
            System.out.println(Arrays.toString(e.getStackTrace()));
            System.exit(0);
        }
    }

    public void write() {
        try (FileWriter filewriter = new FileWriter(filename)) {
            for(int i = 0; i < list.size; i++){
                filewriter.write(list.FindByIndex(i).toString());
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error Updating File!\n" + Arrays.toString(e.getStackTrace()), "Error!", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }
}

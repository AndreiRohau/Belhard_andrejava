package els3.serializableTest;

import java.io.*;

/**
 * Created by rohau.andrei on 23.05.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String stringForFile = "d:\\tmp\\serial";

        FileOutputStream fos;
        ObjectOutputStream out = null;

        Counter counter = new Counter(1, "MyCOUNTER");
        int n = 999;
        try {
            fos = new FileOutputStream(stringForFile);
            out = new ObjectOutputStream(fos);
            out.writeObject(counter);

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        out.close();

        FileInputStream fin;
        ObjectInputStream oinp = null;
        Counter cntr2 = null;
        try {
            fin = new FileInputStream(stringForFile);
            oinp = new ObjectInputStream(fin);
            cntr2 = (Counter)oinp.readObject();

        } catch(IOException ex){
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }

        System.out.println(cntr2.toString());

        oinp.close();

    }
}

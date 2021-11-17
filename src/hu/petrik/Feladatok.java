package hu.petrik;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Feladatok {
    private HashMap<String, ArrayList<Versenyzo>> adatok;

    public Feladatok() {
        this.adatok = new HashMap<>();
        beolvas();
        kiir();
    }

    public void beolvas() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("eredmenyek.txt"));
            String sor = br.readLine();
            while (sor != null) {
                String[] st = sor.split(" ");
                String sportag = st[0];
                String ido = st[1];
                String nev = st[2] + " " + st[3];
                Versenyzo v = new Versenyzo(nev, ido);

                adatok.putIfAbsent(sportag, new ArrayList<>());
                adatok.put(sportag, adatok.get(sportag)).add(v);

                sor = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    private void kiir() {
        for (Map.Entry<String, ArrayList<Versenyzo>> entry: adatok.entrySet()) {
            System.out.println(entry.getKey() + ": ");
            for (Versenyzo item: entry.getValue()) {
                System.out.println("\t" + item);
            }
            System.out.println();
        }
    }
}

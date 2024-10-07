import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Lista {
    private ArrayList<Bejegyzes> Bejegyzeslista;

    public Lista(){
        this.Bejegyzeslista = new ArrayList<Bejegyzes>();
    }

    public ArrayList<Bejegyzes> getBejegyzeslista() {
        return Bejegyzeslista;
    }

    public void setBejegyzeslista(ArrayList<Bejegyzes> bejegyzeslista) {
        this.Bejegyzeslista = bejegyzeslista;
    }

    public void beolvas(){
        try(BufferedReader br = new BufferedReader(new FileReader("bejegyzesek.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Bejegyzeslista.add(new Bejegyzes(values[0], values[1]));
            }
        }
    }

    public void likes(){
        int tip = this.Bejegyzeslista.size() +20;
        for (int i = 0; i< tip; i++){
            int random = (int)(Math.random()*this.Bejegyzeslista.size());
            this.Bejegyzeslista.get(random).like();
            System.out.println(i);
        }
    }

    public void add(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("adjon meg egy darabszamot");
        String darab = scanner.nextLine();
        if(parseInt(darab)<0){
            throw new IllegalArgumentException("nem termeszetes szam");
        }else {
            if (parseInt(darab)==0){
                return;
            }else{
            for (int i = 0; i < parseInt(darab); i++) {
                System.out.println("bejegyzes szerzoje");
                String szerzo;
                }
            }
        }
    }
}

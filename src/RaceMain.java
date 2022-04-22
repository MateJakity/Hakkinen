
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class RaceMain {

    public static void main(String[] args) {
        List<Race> raceLista = new ArrayList<>();
        String line = "";

        BufferedReader br;

        {
            try {
                br = new BufferedReader(new FileReader("resources\\Hakkinen.csv"));
                br.readLine(); //első sor kihagyása mivel az mezőelnevezéseket tartalmaz
                while((line = br.readLine()) != null){
                    String[] raceRound = line.split(";");

                    //Dátumok beállítása
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
                    LocalDate date;
                    date = LocalDate.parse(raceRound[1], formatter);

                    int helyezes;
                    int pont = Integer.parseInt(raceRound[4]);
                    System.out.println(pont);
                    if(raceRound[3].equals("-") || raceRound[3].isEmpty()){
                        helyezes = 0;
                    }else{
                        helyezes = Integer.parseInt(raceRound[3]);
                    }
                    Race race = new Race(raceRound[0], date, raceRound[2], helyezes, pont);
                    raceLista.add(race);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for(Race race : raceLista){
            System.out.println(race.getNagydij() + " " + race.getLocaldate() + " " + race.getKonstruktor() + " " + race.getEredmeny() + " " + race.getPont());
        }

    }
}

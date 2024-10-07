import java.time.LocalDateTime;

public class Bejegyzes {


    private String szerzo;
    private String tartalom;
    private Integer likeok;
    private LocalDateTime letrejott;
    private LocalDateTime szerkesztve;


    public Bejegyzes(String szerzo, String tartalom) {
        this.szerzo = szerzo;
        this.tartalom = tartalom;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public String getTartalom() {
        return tartalom;
    }

    public void setTartalom(String tartalom) {
        this.tartalom = tartalom;
    }

    public Integer getLikeok() {
        return likeok=0;
    }

    public LocalDateTime getLetrejott() {
        return letrejott;
    }

    public LocalDateTime getSzerkesztve() {
        return szerkesztve;
    }

    public void like(){
        this.likeok+=1;
    }

    @Override
    public String ToString(){
        return this.szerzo+"-"+this.likeok+"-"+this.letrejott+"szerkesztve:"+szerkesztve+tartalom;
    }

}


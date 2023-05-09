package campeonato;

public class Partida {

    private Time timeDaCasa;
    private Time timeVisitante;
    private int golsTimeDaCasa;
    private int golsTimeVisitante;

    public Partida(Time timeDaCasa, Time timeVisitante, int golsTimeDaCasa, int golsTimeVisitante) {
        this.timeDaCasa = timeDaCasa;
        this.timeVisitante = timeVisitante;
        this.golsTimeDaCasa = golsTimeDaCasa;
        this.golsTimeVisitante = golsTimeVisitante;
    }

    public Time getTimeDaCasa() {
        return timeDaCasa;
    }

    public void setTimeDaCasa(Time timeDaCasa) {
        this.timeDaCasa = timeDaCasa;
    }

    public Time getTimeVisitante() {
        return timeVisitante;
    }

    public void setTimeVisitante(Time timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    public int getGolsTimeDaCasa() {
        return golsTimeDaCasa;
    }

    public void setGolsTimeDaCasa(int golsTimeDaCasa) {
        this.golsTimeDaCasa = golsTimeDaCasa;
    }

    public int getGolsTimeVisitante() {
        return golsTimeVisitante;
    }

    public void setGolsTimeVisitante(int golsTimeVisitante) {
        this.golsTimeVisitante = golsTimeVisitante;
    }

    @Override
    public String toString() {
        return "Partida{" + "timeDaCasa=" + timeDaCasa + ", timeVisitante=" + timeVisitante + ", golsTimeDaCasa=" + golsTimeDaCasa + ", golsTimeVisitante=" + golsTimeVisitante + '}';
    }

}

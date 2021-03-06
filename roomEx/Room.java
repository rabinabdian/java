package roomEx;

public class Room {

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + etage;
        result = prime * result + geb�ude;
        result = prime * result + raumnummer;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Room other = (Room) obj;
        if (etage != other.etage)
            return false;
        if (geb�ude != other.geb�ude)
            return false;
        if (raumnummer != other.raumnummer)
            return false;
        return true;
    }

    public int geb�ude;
    public int etage;
    public int raumnummer;

    public Room(int geb�ude, int etage, int raumnummer) {
        super();
        this.geb�ude = geb�ude;
        this.etage = etage;
        this.raumnummer = raumnummer;
    }

    @Override
    public String toString() {
        String s = String.format("%2s-%s.%02d", this.geb�ude, this.etage, this.raumnummer);
        return s;
    }
}

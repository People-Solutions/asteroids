public class Persona implements Comparable<Persona> {
    private String nome;
    private String cognome;
    private int eta;

    public Persona() {};

    public Persona(String nome, String cognome, int eta) {
        this.cognome = cognome;
        this.nome = nome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    @Override
    public int compareTo(Persona o) {
        int c = this.cognome.compareTo(o.cognome);
        if (c == 0) {
            c = this.nome.compareTo(o.nome);
        }
        if (c == 0) {
            c = Integer.compare(eta, o.eta);
        }
        return c;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Persona{cognome=").append(cognome);
        sb.append(",nome=").append(nome);
        sb.append(",eta=").append(eta).append("}");
        return sb.toString();
    }
}

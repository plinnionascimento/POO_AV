import javax.swing.text.html.HTML;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Evento {

    private String nome;
    private LocalDate data;
    private String local;
    private double precoIngresso;
    private Promotor promotor;
    private List<HTML.Tag> tags;

    public Evento(String nome, LocalDate data, String local, double precoIngresso, Promotor promotor) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.precoIngresso = precoIngresso;
        this.promotor = promotor;
        this.tags = new ArrayList<>();
    }

    public Evento(String showDeRock, String s, String arenaMineira) {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public double getPrecoIngresso() {
        return precoIngresso;
    }

    public void setPrecoIngresso(double precoIngresso) {
        this.precoIngresso = precoIngresso;
    }

    public Promotor getPromotor() {
        return promotor;
    }

    public void setPromotor(Promotor promotor) {
        this.promotor = promotor;
    }

    public List<HTML.Tag> getTags() {
        return tags;
    }

    public void setTags(List<HTML.Tag> tags) {
        this.tags = tags;
    }

    public boolean consultarEvento(String nome) {
        return this.nome.equals(nome);
    }

    public void inserirTag(HTML.Tag tag) {
        this.tags.add(tag);
    }

    public double getQtdeIngresso() {
    }
}

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class bootcamp {
    
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<dev> devsInscritos = new HashSet<>();
    private Set<conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDescricao(){
        return descricao;

    }

    public void setDescricao(String descricao){
        this.descricao = descricao;

    }
    public LocalDate getDataInicial() {
        return dataInicial;
    }
    public LocalDate getDataFinal(){
        return dataFinal;
    }
    public Set<dev> getDevsInscritos(){
        return devsInscritos;
    }
    public void setDevsInscritos(Set<dev> devsInscritos){
        this.devsInscritos = devsInscritos;
    }
    public Set<conteudo> getConteudos(){
        return conteudos;
    }
    public void setConteudos(Set<conteudo> conteudos){
        this.conteudos = conteudos;
    }

   @Override
    public boolean equals(Object O){
        if (this == O)return true;
        if (O == null || getClass() != O.getClass()) return false;
        bootcamp bootcamp = (bootcamp) O;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }


}

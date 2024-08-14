import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Objects;
import java.util.Optional;
public class dev {
    

    private String nome;
    private Set<conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(bootcamp bootcamp){

        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);

    }
    public void progredir() {

        Optional<conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está inscrito em nenhum conteúdo!");
        }
    }
    public double calcularTotalXp() {

        return this.conteudosConcluidos
        .stream()
        .mapToDouble(conteudo -> conteudo.calcularXp())
        .sum();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Set<conteudo> getConteudosInscritos(){
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<conteudo> conteudosInscritos){
        this.conteudosInscritos = conteudosInscritos;

    }

    public Set<conteudo> getConteudosConcluidos(){
        return conteudosConcluidos;

    }
    public void setConteudosConcluidos(Set<conteudo> conteudosConcluidos){
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object O){
        if (this == O)return true;
        if (O == null || getClass() != O.getClass()) return false;
        dev dev = (dev) O;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }

}

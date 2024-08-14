public class curso extends conteudo{
    
 
    private int cargaHoraria;

    @Override
    public double calcularXp(){
        return XP_PADRAO * cargaHoraria;
    }
    public curso() {

    }

    public int getCargaHoraria(){
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString(){
        return "Curso{" +
                "titulo=" + getTitulo() + '\'' +
                ", descricao=" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }









}

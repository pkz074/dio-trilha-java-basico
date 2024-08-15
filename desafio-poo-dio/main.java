public class main {
    public static void main(String[] args) throws Exception {
        

        curso curso1 = new curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        curso curso2 = new curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        mentoria mentoria = new mentoria();
        mentoria.setTitulo ("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); 



        bootcamp bootcamp = new bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        dev devJoao = new dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Joao:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteudos concluidos Joao: " + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
        System.out.println("--------------------------------");



        dev devLavinia = new dev();
        devLavinia.setNome("Lavinia");
        devLavinia.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Lavinia:" + devLavinia.getConteudosInscritos());
        devLavinia.progredir();
        System.out.println("Conteudos concluidos Lavinia: " + devLavinia.getConteudosConcluidos());
        System.out.println("XP:" + devLavinia.calcularTotalXp());

        
    }
}

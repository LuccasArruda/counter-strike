public class ExercicioAluno {

    public static void main(String[] args) {
        Aluno Aluno1, Aluno2, Aluno3, Aluno4, Aluno5;

        Aluno1 = new Aluno("Carlinho", "432112", 3F, 4F, 80);
        Aluno1.situacaoAluno();

        Aluno2 = new Aluno("Cláudio", "234255", 5F, 5F, 60);
        Aluno2.situacaoAluno();

        Aluno3 = new Aluno("Cleber", "23464", 10F, 9.5F, 100);
        Aluno3.situacaoAluno();

        Aluno4 = new Aluno("Geraldo", "239482", 1F, 1F, 10);
        Aluno4.situacaoAluno();

        Aluno5 = new Aluno("Rogério", "234432", 6F, 1F, 100);
        Aluno5.situacaoAluno();
    }
}

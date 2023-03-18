import java.util.List;
import java.util.Random;

public class SorteadorDeAlunos {
	   private List<Aluno> alunos;

	    public SorteadorDeAlunos(List<Aluno> alunos) {
	        this.alunos = alunos;
	    }

	    public Aluno sortearAluno() {
	        Random random = new Random();
	        int alunoAleatorio = random.nextInt(alunos.size());
	        return alunos.get(alunoAleatorio);
	    }

}

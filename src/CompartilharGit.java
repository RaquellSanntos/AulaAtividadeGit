import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class CompartilharGit {

	public static void main(String[] args) {
		 List<Aluno> alunos = new ArrayList<>();
		 //Coloque seu nome e turma dentro das aspas duplas
		 alunos.add(new Aluno("Raquel Sanntos - tutora"));
		

	        SorteadorDeAlunos sorteador = new SorteadorDeAlunos(alunos);
	        Aluno alunoSorteado = sorteador.sortearAluno();

	        PrintStream out = System.out;
	       // out.print("\033[31m"); // define a cor vermelha
	     // out.print("\033[34m"); // define a cor azul
	        System.out.println("  A equipe sorteada foi:" );
	        out.print("\033[32m"); // define a cor verde
	        System.out.println("  "+ alunoSorteado.getALuno());
	        out.print("\033[0m"); // volta à cor padrão
	}

}

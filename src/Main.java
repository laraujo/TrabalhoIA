

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Disciplina disciplina = new Disciplina();
		disciplina.setStrNomeDisciplina("IA");

		Disciplina disciplinaB = new Disciplina();
		disciplinaB.setStrNomeDisciplina("Calculo");

		Professor profA = new Professor();
		profA.setStrNome("João");
		profA.AddDisciplina(disciplina);
		profA.AddDisciplina(disciplinaB);
		
		Professor profB = new Professor();
		profB.setStrNome("Pedro");
		profB.AddDisciplina(disciplina);
		

		Professor profC = new Professor();
		profC.setStrNome("Almir");
		profC.AddDisciplina(disciplinaB);

		
		Grade gr.SetProfessorList()
			
	}

}

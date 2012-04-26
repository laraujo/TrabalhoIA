import java.util.ArrayList;


public class Professor {
	String strNome;
	//horarios disponiveis
	ArrayList<Integer> RestricaoTurno= new ArrayList<Integer>();
		
	ArrayList<Disciplina> disciplinasDisponiveis =  new ArrayList<Disciplina>();
	
	
	
	public ArrayList<Integer> getRestricaoTurno() {
		return RestricaoTurno;
	}
	public void setRestricaoTurno(ArrayList<Integer> restricaoTurno) {
		RestricaoTurno = restricaoTurno;
	}
	
	public String getStrNome() {
		return strNome;
	}
	public void setStrNome(String strNome) {
		this.strNome = strNome;
	}
	
	public ArrayList<Disciplina> getDisciplinasDisponiveis() {
		return disciplinasDisponiveis;
	}
	
	public void AddDisciplina(Disciplina disc) {
		disciplinasDisponiveis.add(disc);
	}
	
	
	public void AddRestricaoTurno(Integer turno) {
		RestricaoTurno.add(turno);
	}
	
	public void setDisciplinasDisponiveis(
			ArrayList<Disciplina> disciplinasDisponiveis) {
		this.disciplinasDisponiveis = disciplinasDisponiveis;
	}
	
}

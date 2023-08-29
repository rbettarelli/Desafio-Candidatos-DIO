package candidatos;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		System.out.println();
		analizarCandidato(1900.00);
		analizarCandidato(3500.00);
		analizarCandidato(2000.00);

	}
	
	static void analizarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		}else if (salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM OUTRA PROPOSTA");
			
		}else {
			System.out.println("AGUARANDO DEMAIS CANDIDATOS");
		}
		
	}

}

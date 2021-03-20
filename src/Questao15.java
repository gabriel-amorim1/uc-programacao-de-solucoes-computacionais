import java.util.Scanner;

/*
 * Considerando uma eleição de apenas dois candidatos, faça um programa
 * que leia o número total de eleitores, o número de votos do primeiro
 * candidato e o número de votos do segundo candidato. Em seguida, o 
 * programa deverá apresentar o percentual de votos de cada um dos candidatos
 * e o percentual de votos nulos.
 */

public class Questao15 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int totalVoters, firstCandidateNumberVotes, secondCandidateNumberVotes, nullVotesNumber;
		
		System.out.printf("Digite o total de votos: ");
		totalVoters = read.nextInt();
		
		System.out.printf("Digite o número de votos do primeiro candidato: ");
		firstCandidateNumberVotes = read.nextInt();
		
		System.out.printf("Digite o número de votos do segundo candidato: ");
		secondCandidateNumberVotes = read.nextInt();
		
		read.close();
		
		nullVotesNumber = totalVoters - (firstCandidateNumberVotes + secondCandidateNumberVotes);
		
		System.out.println("\nPercentual de votos do primeiro candidato: " + ((firstCandidateNumberVotes * 100) / totalVoters) + "%");
		System.out.println("Percentual de votos do segundo candidato: " + ((secondCandidateNumberVotes * 100) / totalVoters) + "%");
		System.out.println("Percentual de votos nulos: " + ((nullVotesNumber * 100) / totalVoters) + "%");
		
	}

}

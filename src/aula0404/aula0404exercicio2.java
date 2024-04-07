package aula0404;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class aula0404exercicio2 {

	public static void main(String[] args) {
		contaTempo(25, 12, 2024);
	}

	public static void contaTempo(int dia, int mes, int ano) {
		LocalDate dataAtual = LocalDate.now();

		LocalDate dataFutura = LocalDate.of(ano, mes, dia);

		Period periodo = Period.between(dataAtual, dataFutura);

		int anos = periodo.getYears();
		int meses = periodo.getMonths();
		int dias = periodo.getDays();

		System.out.printf("Faltam %d anos, %d meses e %d dias para %s.\n", anos, meses, dias,
				dataFutura.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}
}

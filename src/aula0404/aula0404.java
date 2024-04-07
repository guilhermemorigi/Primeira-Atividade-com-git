package aula0404;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class aula0404 {

    public static void main(String[] args) {
    	aula0404 programa = new aula0404();
        System.out.println(programa.getDataHoraPorExtenso());
    }

    public String getDataHoraPorExtenso() {
        Locale localeBR = new Locale("pt", "BR");
        LocalDate dataAtual = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();
        
        String diaSemana = dataAtual.format(DateTimeFormatter.ofPattern("EEEE", localeBR));
        String dia = dataAtual.format(DateTimeFormatter.ofPattern("dd", localeBR));
        String mes = dataAtual.format(DateTimeFormatter.ofPattern("MMMM", localeBR));
        String ano = dataAtual.format(DateTimeFormatter.ofPattern("yyyy", localeBR));
        String hora = horaAtual.format(DateTimeFormatter.ofPattern("HH", localeBR));
        String minuto = horaAtual.format(DateTimeFormatter.ofPattern("mm", localeBR));
        
        return String.format("Hoje é %s, dia %s de %s de %s e agora são %s horas e %s minutos.",
                diaSemana, dia, mes, ano, hora, minuto);
    }
}

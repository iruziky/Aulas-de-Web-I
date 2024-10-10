package imd.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import imd.model.Escola;
import imd.model.Evento;

public class EscolaVisao{
	
	public static void main(String args []) throws ParseException{
		Escola escola = new Escola();
		Evento evento = new Evento();
		
		Scanner ler = new Scanner(System.in);
		
		String descricao = "";
		String data = "00-00-0000";
		
		System.out.println("Informe a descrição do evento:");
		descricao = ler.nextLine();
		
		System.out.println("Informe a data do evento:");
		data = ler.nextLine();
		
		Date dt = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
		dt = formato.parse(data);
		
		evento.setNome(descricao);
		evento.setData(dt);
		
		escola.setEvento(evento);
		System.out.println(escola.mostrarEvento());
		
		ler.close();
	}
}



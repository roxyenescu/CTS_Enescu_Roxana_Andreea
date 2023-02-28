package cts.main;

import java.io.FileNotFoundException;
import java.util.List;

import cts.clase.Angajat;
import cts.clase.Aplicant;
import cts.clase.reader.ReaderAngajat;

public class Program {

	public static void main(String[] args) {
		
		ReaderAngajat readerAngajat = new ReaderAngajat();
		List<Aplicant> listaAngajati;
		try {
			listaAngajati = readerAngajat.readAplicants("angajati.txt");
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package menjacnica;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import menjacnica.sistemskeOpracije.SODodajValutu;
import menjacnica.sistemskeOpracije.SOIzvrsitransakciju;
import menjacnica.sistemskeOpracije.SOObrisiValutu;
import menjacnica.sistemskeOpracije.SOSacuvajFajl;
import menjacnica.sistemskeOpracije.SOUcitajIzFajla;

public class Menjacnica implements MenjacnicaInterface{
	
	private LinkedList<Valuta> kursnaLista = new LinkedList<Valuta>();

	@Override
	public void dodajValutu(Valuta valuta) {
		SODodajValutu.izvrsi(valuta, kursnaLista);
	}

	@Override
	public void obrisiValutu(Valuta valuta) {
		SOObrisiValutu.izvrsi(valuta, kursnaLista);
	}

	@Override
	public double izvrsiTransakciju(Valuta valuta, boolean prodaja, double iznos) {
		return SOIzvrsitransakciju.izvrsi(valuta, prodaja, iznos);
	}

	@Override
	public LinkedList<Valuta> vratiKursnuListu() {
		return kursnaLista;
	}

	@Override
	public void ucitajIzFajla(String putanja) {
		kursnaLista=SOUcitajIzFajla.izvrsi(putanja);
	}

	@Override
	public void sacuvajUFajl(String putanja) {
		SOSacuvajFajl.izvrsi(putanja, kursnaLista);
	}

	
}

package menjacnica.sistemskeOpracije;

import menjacnica.Valuta;

public class SOIzvrsitransakciju {

	public static double izvrsi(Valuta valuta, boolean prodaja, double iznos)
	{
		if (prodaja)
			return iznos*valuta.getProdajni();
		else
			return iznos*valuta.getKupovni();
	}
}

import javax.swing.JOptionPane;

public class ConversionDivisas extends Conversion {
		
	private String tipoConversion;
		
		public String selectTipoConversion() {
			this.tipoConversion = (JOptionPane.showInputDialog(null,"Selecciona la divisa que desea convertir su dinero","Divisas", 
					  JOptionPane.PLAIN_MESSAGE, null, new Object[] {
							  "De Pesos a Dólar",
							  "De Pesos a Euros",
							  "De Pesos a Libras Esterlinas",
							  "De Pesos a Yen Japonés",
							  "De Pesos a Won coreano",
							  "De Dólar a Pesos",
							  "De Euros a Pesos",
							  "De Libras Esterlinas a Pesos",
							  "De Yen Japonés a Pesos",
							  "De Won coreano a Pesos",
					  },"De Pesos a Dólar")).toString();
			return tipoConversion;
		}
		
		public double calculoConversion(String tipoConversion, double cantidad) {
			
			switch (tipoConversion) {
			case "De Pesos a Dólar":
				cantidad = cantidad / 4733.69;
				
				break;
				
			case "De Pesos a Euros":
				cantidad = cantidad / 5049.80;
				
				break;
				
			case "De Pesos a Libras Esterlinas":
				cantidad = cantidad / 5705.51;
				
				break;
				
			case "De Pesos a Yen Japonés":
				cantidad = cantidad / 35.65;
				
				break;
				
			case "De Pesos a Won coreano":
				cantidad = cantidad / 3.70;
				
				break;
				
			case "De Dólar a Pesos":
				cantidad = cantidad * 4733.69;
				
				break;
				
			case "De Euros a Pesos":
				cantidad = cantidad * 5049.80;
				
				break;
				
			case "De Libras Esterlinas a Pesos":
				cantidad = cantidad * 5705.51;
				
				break;
				
			case "De Yen Japonés a Pesos":
				cantidad = cantidad * 35.65;
				
				break;
				
			case "De Won Surcoreano a Pesos":
				cantidad = cantidad * 3.70;
				
				break;
				

			default:
				break;
			}
			return cantidad;
			
		}

}

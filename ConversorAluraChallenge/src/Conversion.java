import javax.swing.JOptionPane;

public abstract class Conversion {

	private String option;
	protected String tipoConversion;
	private double valor;
	private boolean bool = true;
	
	
	public String getOption() {
		return option;
	}
	
	public void setOption(String option) {
		this.option = option;
	}
	
	/**
	 * 
	 * @param input
	 * @return
	 */
	
	public double cantidad(String input) {
		while(bool) {
			
			if(input.isEmpty()) {
				JOptionPane.showMessageDialog(null, "No introdujiste ningun valor");
			} else {
				bool = false;
			}
		}
		this.valor = Double.parseDouble(input);
		return this.valor;

	}
	
	
	protected abstract String selectTipoConversion();
	
	protected abstract double calculoConversion(String tipoConversion, double cantidad);

}

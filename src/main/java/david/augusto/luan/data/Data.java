package david.augusto.luan.data;

import david.augusto.luan.exception.DataInvalidaException;

public class Data {

//	Date agora = new Date();
//	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//	String dataFormatada = formatter.format(agora);

	private String data;

	public Data(String data) throws DataInvalidaException {
		this.data = data;
		if (this.data.length() > 10) {
			throw new DataInvalidaException();
		}

	}

	public int getDia() {
		Integer.parseInt(this.data);
		return this.data.indexOf(0, 2);
//		this.formatter = new SimpleDateFormat("dd/");
//        String dataFormatada = formatter.format(agora);
//        return dataFormatada;

	}

//	public String getMes() {
//		this.formatter = new SimpleDateFormat("/MM");
//        String dataFormatada = formatter.format(agora);
//        return dataFormatada;
//	}
//
//	public String getAno() {
//		this.formatter = new SimpleDateFormat("///yyyy");
//        String dataFormatada = formatter.format(agora);
//        return dataFormatada;
//	}
//	
	public static void main(String[] args) {
		Data d = new Data("22/12/2020");
		System.out.println(d.getDia());
	}
}

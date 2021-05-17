

import java.time.format.DateTimeFormatter;

import javax.swing.JTextField;



public class Anuncio {
	public static void main(String[] args) {}
	String nomeDoAnuncio;
	String cliente;
	DateTimeFormatter dataInicio = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	int investimentoPorDia;
	DateTimeFormatter dataFim = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Anuncio(String nomeDoAnuncio, String cliente, DateTimeFormatter dataInicio, DateTimeFormatter dataFim, int investimentoPorDia) {
		super();
		this.nomeDoAnuncio = nomeDoAnuncio;
		this.cliente = cliente;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.investimentoPorDia = investimentoPorDia;
	}
	
	public Anuncio(JTextField textField, JTextField textField_1, JTextField textField_2, JTextField textField_3,
			JTextField textField_4) {
		// TODO Auto-generated constructor stub
	}

	public String getNomeDoAnuncio() {
		return nomeDoAnuncio;
	}
	public void setNomeDoAnuncio(String nomeDoAnuncio) {
		this.nomeDoAnuncio = nomeDoAnuncio;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public DateTimeFormatter getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(DateTimeFormatter dataInicio) {
		this.dataInicio = dataInicio;
	}
	public DateTimeFormatter getDataFim() {
		return dataFim;
	}
	public void setDataFim(DateTimeFormatter dataFim) {
		this.dataFim = dataFim;
	}
	public Integer getInvestimentoPorDia() {
		return investimentoPorDia;
	}
	public void setInvestimentoPorDia(Integer investimentoPorDia) {
		this.investimentoPorDia = investimentoPorDia;
	}

	public static Object get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	}



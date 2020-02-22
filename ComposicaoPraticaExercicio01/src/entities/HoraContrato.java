package entities;

import java.util.Date;

public class HoraContrato {

	private Date data;

	private double valorHora;

	private int horas;

	public HoraContrato() {
	}

	public HoraContrato(Date data, double valorHora, int horas) {

		this.data = data;
		this.valorHora = valorHora;
		this.horas = horas;

	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double totalValores() {

		return this.valorHora * this.horas;

	}

}

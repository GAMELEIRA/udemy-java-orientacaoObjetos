package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.NivelTrabalho;

public class Trabalho {

	private String nome;

	private NivelTrabalho nivel;

	private double baseSalario;

	private Departamento departamento;

	private List<HoraContrato> contrato = new ArrayList<HoraContrato>();

	public Trabalho() {
	}

	public Trabalho(String nome, NivelTrabalho nivel, double baseSalario, Departamento departamento) {

		this.nome = nome;
		this.nivel = nivel;
		this.baseSalario = baseSalario;
		this.departamento = departamento;
		this.contrato = contrato;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalho getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalho nivel) {
		this.nivel = nivel;
	}

	public double getBaseSalario() {
		return baseSalario;
	}

	public void setBaseSalario(double baseSalario) {
		this.baseSalario = baseSalario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HoraContrato> getContrato() {
		return contrato;
	}

	public void adicionaContrato(HoraContrato contrato) {

		this.contrato.add(contrato);

	}

	public void removeContrato(HoraContrato contrato) {

		this.contrato.remove(contrato);

	}

	public double calculaQuantoGanhou(int mes, int ano) {

		Calendar cal;

		double salario;

		cal = Calendar.getInstance();

		salario = this.baseSalario;

		for (HoraContrato c : this.contrato) {

			cal.setTime(c.getData());

			int c_year = cal.get(Calendar.YEAR);

			int c_month = 1 + cal.get(Calendar.MONTH);

			salario += (c_year == ano && c_month == mes) ? c.totalValores() : 0;

		}

		return salario;
		
	}
}
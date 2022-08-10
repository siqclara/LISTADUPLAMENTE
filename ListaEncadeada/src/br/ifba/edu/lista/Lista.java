package br.ifba.edu.lista;

import javax.swing.JOptionPane;

import br.ifba.edu.basica.Celula;

public class Lista {

	private Celula cabeca;
	private Celula cauda;

	private int totalElementos = 0;

	public void adicionaNoComeco(Object obj) {

		Celula nova = new Celula(this.cabeca, obj);
		this.cabeca = nova;

		if (totalElementos == 0) {
			this.cauda = nova;

		}

		this.totalElementos++;
	}

	public void adicionarFinal(Object obj) {
		if (this.totalElementos == 0) {
			this.adicionaNoComeco(obj);
		} else {
			Celula nova = new Celula(obj);
			this.cauda.setProxima(nova);
			this.cauda = nova;
			this.totalElementos++;
		}
	}

	public boolean verificarPosicao(int posicao) {
		return posicao >= 0 && posicao < this.totalElementos;

	}

	public void adicionaPorPosicao(int posicao, Object obj) {

		if (posicao == 0) {
			this.adicionaNoComeco(obj);
		} else if (posicao == this.totalElementos) {
			this.adicionarFinal(obj);
		} else {
			if (!this.verificarPosicao(posicao)) {
				JOptionPane.showMessageDialog(null, "Posi��o inv�lida", null, JOptionPane.ERROR_MESSAGE);
				// throw new IllegalArgumentException("A posi��o digitada � invalida");
			}
		}
		Celula anterior = this.cabeca;
		for (int cont = 0; cont < posicao - 1; cont++) {
			anterior = anterior.getProxima();

		}
		Celula nova = new Celula(anterior.getProxima(), obj);
		anterior.setProxima(nova);
		this.totalElementos++;
	}

	public String toString() {
		if (this.totalElementos == 0) {
			return "[]";

		}
		StringBuilder listaencadeada = new StringBuilder("[");
		Celula atual = this.cabeca;

		for (int i = 0; i < this.totalElementos - 1; i++) {
			listaencadeada.append(atual.getObjeto());
			listaencadeada.append(",");
			atual = atual.getProxima();
		}

		listaencadeada.append(atual.getObjeto());
		listaencadeada.append("]");

		return listaencadeada.toString();
	}
	public void removerDoComeco() {

		Celula aux = this.cabeca;
		this.cabeca = this.cabeca.getProxima();
		aux.setProxima(null);
		
		this.totalElementos --;
		

	}

}
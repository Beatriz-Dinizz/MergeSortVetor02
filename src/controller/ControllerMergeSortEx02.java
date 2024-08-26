package controller;

import br.edu.fateczl.MergeSort.OrdenacaoMergeSort;

public class ControllerMergeSortEx02 {

	public ControllerMergeSortEx02() {
		super();
	}
	
	public void ordenarMergeSort02() {
		OrdenacaoMergeSort mergeSortEx02 = new OrdenacaoMergeSort();
		
		int[] vetor = {44, 43, 42, 41, 40, 39, 38};
		
		mergeSortEx02.ordenarMergeSort(vetor);
		
		int tamanho = vetor.length;
		for(int i = 0; i < tamanho; i ++) {
			System.out.println(vetor[i]);
		}
	}
}

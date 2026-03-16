package view;

import java.util.Arrays;

import br.com.oliveiraJe.sort.QuickSort;

public class Principal {

	public static void main(String[] args) {
		int[] vet1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		int[] vet2 = {44, 43, 42, 41, 40, 39, 38};
		int[] vet3 = {101, 102, 103, 125, 124, 123, 104, 105, 106, 122};
        
        QuickSort.sort(vet1); 
        QuickSort.sort(vet2); 
        QuickSort.sort(vet3); 
        
        System.out.println("---------- ORDENAÇÃO DE VETORES USANDO QUICK SORT ----------\n");
        System.out.println("Vetor 1: " + Arrays.toString(vet1));
        System.out.println("Vetor 2: " + Arrays.toString(vet2));
        System.out.println("Vetor 3: " + Arrays.toString(vet3));
	}

}
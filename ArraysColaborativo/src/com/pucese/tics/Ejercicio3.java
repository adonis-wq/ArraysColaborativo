package LadyV;

//Random permutation. Write a program Permutation.java so that it takes a 
//command-line argument N and prints a random permutation of the integers 0 through N-1.
public class Ejercicio3 {

		 public static void main(String[] args) { 
			 int n = 6;
		     int[] a = new int[n];

		        for (int i = 0; i < n; i++)
		            a[i] = i;

		        for (int i = 0; i < n; i++) {
		            int r = (int) (Math.random() * (i+1)); 
		            int swap = a[r];
		            a[r] = a[i];
		            a[i] = swap;
		        }

		        for (int i = 0; i < n; i++)
		            System.out.print(a[i] + " ");
		        System.out.println("");

		        for (int i = 0; i < n; i++) {
		            for (int j = 0; j < n; j++) {
		                if (a[j] == i) System.out.print("Q ");
		                else           System.out.print(". ");
		            }
		            System.out.println("");
		        }
		    }
	}

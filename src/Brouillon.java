import java.util.Random;

public class Brouillon {

	/*
	 * Inscrivez votre nom complet (pr�nom et nom de famille)
	 * ainsi que votre num�ro sciper ci-dessous :
	 */

	/* Etudiant 1 */
	public static String NAME1 = "Vincenzo Bazzucchi";
	public static int SCIPER1 = 249733;

	/* Etudiant 2 - laissez tel quel si vous avez cod� le projet tout seul */
	public static String NAME2 = "Gabriel Montauro";
	public static int SCIPER2 = 123789;

	static Random random = new Random();

	public static void main(String [] args){
		double[][] A = createMatrix(3,3,1,10);
		double[][] B = createMatrix(3,3,1,10);
		double[][] M = createMatrix(3,3,1,10);
		System.out.print(updateUElem(A,B,M,2,3));
		
	}

	public static String matrixToString(double[][] A) {
		/* M�thode � coder */
		String stringOfMatrix = "{" + "\n";

		for (int i = 0; i < A.length; i++) {
			stringOfMatrix += "   " + '{';

			for (int j = 0; j < A[i].length; j++) {
				if (j == A[i].length - 1) {
					stringOfMatrix = stringOfMatrix + A[i][j];
				} else {
					stringOfMatrix = stringOfMatrix + A[i][j] + ',';
				}
			}
			stringOfMatrix += "}" + ',' + "\n";
		}
		stringOfMatrix += "}" + ';';
		return stringOfMatrix;
	}

	public static boolean isMatrix(double[][] A) {
		if (A == null || A.length == 0) {
			return false; // checks if A has length 0 1)
		} else {
			for (int i = 0; i < A.length; i++) { //
				if (A[i] == null) { // checks if lines are empty 2)
					return false; //
				} else {
					for (int j = 0; j < A.length; j++) { //
						if (A[j].length != A[0].length) { // checks if all lines
															// have the same
															// length
							return false; //
						} else {

							for (i = 0; i < A.length; i++) {
								for (j = 0; j < A[i].length;j++) {
									// System.out.println(A[i][j]);
									if (A[i][j] == 1) {
										return false;
									} else {
										return true;
									}
								}
							}
						}
					}
				}
			}
		}
		return true;
	}

	public static double[][] multiplyMatrix(double[][] A, double[][] B) {
		// declare matrix issued by the product
		double[][] product = new double[A.length][B[0].length];
		// Check if the multiplication is possible: if A is n*m
		// and B is o*p, the multiplication is possible only if m=o
		if (A[0].length != B.length) {
			return null;
		} else {
			for (int i = 0; i < product.length; i++) {
				for (int j = 0; j < product[i].length; j++) {
					for (int x = 0; x < A[i].length; x++) {
						product[i][j] += A[i][x] * B[x][j];
					}
				}
			}
			return product;
		}
	}

	public static double[][] createMatrix(int n, int m, int k, int l) {
		double[][] mat = new double[n][m];
		if (m == 0 || n == 0 || k > l) {
			return null;
		} else {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					mat[i][j] = (random.nextDouble() *(l-k))+k; // (random.nextInt(l - k) + random.nextDouble();
				}
			}
		}
		return mat;
	}

	public static double rmse(double[][] M, double[][] P){
		int nonNuls=0;
		double s=0;
		for (int i=0; i<M.length; i++){
			for (int j=0; j<M[0].length; j++){
				if (M[i][j]!=0){
					nonNuls++;
					s+= (M[i][j]-P[i][j])*(M[i][j]-P[i][j]);
				}
			}
		}
		return Math.sqrt(s/nonNuls);
	}

	public static double updateUElem( double[][] M, double[][] U, double[][] V, int r, int s ) {
		// somme interieur parenthès
		double numerator = 0.0;
		double dentro =0.0;
		for (int j=0;j<M[0].length;j++){
			for (int k=0; k<V.length; k++){
				if (k!=0){
					dentro += U[r][k]*V[k][j];
					numerator += V[s][j]*(M[r][j]-dentro);
				}
			}
		}
		double denominateur = 0.0;
		for (int j=0; j<M[0].length; j++){
			denominateur += (V[s][j])*(V[s][j]);
		}
		return numerator/denominateur;
	}

	public static double updateVElem( double[][] M, double[][] U, double[][] V, int r, int s ) {
		/* M�thode � coder */
		return 0;
	}

	public static double[][] optimizeU( double[][] M, double[][] U, double[][] V) {
		/* M�thode � coder */
		return null;
	}

	public static double[][] optimizeV( double[][] M, double[][] U, double[][] V) {
		/* M�thode � coder */
		return null;
	}

	public static int[] recommend( double[][] M, int d) {
		/* M�thode � coder */
		return null;
	}
}

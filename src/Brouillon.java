import java.util.Random;

public class Brouillon {

	/*
	 * Inscrivez votre nom complet (prï¿½nom et nom de famille) ainsi que votre
	 * numï¿½ro sciper ci-dessous :
	 */

	/* Etudiant 1 */
	public static String NAME1 = "Vincenzo Bazzucchi";
	public static int SCIPER1 = 249733;

	/* Etudiant 2 - laissez tel quel si vous avez codï¿½ le projet tout seul */
	public static String NAME2 = "Gabriel Montauro";
	public static int SCIPER2 = 123789;

	static Random random = new Random();

	public static void main(String[] args) {
		/*
		 * double[][] A = createMatrix(3, 3, 1, 10); double[][] B =
		 * createMatrix(3, 3, 1, 10); double[][] M = createMatrix(3, 3, 1, 10);
		 * // System.out.print(updateUElem(A, B, M, 0, 2));
		 * System.out.println(matrixToString(A));
		 */
		double[][] A = {
				{ 8.720978934729413, 1.8649975862212114, 6.55828759388579 },
				{ 3.6864176599267173, 8.293680230517953, 9.871736058704295 },
				{ 7.649106116789142, 5.225491035924502, 7.064956791715652 }, };
		double[][] B = {
				{ 4.023662030359177, 2.020214420640082, 8.181574445864584 },
				{ 1.2106181813405508, 6.813029962496369, 7.848668872866865 },
				{ 7.478873480449156, 1.8423891001675936, 5.912889408057335 }, };
		double[][] C = {
				{ 7.582872119819165, 8.61618429201534, 9.099990757435942 },
				{ 5.827687924464552, 8.173808424325024, 9.813510353524222 },
				{ 5.514119574095468, 4.186987822600329, 2.222548142372542 }, };
		System.out.println(updateUElem(A, B, C, 0, 2));

	}

	public static String matrixToString(double[][] A) {
		/* Mï¿½thode ï¿½ coder */
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
								for (j = 0; j < A[i].length; j++) {
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
					mat[i][j] = (random.nextDouble() * (l - k)) + k; // (random.nextInt(l
																		// - k)
																		// +
																		// random.nextDouble();
				}
			}
		}
		return mat;
	}

	public static double rmse(double[][] M, double[][] P) {
		int nonNuls = 0;
		double s = 0;
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				if (M[i][j] != 0) {
					nonNuls++;
					s += (M[i][j] - P[i][j]) * (M[i][j] - P[i][j]);
				}
			}
		}
		return Math.sqrt(s / nonNuls);
	}

	public static double updateUElem(double[][] M, double[][] U, double[][] V,
			int r, int s) {
		// somme interieur parenthès
		int dim = V[0].length;
		double numerateur = 0.0;
		double denominateur = 0.0;
		for (int j = 0; j < dim; j++) {
			if (M[r][j] != 0) {
				numerateur += V[s][j]
						* (M[r][j] - SommeElementsInt(U, V, r, j, s));
				denominateur += Math.pow(V[s][j], 2);
			}
		}
		return numerateur / denominateur;
	}

	public static double SommeElementsInt(double[][] U, double[][] V, int r,
			int j, int valInterdite) {
		int dim = V.length;
		double somme = 0.0;
		for (int k = 0; k < dim; k++) {
			if (k != valInterdite) {
				somme += U[r][k] * V[k][j];
			}
		}
		return somme;

	}

	public static double updateVElem(double[][] M, double[][] U, double[][] V,
			int r, int s) {
		int dim = U.length;
		double numerateur = 0.0;
		double denominateur = 0.0;
		for (int i = 0; i < dim; i++) {
			if (M[i][s] != 0) {
				numerateur += U[i][r]
						* (M[i][s] - SommeElementsInt(U, V, i, s, r));
				denominateur += Math.pow(U[i][r], 2);
			}
		}
		return numerateur / denominateur;
	}

	public static double[][] optimizeU(double[][] M, double[][] U, double[][] V) {
		// let's first copy our matrix
		return null;
	}

	/*public static double[][] copyMatrix(double[][] MAT) {
		int l = MAT.length;
		int c = MAT[0].length;
		double[][] copy = new double[l][c];
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				copy[i][j] = MAT[i][j];
			}
		}
		return copy;
	}*/

	public static double[][] optimizeV(double[][] M, double[][] U, double[][] V) {
		/* Mï¿½thode ï¿½ coder */
		return null;
	}

	public static int[] recommend(double[][] M, int d) {
		/* Mï¿½thode ï¿½ coder */
		return null;
	}
}

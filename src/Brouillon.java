import java.util.Random;

public class Brouillon {

	/*
	 * Inscrivez votre nom complet (pr�nom et nom de famille) ainsi que votre
	 * num�ro sciper ci-dessous :
	 */

	/* Etudiant 1 */
	public static String NAME1 = "Vincenzo Bazzucchi";
	public static int SCIPER1 = 249733;

	/* Etudiant 2 - laissez tel quel si vous avez cod� le projet tout seul */
	public static String NAME2 = "Gabriel Montauro";
	public static int SCIPER2 = 247410;

	static Random random = new Random();

	public static void main(String[] args) {
	
		double[][] U = {
				   {8.08913800106962,5.05627494744083,9.598397316101263,1.6822793129006564,7.764047676487541},
				   {4.245086600455049,5.142733874403485,0.4405678243720602,9.35243284779836,4.21819246858373},
				   {3.018191867513211,3.1401368814769226,4.316456384200197,4.578519051642979,1.1743136333569029},
				};
		double[][] V = {
			   {5.375746296015116,1.4309469514339548,0.5595298669872125,9.203863800821644,9.354921557931279,0.8737552795622023,4.075174367738776,0.9380864362509004},
			   {5.144248961808988,5.445168242337555,7.289100330868699,9.344032328893181,3.378025268119843,8.297006044981499,2.5794969241602104,4.04737142593797},
			   {9.585217690741807,3.9929501748593528,3.7741852472134627,6.131714808662718,1.2482590060361831,8.52994134424959,3.210400688900191,6.496486542561843},
			   {6.2687155859214165,3.509939434255901,8.000941321755501,3.303283691014893,6.419577628821836,3.767612893424183,0.6881794326887898,5.2657955053655865},
			   {5.835467959891577,7.9101635656306355,2.6744225045779735,9.397943982854352,8.588452477270106,1.8099084780314207,6.7252111333513,9.533063572247581},
			};
		//double[][] P = multiplyMatrix(U,V);
		// System.out.println("U"+matrixToString(U));
		//System.out.println("V"+matrixToString(V));
		//System.out.println("P"+matrixToString(P));
		double[][] M = {
				   {217.35120055712812,0,111.83210115139235,0,182.21543904294015,151.2840298878336,130.19456476660213,0},
				   {136.7418190254157,102.02977550907978,127.63343580704291,0,153.90109412457005,93.00736746616745,0,117.11925105433482},
				   {109.30695706186455,0,80.64172036262428,109.74812799983994,83.70816076465455,84.88550315153297,0,78.88677751597301},
				};
		
		int[] fine = recommend(M, 2);
		for (int i=0; i<fine.length; i++){
			System.out.println("l'élément recommandé est à la position : ("+ i +";" +fine[i]+")") ;
		}
		
	}

	public static String matrixToString(double[][] A) {
		/* M�thode � coder */
		String stringOfMatrix = "{" + "\n";

		for (int i = 0; i < A.length; i++) {
			stringOfMatrix += "  " + '{';

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
			return false;
		}
		for (int i = 0; i < A.length; ++i) {
			if (A[i] == null) {
				return false;
			}
			if (A[i].length != A[0].length) {
				return false;
			}
		}
		return true;
	}

	public static double[][] multiplyMatrix(double[][] A, double[][] B) {
		// declare matrix issued by the product
		double[][] product = new double[A.length][B[0].length];
		// Check if the multiplication is possible: if A is n*m
		// and B is o*p, the multiplication is possible only if m=o
        if (A[0].length != B.length  || !isMatrix(A) || !isMatrix(B)) {
			return null;
		} else {
			for (int i = 0; i < product.length; i++) {
				for (int j = 0; j < product[0].length; j++) {
					for (int x = 0; x < A[0].length; x++) {
						product[i][j] += A[i][x] * B[x][j];
					}
				}
			}
			return product;
		}
	}

	public static double nbAleatoire(int borneInf, int borneSup) {
		double value = 0.0;
		int entier = random.nextInt(borneSup - borneInf + 1);
        value += entier + borneInf;
		if (entier != borneSup) {
			value += random.nextDouble();
		}
		return (value);
	}

	public static double[][] createMatrix(int n, int m, int k, int l) {
		double[][] mat = new double[n][m];
		if (m == 0 || n == 0 || k > l) {
			return null;
		} else {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {

					mat[i][j] = nbAleatoire(k, l);
				}
			}
		}
		return mat;
	}

	public static double rmse(double[][] M, double[][] P) {
		int lM = M.length;
		int cM = M[0].length;
		if (lM == P.length && cM == P[0].length) {
			int nonNuls = 0;
			double s = 0;
			for (int i = 0; i < lM; i++) {
				for (int j = 0; j < cM; j++) {
					if (M[i][j] != 0) {
						nonNuls++;
						s += (M[i][j] - P[i][j]) * (M[i][j] - P[i][j]);
					}
				}
			}
            if(nonNuls != 0)
            {
                return Math.sqrt(s / nonNuls);
            }
        }
        return (-1);
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

	public static boolean testMatrix(double[][] M, double[][] U, double[][] V) {
        return isMatrix(M) && isMatrix(U) && isMatrix(V);
	}

	public static double updateUElem(double[][] M, double[][] U, double[][] V,
			int r, int s) {
		if (testMatrix(M, U, V)) {
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
			if (denominateur != 0) {
				return numerateur / denominateur;
			} else {
				return 0;
			}
		} else {
			return 0;
		}
	}

	public static double updateVElem(double[][] M, double[][] U, double[][] V,
			int r, int s) {
		if (testMatrix(M, U, V)) { // ce test me semble de trop car il revient dans la procédure de update element à chaque fois.
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
		if (denominateur != 0) {
			return numerateur / denominateur;
		} else {
			return 0;
		}} else {return 0;}
	}

	public static double[][] copyMatrix(double[][] MAT) {
		int l = MAT.length;
		int c = MAT[0].length;
		double[][] copy = new double[l][c];
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				copy[i][j] = MAT[i][j];
			}
		}
		return copy;
	}

	public static boolean rmseComparison(double[][] M, double[][] P) {
		double rmseOld = 0;
		return false;
	}

	public static double[][] optimizeU(double[][] M, double[][] U, double[][] V) {
		int l = U.length;
		int c = U[0].length;
		double[][] U1 = copyMatrix(U);
		double rmseOld;
		double rmseNew;
		do {
			rmseOld = rmse(M, multiplyMatrix(U1, V));
			for (int li = 0; li < l; li++) {
				for (int co = 0; co < c; co++) {
					U1[li][co] = updateUElem(M, U1, V, li, co);
				}
			}
			rmseNew = rmse(M, multiplyMatrix(U1, V));
        }while (Math.abs(rmseNew - rmseOld) > Math.pow(10, (-6)));
		return U1;
	}

	public static double[][] optimizeV(double[][] M, double[][] U, double[][] V) {
		int l = V.length;
		int c = V[0].length;
		double[][] V1 = copyMatrix(V);
		double rmseOld;
		double rmseNew;
		do  {
			rmseOld = rmse(M, multiplyMatrix(U, V1));
			for (int li = 0; li < l; li++) {
				for (int co = 0; co < c; co++) {
					V1[li][co] = updateVElem(M, U, V1, li, co);
				}
			}
			rmseNew = rmse(M, multiplyMatrix(U, V1));
        }while(Math.abs(rmseNew - rmseOld) > Math.pow(10, (-6)));
		return V1;
	}

	public static int[] recommend(double[][] M, int d) {
        /* Pre-traitement de la matrice M
        : afin de prendre en compte (i) la diff´erence entre les habitudes
        de notation des utilisateurs (par exemple certains seront habituellement plus généreux et attribueront
        de meilleures notes que d’autres) ainsi que (ii) la diff´erence de qualit´e entre les articles (par exemple,
        certains films auront une note moyenne bien meilleure que les autres), l’algorithme UV-decomposition
        incorpore habituellement une ´etape de pre-traitement des donn´ees d’entr´ee. Dans un souci de sim-
        plification, nous ne mettrons pas en oeuvre cette ´etape dans le mini-projet
         */
        /*
        Initialisation de U et V : un point de d´epart simple consiste `a donner la mˆeme valeur (par exemple
        v = 1) `a tous les ´el´ements.
        Un choix judicieux pour cette valeur v sera tel que les ´el´ements de la matrice produit U ·V atteignent
        la moyenne des ´el´ements non nuls de M. Cette valeur v peut ˆetre obtenue en calculant d’abord la
        moyenne de tous les ´el´ements non nuls de M puis en divisant cette moyenne par d (nombre d’articles)
        et en prenant la racine carr´ee de cette valeur :

        v = racine carrée de (( (somme des ij de la matrice M[i][j]) divisé par n) divisé par d )

        ou la somme de la matrice M[i][j]
        d´esigne la somme sur tous les i, j = (1, 1), . . . telle que mij est non-nulle
        et n le nombre de ces entr´ees non-nulles. Comme mentionn´e pr´ec´edemment, pour augmenter nos
        chances de converger vers un minimum global, il est bon de calculer la d´ecomposition en partant de
        diff´erents points de d´epart.
        Il est possible d’obtenir diff´erents points pour U et V en perturbant la valeur v al´eatoirement et de
        fa¸con ind´ependante pour chacun des ´el´ements. Dans le cadre de ce mini-projet, vous choisirez quelques
        points de d´epart diff´erents et retournerez les r´esultats relatifs au point ayant permis d’atteindre le
        plus faible RMSE.
         */
        double sommeM = 0.0;
        int    nbM = 0;
        int    nbPointsDeparts = 500;

        // calcul de la valeur initiale des matrices U et V en prenant la racine de la moyenne des Mij
        for(int i =0;i<M.length; ++i) {
            for (int j = 0; j < M[0].length; ++j) {
                if (M[i][j] != 0) {
                    sommeM += M[i][j];
                    ++nbM;
                }
            }
        }
        double v = Math.sqrt(( sommeM/nbM )/d);

        // déclaration des matrices
        double[][] uMatrix;
        double[][] vMatrix;
        double[][] P;

        double[][] minUMatrix;
        double[][] minVMatrix;
        double[][] minP = createMatrix( M.length,  M[0].length, Integer.MAX_VALUE, Integer.MAX_VALUE);


        /*
        Ajustement de U et V et d´ecision de quand arrˆeter
         */

        for(int c = 0; c < nbPointsDeparts; ++c)
        {
            double tmpRmse;
            double Rmse = 0;
            uMatrix = createMatrix(M.length, d, 0, 3*(int)v);
            vMatrix = createMatrix(d,M[0].length, 0 ,3*(int)v);
            // peut être mettre ceci dans une boucle pour optimiser P
           // do{
           //     tmpRmse = Rmse;
                P = multiplyMatrix(optimizeU(M, uMatrix, vMatrix) ,optimizeV(M, uMatrix, vMatrix));
           //     Rmse = rmse(M,P);
           // }while((tmpRmse - Rmse  > Math.pow(10,(-9))));
            if(c == 0 ||  rmse(M,minP) > rmse(M,P))
            {
                minUMatrix = copyMatrix(uMatrix);
                minVMatrix = copyMatrix(vMatrix);
                minP = multiplyMatrix(minUMatrix,minVMatrix);
            }
        }

        /*
        Elle retournera un tableau d’entiers indiquant
        `a la position i, la meilleure recommandation de l’utilisateur i. Un article ne sera recommand´e que si (i) il
        n’´etait pas not´e par i (l’entr´ee correspondante dans M valait z´ero au d´epart) et (ii) qu’il est recommand´e par
        l’algorithme UV-decomposition utilisant la dimension d pour M (cet article a le plus haut score parmi ceux
        qui n’´etait pas not´es au d´epart). S’il n’y a pas de tel article la valeur retourn´ee sera −1 pour l’utilisateur i.
         */

        int[] recomendation = new int[M.length];
        for(int i = 0; i< M.length; ++i)
        {
            double noteMax = -1;
            for(int j = 0; j<M[0].length; ++j)
            {
                if(M[i][j] == 0 && minP[i][j] > noteMax)
                {
                    noteMax = minP[i][j];
                    recomendation[i] = j;
                }
            }
            if(noteMax == -1)
            {
                recomendation[i] = -1;
            }
        }
        return recomendation;
	}
}

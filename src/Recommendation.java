package assignment;

import java.util.Random;

public class Recommendation {

	/*
	 * Inscrivez votre nom complet (prénom et nom de famille) ainsi que votre
	 * numéro sciper ci-dessous :
	 */

    /* Etudiant 1 */
    public static String NAME1 = "Vincenzo Bazzucchi";
    public static int SCIPER1 = 249733;

    /* Etudiant 2 - laissez tel quel si vous avez codé le projet tout seul */
    public static String NAME2 = "Gabriel Montauro";
    public static int SCIPER2 = 247410;

    static Random random = new Random();

    public static String matrixToString(double[][] A) {
        String stringOfMatrix = "{" + "\n";

        for (int i = 0; i < A.length; ++i) {
            stringOfMatrix += "  " + '{';

            for (int j = 0; j < A[i].length; ++j) {
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
        // Check if the multiplication is possible: if A is n*m and B is o*p,
        // the multiplication is possible only if m = o
        if (A[0].length != B.length  || !isMatrix(A) || !isMatrix(B)) {
            return null;
        } else {
            for (int i = 0; i < product.length; ++i) {
                for (int j = 0; j < product[0].length; ++j) {
                    for (int x = 0; x < A[0].length; ++x) {
                        product[i][j] += A[i][x] * B[x][j];
                    }
                }
            }
            return product;
        }
    }

    public static double nbAleatoire(double borneInf, double borneSup) {
        double r = random.nextDouble();
        if (r < 0.5) {
            return ((1 - random.nextDouble()) * (borneSup - borneInf) + borneInf);
        }
        return (random.nextDouble() * (borneSup - borneInf) + borneInf);
    }

    public static double[][] createMatrix(int n, int m, int k, int l) {
        double[][] mat = new double[n][m];
        if (m == 0 || n == 0 || k > l) {
            return null;
        } else {
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {

                    mat[i][j] = nbAleatoire(k, l);
                }
            }
        }
        return mat;
    }

    public static double[][] createMatrix(int n, int m, double k, double l) {
        double[][] mat = new double[n][m];
        if (m == 0 || n == 0 || k > l) {
            return null;
        } else {
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {

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
            for (int i = 0; i < lM; ++i) {
                for (int j = 0; j < cM; ++j) {
                    if (M[i][j] != 0) {
                        nonNuls++;
                        s += Math.pow(P[i][j] - M[i][j],2);
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

    public static double SommeElementsInt(double[][] U, double[][] V, int r, int j, int valInterdite) {
        int dim = V.length;
        double somme = 0.0;
        for (int k = 0; k < dim; ++k) {
            if (k != valInterdite) {
                somme += U[r][k] * V[k][j];
            }
        }
        return somme;
    }

    public static double updateUElem(double[][] M, double[][] U, double[][] V, int r, int s) {
        double numerateur = 0.0;
        double denominateur = 0.0;
        for (int j = 0; j < M[0].length; ++j) {
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
    }

    public static double updateVElem(double[][] M, double[][] U, double[][] V, int r, int s) {
        double numerateur = 0.0;
        double denominateur = 0.0;
        for (int i = 0; i < M.length; ++i) {
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
        }
    }

    public static double[][] copyMatrix(double[][] MAT) {
        int l = MAT.length;
        int c = MAT[0].length;
        double[][] copy = new double[l][c];
        for (int i = 0; i < l; ++i) {
            for (int j = 0; j < c; ++j) {
                copy[i][j] = MAT[i][j];
            }
        }
        return copy;
    }

    public static double[][] optimizeU(double[][] M, double[][] U, double[][] V) {
        int l = U.length;
        int c = U[0].length;
        for (int li = 0; li < l; ++li) {
            for (int co = 0; co < c; co++) {
                U[li][co] = updateUElem(M, U, V, li, co);
            }
        }
        return U;
    }

    public static double[][] optimizeV(double[][] M, double[][] U, double[][] V) {
        int l = V.length;
        int c = V[0].length;
        for (int li = 0; li < l; ++li) {
            for (int co = 0; co < c; co++) {
                V[li][co] = updateVElem(M, U, V, li, co);
            }
        }
        return V;
    }

// cette méthode contient des commentaires permettant une meilleure visualisation lors de l'exécution du programme
    public static int[] recommend(double[][] M, int d) {
//System.out.println("Entree dans recommend");
        if(isMatrix(M)) {
            double sommeM = 0.0;
            int nbM = 0;
            int nbEl = M[0].length * M.length;
            int Fx = (int) ((24000 * nbEl / (Math.pow(nbEl, 2)) + 1));
            int nbPointsDeparts;
            if (Fx > 500) {
                nbPointsDeparts = 500;
            } else {
                nbPointsDeparts = Fx;
            }

            // calcul de la valeur initiale des matrices U et V en prenant la racine de la moyenne des Mij
            for (int i = 0; i < M.length; ++i) {
                for (int j = 0; j < M[0].length; ++j) {
                    if (M[i][j] != 0) {
                        sommeM += M[i][j];
                        ++nbM;
                    }
                }
            }
            double v = Math.sqrt((sommeM / nbM) / d);

            // déclaration des matrices
            double[][] uMatrix;
            double[][] vMatrix;
            double[][] P;

            double[][] minUMatrix;
            double[][] minVMatrix;
            double[][] minP = createMatrix(M.length, M[0].length, Integer.MAX_VALUE, Integer.MAX_VALUE);

            //Ajustement de U et V et d´ecision de quand arrêter
            for (int c = 0; c < nbPointsDeparts; ++c) {
                int i = 0;
                double tmpRmse;
                double Rmse = 0;
                uMatrix = createMatrix(M.length, d, v, v);
                vMatrix = createMatrix(d, M[0].length, v, v);

                // déclaration du nombre aléatoire altérant le prochain v.
                double nbRand = nbAleatoire(-v, v);

                //boucle d'optimisation de U et V
                do {
                    tmpRmse = Rmse;
                    uMatrix = optimizeU(M, uMatrix, vMatrix);
                    vMatrix = optimizeV(M, uMatrix, vMatrix);
                    P = multiplyMatrix(uMatrix, vMatrix);
                    Rmse = rmse(M, P);
                    ++i;
                } while (Math.abs((tmpRmse - Rmse)) > Math.pow(10, (-6)));
//System.out.println("matrice no " + (c + 1) + "/" + nbPointsDeparts + " nombre d'itération : " + i +" rmse : "+ Rmse);

                //Copie de la décomposition U,V ayant un rmse minimal.
                if (c == 0 || rmse(M, minP) > Rmse) {
                    minUMatrix = copyMatrix(uMatrix);
                    minVMatrix = copyMatrix(vMatrix);
                    minP = multiplyMatrix(minUMatrix, minVMatrix);
                }
                v = Math.sqrt((sommeM / nbM) / d) + nbRand;
            }

            //écriture du tableau des recommendations
            int[] recomendation = new int[M.length];
            for (int i = 0; i < M.length; ++i) {
                double noteMax = -1;
                for (int j = 0; j < M[0].length; ++j) {
                    if (M[i][j] == 0 && minP[i][j] > noteMax) {
                        noteMax = minP[i][j];
                        recomendation[i] = j;
                    }
                }
                if (noteMax == -1) {
                    recomendation[i] = -1;
                }
            }
//System.out.println("la matrice sélectionnée à un rmse de " + rmse(M, minP));
            return recomendation;
        }
        return null;
    }
}

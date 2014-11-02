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
/*
        double test = -1;
        while(test != 1.0) {
            test = nbAleatoire(0, 1);
        }
        System.out.println("le test à fonctionné");
*/
//        System.out.println(matrixToString(matriceDeTest(150,50,5)));

        double[][] M = Netflix.readData("C:/Users/Funky/IdeaProjects/RecommendationSystem/src/utility_user100_movies200.m");

        // la variation de d apporte de gros changements sur le rmse. d étant la dimensions des matrices u et v, si il est petit par rapport à la taille de M il fait croitre le temps de calculs
        // je propose qu'on fixe donc d = sqrt(M.length * M[0].length);
        // Remarque: avec un d petit on obtient souvent un rmse plus petit. et avec un d plus grand, rmse constant.

        //pour une matrice (150,50,5) d = sqrt(M.length * M[0].length)  t < 2 min  pour 5 points de départs
        //pour une matrice (150,50,5) d = 20)                           t < 2 min  pour 1 points de départs
        int d = (int)Math.sqrt(M[0].length * M.length);

        int[] fine = recommend(M, 20);

        for (int i=0; i<fine.length; i++){
            System.out.println("l'élément recommandé est à la position : ("+ i +";" +fine[i]+")") ;
        }

    }

    //cette methode permet de creer des matrices de tests.
    private static double [][] matriceDeTest(int lignes,int colonnes, int bornesup) {
        double[][] matrice = new double[lignes][colonnes];
        for(int i =0; i<lignes;++i)
        {
            for(int j = 0; j<colonnes; ++j)
            {
                if(random.nextInt(2) == 0) {
                    matrice[i][j] = random.nextInt(bornesup + 1);
                }else{matrice[i][j] = 0;}
            }
        }
        return( matrice );
    }

    // cette méthode n'est jamais utilisée. mais elle est utile pour écrire des matrices test
    public static String matrixToString(double[][] A) {
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

    //on pourrait tenter d'implémenter la méthode de multiplication par blocs vue en Algèbre linéaire
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

    // j'ai ajouté une autre fonction nombre aléatoire. pour qu'elle prenne des double.
// elle ne respecte pas les conditions demandées!!
    public static double nbAleatoire(double borneInf, double borneSup) {

        return ( borneInf + random.nextDouble()*(borneSup - borneInf));
    }

    // fonctions trouvée sur le net qui inclu visiblement les bornes
    public double nbAleatoireInclude(double max, double min) {
        double r = Math.random();
        if (r < 0.5) {
            return ((1 - Math.random()) * (max - min) + min);
        }
        return (Math.random() * (max - min) + min);
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

    // j/ai eu besoin de céer une nouvelle méthode pour les matrices.
    public static double[][] createMatrix(int n, int m, double k, double l) {
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

    //cette méthode est extrèmement importante dans notre programme et elle n'est pas commentée.
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
        for (int k = 0; k < dim; k++) {
            if (k != valInterdite) {
                somme += U[r][k] * V[k][j];
            }
        }
        return somme;
    }

    // le test ismatrix me semble de trop car il revient dans la procédure de update element à chaque fois.
    public static double updateUElem(double[][] M, double[][] U, double[][] V, int r, int s) {

            double numerateur = 0.0;
            double denominateur = 0.0;
            for (int j = 0; j < M[0].length; j++) {
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
            for (int i = 0; i < M.length; i++) {
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
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                copy[i][j] = MAT[i][j];
            }
        }
        return copy;
    }

//le code comparison n'était jamais utilisé.
    /*
        public static boolean rmseComparison(double[][] M, double[][] P) {
            double rmseOld = 0;
            return false;
        }
    */

    //j'ai pensé qu'il était préférable d'optimiser les matrices l'une après l'autre
// j'ai donc mis en commentaire le code qui permettait d'itérer l'optimisation
// et l'ai ajouté dans le recommend.
    public static double[][] optimizeU(double[][] M, double[][] U, double[][] V) {
        int l = U.length;
        int c = U[0].length;
        for (int li = 0; li < l; li++) {
            for (int co = 0; co < c; co++) {
                U[li][co] = updateUElem(M, U, V, li, co);
            }
        }
        return U;
    }

    public static double[][] optimizeV(double[][] M, double[][] U, double[][] V) {
        int l = V.length;
        int c = V[0].length;
        for (int li = 0; li < l; li++) {
            for (int co = 0; co < c; co++) {
                V[li][co] = updateVElem(M, U, V, li, co);
            }
        }
        return V;
    }

    //j'ai modifié le recommend pour qu'il affiche un compteur durant les calculs
// et réglé le bug qui rendait l'itération du optimizeU,V impossible.
// donc le rmse est proche de 0 maintenant.
// il nous reste à définir le nombre de matrices à tester. j'ai mis 20 aléatoirement.
// 50 me semble être une bonne solution mais elle est très chère en temps.
    public static int[] recommend(double[][] M, int d) {
    	System.out.println("Entree dans recommend");
        if(isMatrix(M)) {
            double sommeM = 0.0;
            int nbM = 0;
            int nbEl = M[0].length * M.length;
            int Fx = (int) ((66600 * Math.pow(nbEl, 2)) / (3 * Math.pow(nbEl, 3)) + 1);
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


        /*
        Ajustement de U et V et d´ecision de quand arrˆeter
         */

            for (int c = 0; c < nbPointsDeparts; ++c) {
                int i = 0;
                double tmpRmse;
                double Rmse = 0;
                uMatrix = createMatrix(M.length, d, v, v);
                vMatrix = createMatrix(d, M[0].length, v, v);
                // déclration du nombre aléatoire altérant le prochain v.
                double nbRand = nbAleatoire(-v, v);

                do {
                    tmpRmse = Rmse;
                    uMatrix = optimizeU(M, uMatrix, vMatrix);
                    vMatrix = optimizeV(M, uMatrix, vMatrix);
                    P = multiplyMatrix(uMatrix, vMatrix);
                    Rmse = rmse(M, P);
                    ++i;
                } while (Math.abs((tmpRmse - Rmse)) > Math.pow(10, (-6)));
                System.out.println("matrice no " + (c + 1) + "/" + Fx + " nombre d'itération : " + i);
                if (c == 0 || rmse(M, minP) > rmse(M, P)) {
                    minUMatrix = copyMatrix(uMatrix);
                    minVMatrix = copyMatrix(vMatrix);
                    minP = multiplyMatrix(minUMatrix, minVMatrix);
                }
                v = Math.sqrt((sommeM / nbM) / d) + nbRand;
            }

        /*
        Elle retournera un tableau d’entiers indiquant
        `a la position i, la meilleure recommandation de l’utilisateur i. Un article ne sera recommand´e que si (i) il
        n’´etait pas not´e par i (l’entr´ee correspondante dans M valait z´ero au d´epart) et (ii) qu’il est recommand´e par
        l’algorithme UV-decomposition utilisant la dimension d pour M (cet article a le plus haut score parmi ceux
        qui n’´etait pas not´es au d´epart). S’il n’y a pas de tel article la valeur retourn´ee sera −1 pour l’utilisateur i.
         */

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
            System.out.println("la matrice sélectionnée à un rmse de " + rmse(M, minP));
            return recomendation;
        }
        return null;
    }
}

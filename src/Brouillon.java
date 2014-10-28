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

//        System.out.println(matrixToString(matriceDeTest(100,50,100)));

        double[][] M = {
                {0.0,0.0,7.0,27.0,22.0,0.0,0.0,72.0,0.0,41.0,31.0,0.0,0.0,7.0,83.0,0.0,0.0,0.0,0.0,55.0,13.0,0.0,92.0,24.0,0.0,0.0,0.0,0.0,0.0,54.0,0.0,14.0,0.0,0.0,41.0,0.0,39.0,72.0,62.0,0.0,16.0,0.0,0.0,76.0,93.0,19.0,0.0,0.0,0.0,0.0},
                {0.0,0.0,10.0,0.0,0.0,0.0,0.0,42.0,49.0,62.0,38.0,0.0,0.0,0.0,0.0,0.0,0.0,13.0,0.0,0.0,0.0,0.0,58.0,100.0,0.0,0.0,89.0,24.0,0.0,0.0,0.0,13.0,39.0,0.0,0.0,0.0,0.0,0.0,74.0,40.0,19.0,0.0,0.0,19.0,62.0,0.0,16.0,0.0,73.0,0.0},
                {0.0,0.0,58.0,0.0,0.0,2.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,43.0,34.0,33.0,0.0,0.0,0.0,0.0,44.0,99.0,84.0,0.0,0.0,0.0,0.0,38.0,50.0,93.0,41.0,0.0,0.0,55.0,0.0,0.0,65.0,71.0,96.0,93.0,0.0,45.0,68.0,5.0,0.0,1.0,0.0,0.0,13.0,11.0},
                {0.0,0.0,1.0,0.0,0.0,0.0,0.0,66.0,0.0,0.0,0.0,0.0,41.0,0.0,25.0,50.0,0.0,79.0,0.0,75.0,86.0,31.0,0.0,0.0,60.0,100.0,0.0,28.0,0.0,5.0,0.0,97.0,28.0,0.0,15.0,0.0,0.0,0.0,91.0,46.0,0.0,28.0,0.0,0.0,0.0,0.0,49.0,56.0,78.0,13.0},
                {0.0,0.0,0.0,0.0,0.0,34.0,53.0,46.0,0.0,0.0,0.0,0.0,72.0,64.0,0.0,38.0,0.0,57.0,23.0,0.0,87.0,74.0,0.0,98.0,0.0,0.0,29.0,59.0,55.0,0.0,0.0,0.0,50.0,78.0,0.0,82.0,0.0,0.0,0.0,10.0,68.0,0.0,99.0,0.0,77.0,0.0,0.0,0.0,11.0,88.0},
                {60.0,0.0,0.0,36.0,89.0,0.0,9.0,9.0,0.0,0.0,37.0,86.0,0.0,59.0,0.0,0.0,36.0,0.0,87.0,8.0,0.0,0.0,81.0,0.0,0.0,62.0,0.0,0.0,79.0,0.0,85.0,0.0,35.0,7.0,51.0,0.0,31.0,69.0,31.0,6.0,0.0,12.0,0.0,0.0,0.0,16.0,0.0,57.0,71.0,0.0},
                {59.0,43.0,99.0,0.0,0.0,21.0,29.0,0.0,41.0,0.0,70.0,0.0,0.0,0.0,0.0,6.0,62.0,0.0,57.0,100.0,3.0,35.0,81.0,39.0,40.0,55.0,5.0,98.0,96.0,0.0,0.0,0.0,0.0,0.0,44.0,64.0,0.0,52.0,12.0,0.0,0.0,100.0,68.0,70.0,26.0,50.0,0.0,0.0,93.0,65.0},
                {0.0,0.0,0.0,51.0,96.0,0.0,6.0,56.0,0.0,0.0,41.0,52.0,65.0,25.0,24.0,61.0,69.0,53.0,71.0,0.0,0.0,0.0,3.0,0.0,0.0,55.0,99.0,0.0,0.0,0.0,12.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,83.0,36.0,0.0,0.0,64.0,52.0,0.0,0.0,51.0,0.0,92.0,0.0},
                {0.0,84.0,0.0,0.0,0.0,0.0,8.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,24.0,0.0,0.0,8.0,0.0,0.0,30.0,67.0,61.0,7.0,26.0,61.0,54.0,0.0,0.0,82.0,0.0,87.0,1.0,0.0,0.0,42.0,0.0,82.0,0.0,0.0,79.0,100.0,77.0,0.0,88.0,0.0,86.0,26.0,0.0},
                {83.0,32.0,51.0,0.0,9.0,2.0,96.0,0.0,79.0,0.0,0.0,4.0,0.0,0.0,0.0,0.0,0.0,93.0,48.0,83.0,70.0,95.0,0.0,0.0,0.0,15.0,7.0,79.0,0.0,42.0,0.0,0.0,0.0,5.0,0.0,88.0,0.0,0.0,96.0,77.0,20.0,25.0,0.0,0.0,52.0,31.0,0.0,78.0,0.0,0.0},
                {90.0,0.0,100.0,89.0,0.0,0.0,0.0,0.0,59.0,0.0,0.0,98.0,0.0,0.0,32.0,0.0,48.0,6.0,0.0,79.0,72.0,0.0,30.0,61.0,0.0,63.0,37.0,0.0,0.0,29.0,0.0,84.0,51.0,0.0,76.0,0.0,79.0,75.0,82.0,8.0,0.0,0.0,0.0,0.0,0.0,38.0,0.0,82.0,0.0,0.0},
                {0.0,12.0,0.0,0.0,0.0,19.0,0.0,0.0,0.0,63.0,44.0,8.0,74.0,39.0,0.0,0.0,0.0,3.0,0.0,0.0,0.0,0.0,18.0,67.0,0.0,0.0,0.0,0.0,63.0,0.0,37.0,13.0,0.0,0.0,0.0,27.0,26.0,0.0,74.0,0.0,0.0,0.0,32.0,0.0,26.0,26.0,0.0,77.0,0.0,0.0},
                {0.0,0.0,2.0,0.0,91.0,0.0,90.0,0.0,87.0,0.0,0.0,30.0,79.0,69.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,77.0,94.0,88.0,66.0,24.0,0.0,0.0,0.0,0.0,0.0,36.0,0.0,28.0,0.0,0.0,0.0,61.0,29.0,0.0,0.0,53.0,82.0,0.0,61.0,80.0,34.0},
                {0.0,0.0,61.0,0.0,90.0,0.0,70.0,0.0,0.0,37.0,52.0,30.0,0.0,0.0,0.0,34.0,89.0,0.0,0.0,0.0,0.0,29.0,0.0,0.0,0.0,0.0,0.0,0.0,11.0,0.0,0.0,0.0,0.0,0.0,0.0,77.0,22.0,0.0,21.0,0.0,6.0,100.0,30.0,0.0,22.0,2.0,0.0,92.0,0.0,0.0},
                {69.0,40.0,0.0,0.0,73.0,0.0,62.0,0.0,27.0,0.0,10.0,98.0,0.0,8.0,80.0,99.0,74.0,70.0,0.0,0.0,1.0,26.0,64.0,2.0,11.0,35.0,30.0,0.0,0.0,55.0,30.0,0.0,36.0,0.0,38.0,69.0,36.0,0.0,0.0,0.0,0.0,0.0,0.0,53.0,31.0,0.0,0.0,42.0,72.0,94.0},
                {11.0,5.0,65.0,0.0,0.0,53.0,0.0,0.0,72.0,0.0,0.0,0.0,68.0,93.0,62.0,0.0,0.0,4.0,0.0,35.0,0.0,59.0,5.0,58.0,63.0,25.0,0.0,56.0,17.0,0.0,0.0,59.0,0.0,0.0,0.0,44.0,0.0,0.0,0.0,36.0,0.0,0.0,36.0,0.0,68.0,0.0,67.0,0.0,0.0,0.0},
                {0.0,9.0,0.0,0.0,28.0,7.0,0.0,0.0,74.0,0.0,0.0,50.0,0.0,32.0,81.0,0.0,98.0,6.0,0.0,0.0,0.0,95.0,0.0,0.0,41.0,80.0,59.0,0.0,32.0,0.0,8.0,0.0,33.0,93.0,72.0,0.0,0.0,55.0,0.0,0.0,54.0,88.0,78.0,0.0,49.0,18.0,0.0,72.0,92.0,8.0},
                {93.0,0.0,82.0,0.0,15.0,69.0,80.0,0.0,0.0,0.0,0.0,99.0,0.0,19.0,59.0,79.0,39.0,0.0,0.0,0.0,0.0,15.0,0.0,0.0,48.0,74.0,1.0,80.0,0.0,0.0,0.0,0.0,3.0,0.0,0.0,80.0,0.0,85.0,0.0,20.0,0.0,0.0,5.0,85.0,0.0,42.0,0.0,67.0,60.0,89.0},
                {0.0,81.0,0.0,0.0,0.0,13.0,0.0,83.0,0.0,0.0,0.0,0.0,64.0,80.0,83.0,0.0,0.0,49.0,67.0,0.0,0.0,57.0,0.0,88.0,0.0,70.0,71.0,5.0,0.0,93.0,82.0,0.0,0.0,0.0,0.0,0.0,63.0,0.0,0.0,23.0,0.0,5.0,88.0,0.0,0.0,0.0,45.0,0.0,0.0,0.0},
                {0.0,80.0,0.0,14.0,11.0,0.0,0.0,0.0,0.0,69.0,83.0,2.0,74.0,0.0,29.0,99.0,0.0,0.0,70.0,0.0,0.0,68.0,88.0,44.0,24.0,43.0,0.0,0.0,84.0,83.0,0.0,6.0,0.0,0.0,9.0,92.0,0.0,0.0,76.0,0.0,0.0,0.0,87.0,79.0,0.0,0.0,21.0,27.0,68.0,0.0},
                {25.0,61.0,0.0,18.0,84.0,0.0,97.0,99.0,3.0,1.0,94.0,0.0,0.0,9.0,0.0,25.0,0.0,0.0,0.0,5.0,0.0,0.0,0.0,8.0,54.0,33.0,0.0,45.0,82.0,0.0,0.0,40.0,37.0,22.0,0.0,0.0,0.0,39.0,0.0,5.0,66.0,76.0,0.0,7.0,48.0,0.0,0.0,59.0,70.0,27.0},
                {0.0,0.0,48.0,27.0,39.0,0.0,0.0,57.0,0.0,0.0,0.0,0.0,0.0,0.0,58.0,39.0,95.0,56.0,52.0,85.0,63.0,17.0,0.0,0.0,0.0,98.0,0.0,0.0,89.0,0.0,33.0,0.0,98.0,0.0,72.0,78.0,56.0,58.0,0.0,48.0,0.0,7.0,2.0,0.0,48.0,0.0,98.0,0.0,0.0,10.0},
                {41.0,0.0,32.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,70.0,86.0,81.0,51.0,0.0,0.0,4.0,38.0,0.0,0.0,0.0,27.0,87.0,0.0,0.0,0.0,4.0,0.0,0.0,12.0,0.0,0.0,3.0,12.0,0.0,40.0,0.0,0.0,0.0,0.0,0.0,75.0,0.0,0.0,96.0,74.0,0.0,48.0},
                {53.0,0.0,63.0,31.0,99.0,77.0,0.0,0.0,82.0,2.0,16.0,0.0,0.0,0.0,66.0,0.0,35.0,32.0,11.0,0.0,77.0,82.0,68.0,0.0,0.0,100.0,0.0,56.0,0.0,0.0,80.0,90.0,90.0,52.0,8.0,0.0,9.0,0.0,31.0,74.0,0.0,67.0,0.0,0.0,0.0,0.0,19.0,57.0,0.0,0.0},
                {0.0,60.0,0.0,0.0,17.0,0.0,60.0,0.0,62.0,0.0,0.0,0.0,42.0,0.0,89.0,58.0,26.0,0.0,53.0,69.0,24.0,0.0,0.0,44.0,0.0,13.0,0.0,81.0,79.0,0.0,13.0,0.0,0.0,0.0,28.0,96.0,0.0,0.0,0.0,100.0,0.0,93.0,44.0,0.0,97.0,67.0,15.0,0.0,0.0,70.0},
                {0.0,0.0,40.0,0.0,0.0,0.0,90.0,0.0,0.0,49.0,98.0,0.0,0.0,50.0,28.0,41.0,0.0,0.0,23.0,0.0,0.0,35.0,84.0,0.0,45.0,0.0,0.0,33.0,0.0,0.0,0.0,0.0,0.0,0.0,25.0,54.0,0.0,0.0,0.0,0.0,6.0,0.0,0.0,61.0,0.0,5.0,29.0,5.0,0.0,0.0},
                {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,53.0,99.0,0.0,52.0,0.0,37.0,68.0,7.0,0.0,0.0,31.0,71.0,0.0,0.0,0.0,47.0,0.0,80.0,0.0,90.0,96.0,56.0,14.0,3.0,0.0,6.0,0.0,48.0,33.0,0.0,33.0,0.0,0.0,17.0,16.0,0.0,77.0,0.0,0.0,0.0,8.0},
                {34.0,0.0,0.0,49.0,56.0,88.0,0.0,54.0,0.0,0.0,66.0,0.0,39.0,0.0,19.0,0.0,0.0,0.0,69.0,76.0,0.0,0.0,97.0,0.0,98.0,0.0,71.0,0.0,0.0,0.0,22.0,20.0,0.0,0.0,0.0,84.0,0.0,31.0,0.0,0.0,25.0,0.0,0.0,0.0,0.0,91.0,64.0,48.0,0.0,0.0},
                {0.0,0.0,0.0,34.0,73.0,0.0,69.0,0.0,77.0,0.0,0.0,0.0,38.0,0.0,0.0,26.0,0.0,0.0,16.0,96.0,0.0,85.0,0.0,0.0,0.0,0.0,100.0,44.0,0.0,1.0,0.0,51.0,90.0,0.0,96.0,21.0,0.0,0.0,66.0,0.0,37.0,0.0,0.0,54.0,0.0,32.0,0.0,0.0,0.0,0.0},
                {3.0,0.0,63.0,55.0,31.0,45.0,77.0,50.0,23.0,58.0,24.0,0.0,0.0,76.0,0.0,64.0,51.0,82.0,8.0,15.0,74.0,92.0,0.0,46.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,2.0,81.0,1.0,50.0,42.0,0.0,0.0,0.0,0.0,0.0,0.0,34.0,0.0,71.0,0.0,15.0,0.0,73.0,0.0},
                {62.0,0.0,38.0,4.0,0.0,73.0,0.0,0.0,92.0,40.0,22.0,74.0,0.0,68.0,33.0,0.0,0.0,0.0,0.0,1.0,0.0,0.0,0.0,0.0,0.0,0.0,56.0,92.0,60.0,0.0,58.0,85.0,0.0,11.0,0.0,0.0,0.0,39.0,20.0,97.0,68.0,0.0,94.0,30.0,55.0,30.0,0.0,100.0,60.0,0.0},
                {26.0,0.0,39.0,0.0,35.0,71.0,6.0,44.0,57.0,89.0,0.0,0.0,43.0,58.0,0.0,0.0,0.0,50.0,28.0,0.0,8.0,57.0,91.0,24.0,96.0,83.0,29.0,0.0,32.0,46.0,88.0,0.0,27.0,0.0,0.0,30.0,33.0,95.0,0.0,35.0,90.0,33.0,84.0,98.0,71.0,0.0,36.0,0.0,0.0,0.0},
                {52.0,6.0,0.0,70.0,98.0,56.0,6.0,85.0,64.0,0.0,0.0,0.0,65.0,0.0,3.0,0.0,0.0,99.0,0.0,69.0,63.0,0.0,81.0,64.0,0.0,0.0,1.0,0.0,0.0,2.0,0.0,0.0,53.0,0.0,0.0,0.0,49.0,0.0,0.0,56.0,61.0,0.0,98.0,72.0,74.0,78.0,37.0,82.0,21.0,0.0},
                {46.0,0.0,0.0,29.0,38.0,0.0,0.0,0.0,0.0,0.0,2.0,0.0,0.0,17.0,0.0,0.0,49.0,0.0,0.0,45.0,7.0,0.0,0.0,54.0,90.0,31.0,0.0,0.0,80.0,18.0,0.0,0.0,86.0,0.0,0.0,55.0,56.0,0.0,0.0,0.0,3.0,46.0,0.0,2.0,0.0,0.0,0.0,0.0,45.0,84.0},
                {9.0,51.0,0.0,0.0,0.0,72.0,47.0,60.0,0.0,56.0,25.0,0.0,14.0,92.0,0.0,71.0,5.0,50.0,0.0,48.0,1.0,0.0,0.0,0.0,0.0,0.0,96.0,46.0,34.0,0.0,0.0,49.0,0.0,0.0,53.0,30.0,61.0,78.0,0.0,76.0,99.0,75.0,12.0,32.0,0.0,0.0,0.0,61.0,40.0,0.0},
                {68.0,12.0,63.0,0.0,64.0,0.0,78.0,0.0,10.0,0.0,2.0,0.0,79.0,98.0,26.0,91.0,73.0,0.0,77.0,33.0,0.0,9.0,0.0,73.0,46.0,0.0,0.0,0.0,11.0,0.0,0.0,71.0,0.0,44.0,0.0,32.0,0.0,18.0,0.0,0.0,5.0,0.0,0.0,99.0,0.0,100.0,0.0,0.0,0.0,1.0},
                {0.0,52.0,0.0,79.0,24.0,69.0,0.0,0.0,40.0,0.0,32.0,0.0,62.0,88.0,70.0,0.0,0.0,0.0,81.0,0.0,97.0,0.0,0.0,0.0,0.0,0.0,91.0,48.0,0.0,38.0,23.0,35.0,46.0,0.0,0.0,0.0,12.0,0.0,0.0,41.0,45.0,0.0,75.0,0.0,0.0,0.0,58.0,32.0,0.0,64.0},
                {0.0,64.0,64.0,83.0,83.0,35.0,69.0,38.0,0.0,0.0,0.0,50.0,0.0,58.0,0.0,0.0,0.0,59.0,0.0,0.0,0.0,2.0,0.0,52.0,13.0,55.0,0.0,19.0,0.0,9.0,22.0,0.0,0.0,47.0,0.0,57.0,0.0,55.0,44.0,83.0,7.0,25.0,89.0,63.0,84.0,0.0,100.0,0.0,61.0,94.0},
                {27.0,0.0,0.0,16.0,100.0,0.0,0.0,0.0,69.0,67.0,8.0,76.0,0.0,51.0,24.0,47.0,0.0,0.0,26.0,0.0,18.0,0.0,0.0,0.0,0.0,0.0,29.0,0.0,12.0,0.0,0.0,0.0,32.0,0.0,47.0,1.0,26.0,76.0,0.0,48.0,0.0,2.0,85.0,4.0,26.0,52.0,76.0,61.0,41.0,14.0},
                {0.0,59.0,2.0,67.0,0.0,60.0,47.0,0.0,0.0,40.0,0.0,68.0,0.0,39.0,48.0,0.0,0.0,0.0,73.0,25.0,64.0,0.0,99.0,34.0,0.0,0.0,23.0,19.0,41.0,0.0,23.0,61.0,0.0,70.0,0.0,39.0,6.0,36.0,42.0,0.0,0.0,6.0,0.0,77.0,16.0,0.0,0.0,0.0,0.0,0.0},
                {0.0,0.0,0.0,0.0,0.0,0.0,0.0,22.0,8.0,9.0,47.0,0.0,37.0,0.0,36.0,66.0,0.0,56.0,82.0,2.0,0.0,0.0,0.0,0.0,0.0,16.0,0.0,0.0,0.0,85.0,0.0,100.0,77.0,65.0,0.0,0.0,1.0,0.0,0.0,27.0,3.0,6.0,0.0,0.0,0.0,0.0,27.0,0.0,0.0,70.0},
                {0.0,0.0,44.0,95.0,0.0,95.0,100.0,74.0,26.0,0.0,0.0,48.0,83.0,0.0,62.0,0.0,0.0,21.0,0.0,0.0,0.0,82.0,0.0,0.0,27.0,0.0,0.0,36.0,0.0,0.0,0.0,0.0,36.0,22.0,4.0,0.0,61.0,0.0,0.0,0.0,0.0,70.0,47.0,0.0,1.0,54.0,5.0,60.0,31.0,0.0},
                {0.0,0.0,95.0,41.0,0.0,84.0,0.0,88.0,0.0,70.0,47.0,35.0,36.0,0.0,83.0,0.0,19.0,12.0,0.0,0.0,0.0,0.0,0.0,40.0,92.0,0.0,0.0,100.0,0.0,0.0,68.0,50.0,0.0,0.0,24.0,97.0,59.0,0.0,0.0,0.0,0.0,59.0,0.0,0.0,79.0,0.0,55.0,0.0,0.0,37.0},
                {28.0,80.0,0.0,0.0,48.0,0.0,42.0,0.0,28.0,0.0,0.0,34.0,0.0,25.0,22.0,4.0,0.0,20.0,83.0,81.0,3.0,33.0,61.0,67.0,77.0,74.0,0.0,75.0,24.0,47.0,0.0,95.0,0.0,65.0,68.0,0.0,1.0,0.0,19.0,3.0,0.0,0.0,0.0,7.0,94.0,0.0,0.0,0.0,39.0,0.0},
                {33.0,0.0,63.0,0.0,0.0,73.0,68.0,0.0,21.0,68.0,2.0,56.0,0.0,58.0,0.0,0.0,33.0,28.0,0.0,75.0,0.0,0.0,65.0,28.0,94.0,88.0,92.0,0.0,0.0,34.0,56.0,0.0,0.0,0.0,40.0,0.0,0.0,36.0,0.0,0.0,0.0,0.0,71.0,0.0,0.0,0.0,22.0,25.0,58.0,0.0},
                {0.0,77.0,19.0,59.0,0.0,0.0,7.0,71.0,60.0,0.0,80.0,63.0,0.0,60.0,0.0,0.0,78.0,3.0,29.0,98.0,30.0,96.0,63.0,0.0,0.0,32.0,69.0,93.0,39.0,0.0,88.0,0.0,0.0,68.0,0.0,74.0,0.0,0.0,0.0,0.0,0.0,0.0,9.0,7.0,0.0,0.0,61.0,0.0,68.0,22.0},
                {46.0,21.0,0.0,14.0,0.0,0.0,0.0,0.0,0.0,0.0,61.0,43.0,0.0,0.0,0.0,0.0,79.0,0.0,25.0,0.0,37.0,0.0,32.0,0.0,50.0,0.0,94.0,0.0,42.0,0.0,0.0,41.0,73.0,0.0,59.0,72.0,100.0,0.0,0.0,38.0,0.0,20.0,0.0,38.0,13.0,0.0,0.0,36.0,0.0,70.0},
                {0.0,21.0,0.0,0.0,88.0,41.0,41.0,0.0,0.0,0.0,0.0,0.0,13.0,0.0,11.0,83.0,63.0,0.0,57.0,59.0,59.0,0.0,16.0,0.0,77.0,75.0,0.0,82.0,0.0,0.0,0.0,0.0,0.0,65.0,27.0,7.0,44.0,0.0,38.0,3.0,0.0,8.0,90.0,25.0,0.0,0.0,41.0,0.0,72.0,0.0},
                {28.0,4.0,67.0,93.0,17.0,26.0,98.0,8.0,49.0,1.0,0.0,0.0,91.0,30.0,46.0,37.0,0.0,0.0,0.0,42.0,31.0,0.0,0.0,4.0,0.0,0.0,66.0,0.0,0.0,0.0,0.0,55.0,0.0,34.0,0.0,0.0,0.0,58.0,0.0,13.0,45.0,0.0,0.0,0.0,0.0,66.0,96.0,0.0,0.0,0.0},
                {0.0,0.0,0.0,53.0,0.0,0.0,0.0,0.0,2.0,90.0,74.0,0.0,79.0,0.0,25.0,68.0,19.0,81.0,0.0,68.0,62.0,0.0,65.0,54.0,55.0,41.0,0.0,12.0,84.0,0.0,45.0,0.0,0.0,0.0,7.0,0.0,0.0,0.0,2.0,0.0,74.0,0.0,0.0,63.0,95.0,0.0,0.0,0.0,6.0,6.0},
                {41.0,0.0,63.0,0.0,100.0,0.0,26.0,92.0,27.0,21.0,56.0,0.0,0.0,56.0,0.0,17.0,0.0,0.0,16.0,33.0,39.0,0.0,0.0,0.0,98.0,0.0,74.0,70.0,0.0,0.0,52.0,30.0,32.0,0.0,0.0,0.0,0.0,92.0,0.0,25.0,0.0,26.0,51.0,63.0,0.0,0.0,0.0,0.0,45.0,0.0},
                {0.0,46.0,91.0,46.0,39.0,0.0,0.0,0.0,72.0,0.0,0.0,0.0,0.0,0.0,13.0,28.0,0.0,5.0,22.0,0.0,0.0,0.0,62.0,5.0,0.0,25.0,0.0,0.0,21.0,0.0,0.0,0.0,69.0,98.0,0.0,43.0,0.0,43.0,0.0,0.0,9.0,0.0,0.0,0.0,44.0,0.0,0.0,66.0,79.0,0.0},
                {0.0,30.0,0.0,54.0,70.0,0.0,0.0,27.0,31.0,0.0,25.0,0.0,0.0,0.0,61.0,0.0,0.0,0.0,0.0,24.0,35.0,13.0,21.0,0.0,0.0,23.0,0.0,0.0,46.0,0.0,0.0,3.0,64.0,0.0,97.0,91.0,0.0,75.0,0.0,0.0,93.0,67.0,0.0,2.0,0.0,71.0,0.0,0.0,0.0,0.0},
                {43.0,20.0,10.0,0.0,0.0,0.0,15.0,72.0,67.0,43.0,71.0,34.0,0.0,26.0,0.0,0.0,86.0,29.0,0.0,25.0,22.0,0.0,0.0,77.0,0.0,80.0,0.0,56.0,0.0,62.0,20.0,64.0,59.0,0.0,0.0,0.0,11.0,55.0,87.0,0.0,88.0,0.0,59.0,0.0,9.0,62.0,26.0,0.0,80.0,0.0},
                {0.0,0.0,0.0,35.0,0.0,47.0,58.0,95.0,42.0,76.0,35.0,0.0,0.0,0.0,86.0,0.0,0.0,27.0,0.0,13.0,11.0,0.0,14.0,0.0,21.0,0.0,84.0,18.0,0.0,0.0,68.0,0.0,86.0,0.0,0.0,94.0,36.0,76.0,0.0,0.0,0.0,0.0,0.0,0.0,1.0,0.0,64.0,8.0,0.0,0.0},
                {15.0,0.0,0.0,55.0,0.0,0.0,85.0,0.0,21.0,0.0,0.0,0.0,0.0,0.0,56.0,0.0,0.0,0.0,0.0,46.0,0.0,0.0,0.0,0.0,0.0,68.0,0.0,93.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,75.0,0.0,0.0,78.0,0.0,0.0,0.0,0.0,0.0,0.0,78.0,0.0,0.0,35.0,32.0},
                {82.0,0.0,0.0,0.0,52.0,0.0,0.0,0.0,0.0,10.0,0.0,79.0,54.0,21.0,0.0,44.0,0.0,16.0,0.0,73.0,0.0,41.0,0.0,0.0,0.0,58.0,31.0,31.0,6.0,0.0,0.0,0.0,70.0,56.0,54.0,40.0,0.0,0.0,0.0,68.0,87.0,0.0,80.0,29.0,17.0,0.0,28.0,0.0,0.0,0.0},
                {0.0,0.0,0.0,0.0,0.0,2.0,0.0,0.0,91.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,67.0,29.0,0.0,0.0,0.0,84.0,0.0,18.0,40.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,6.0,20.0,51.0,0.0,0.0,92.0,56.0,0.0,20.0,0.0,93.0,24.0,0.0,21.0,0.0,0.0},
                {0.0,37.0,46.0,48.0,0.0,14.0,74.0,0.0,0.0,0.0,100.0,37.0,0.0,0.0,0.0,0.0,54.0,0.0,0.0,0.0,0.0,3.0,29.0,0.0,0.0,65.0,0.0,0.0,0.0,47.0,0.0,0.0,55.0,24.0,0.0,0.0,69.0,55.0,0.0,0.0,0.0,74.0,0.0,0.0,0.0,0.0,0.0,75.0,10.0,0.0},
                {78.0,87.0,0.0,0.0,0.0,96.0,0.0,0.0,0.0,97.0,84.0,0.0,0.0,60.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,41.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,74.0,92.0,0.0,0.0,95.0,2.0,0.0,0.0,6.0,2.0,0.0,0.0,14.0,0.0,13.0,99.0,0.0},
                {7.0,79.0,94.0,0.0,74.0,0.0,60.0,90.0,0.0,0.0,0.0,7.0,0.0,0.0,0.0,28.0,0.0,84.0,0.0,0.0,0.0,61.0,0.0,0.0,0.0,0.0,0.0,70.0,0.0,0.0,0.0,0.0,0.0,99.0,0.0,23.0,6.0,77.0,0.0,58.0,0.0,0.0,0.0,0.0,0.0,51.0,0.0,0.0,96.0,0.0},
                {0.0,74.0,42.0,0.0,59.0,60.0,62.0,90.0,1.0,0.0,61.0,52.0,89.0,14.0,18.0,53.0,41.0,60.0,20.0,96.0,0.0,25.0,1.0,0.0,5.0,0.0,25.0,3.0,0.0,0.0,35.0,0.0,0.0,0.0,0.0,8.0,0.0,0.0,0.0,93.0,24.0,0.0,15.0,64.0,62.0,64.0,0.0,0.0,0.0,0.0},
                {80.0,0.0,0.0,0.0,59.0,4.0,58.0,25.0,0.0,19.0,0.0,0.0,0.0,0.0,0.0,24.0,26.0,0.0,0.0,12.0,74.0,41.0,66.0,0.0,0.0,0.0,0.0,75.0,40.0,70.0,18.0,0.0,0.0,38.0,0.0,52.0,99.0,8.0,0.0,37.0,98.0,8.0,0.0,53.0,0.0,17.0,70.0,0.0,33.0,62.0},
                {61.0,37.0,25.0,69.0,0.0,0.0,97.0,97.0,84.0,81.0,92.0,73.0,74.0,42.0,0.0,77.0,0.0,0.0,0.0,66.0,61.0,0.0,0.0,0.0,72.0,0.0,0.0,0.0,0.0,0.0,0.0,7.0,77.0,0.0,0.0,0.0,1.0,42.0,38.0,0.0,71.0,0.0,82.0,0.0,0.0,0.0,0.0,78.0,80.0,0.0},
                {17.0,75.0,30.0,0.0,55.0,0.0,49.0,0.0,0.0,89.0,0.0,38.0,9.0,81.0,29.0,18.0,0.0,95.0,100.0,45.0,28.0,15.0,0.0,0.0,26.0,60.0,12.0,14.0,38.0,0.0,84.0,0.0,0.0,0.0,0.0,74.0,0.0,71.0,0.0,0.0,0.0,26.0,31.0,0.0,21.0,35.0,39.0,0.0,0.0,18.0},
                {0.0,0.0,0.0,0.0,53.0,0.0,60.0,83.0,47.0,0.0,55.0,35.0,0.0,0.0,0.0,28.0,88.0,0.0,0.0,0.0,0.0,0.0,60.0,9.0,0.0,0.0,81.0,88.0,0.0,38.0,11.0,0.0,11.0,0.0,0.0,0.0,82.0,94.0,47.0,68.0,35.0,0.0,41.0,0.0,0.0,72.0,92.0,60.0,52.0,4.0},
                {0.0,0.0,0.0,0.0,0.0,0.0,5.0,2.0,32.0,0.0,0.0,7.0,88.0,15.0,0.0,71.0,0.0,94.0,0.0,0.0,63.0,0.0,30.0,0.0,0.0,0.0,0.0,16.0,76.0,34.0,20.0,0.0,69.0,20.0,0.0,0.0,0.0,21.0,90.0,0.0,0.0,85.0,74.0,98.0,53.0,40.0,0.0,19.0,98.0,0.0},
                {0.0,45.0,22.0,1.0,0.0,0.0,56.0,19.0,22.0,0.0,0.0,0.0,0.0,23.0,31.0,0.0,0.0,0.0,45.0,92.0,65.0,0.0,64.0,0.0,0.0,93.0,0.0,98.0,0.0,0.0,26.0,63.0,0.0,99.0,0.0,0.0,0.0,0.0,78.0,0.0,55.0,0.0,0.0,0.0,17.0,0.0,22.0,2.0,0.0,0.0},
                {0.0,84.0,97.0,0.0,0.0,0.0,0.0,0.0,0.0,43.0,0.0,77.0,0.0,61.0,60.0,44.0,33.0,0.0,0.0,62.0,32.0,86.0,0.0,98.0,62.0,6.0,27.0,0.0,0.0,55.0,0.0,67.0,0.0,0.0,0.0,76.0,0.0,23.0,2.0,0.0,0.0,63.0,0.0,0.0,0.0,51.0,0.0,35.0,15.0,0.0},
                {11.0,59.0,78.0,19.0,61.0,0.0,0.0,12.0,0.0,89.0,78.0,0.0,38.0,92.0,0.0,0.0,6.0,16.0,55.0,41.0,70.0,0.0,0.0,2.0,0.0,0.0,0.0,0.0,100.0,6.0,75.0,0.0,73.0,0.0,0.0,0.0,54.0,0.0,0.0,0.0,66.0,0.0,0.0,77.0,34.0,0.0,0.0,0.0,0.0,20.0},
                {59.0,86.0,73.0,0.0,0.0,0.0,0.0,21.0,47.0,0.0,40.0,0.0,100.0,77.0,0.0,0.0,0.0,0.0,90.0,83.0,58.0,0.0,0.0,66.0,0.0,0.0,12.0,27.0,10.0,9.0,53.0,14.0,0.0,11.0,0.0,55.0,0.0,0.0,0.0,0.0,0.0,99.0,63.0,0.0,0.0,5.0,37.0,71.0,0.0,76.0},
                {0.0,0.0,0.0,0.0,0.0,49.0,64.0,43.0,0.0,54.0,81.0,0.0,0.0,0.0,0.0,25.0,71.0,8.0,87.0,0.0,0.0,0.0,0.0,82.0,58.0,0.0,9.0,0.0,0.0,62.0,0.0,0.0,0.0,63.0,21.0,54.0,0.0,0.0,35.0,0.0,0.0,0.0,0.0,42.0,87.0,0.0,0.0,0.0,0.0,15.0},
                {89.0,65.0,68.0,75.0,0.0,56.0,0.0,0.0,17.0,0.0,0.0,20.0,55.0,0.0,99.0,27.0,75.0,0.0,0.0,93.0,49.0,0.0,0.0,72.0,17.0,47.0,90.0,0.0,0.0,64.0,0.0,12.0,0.0,74.0,31.0,99.0,0.0,0.0,0.0,6.0,53.0,0.0,81.0,0.0,0.0,65.0,0.0,0.0,3.0,0.0},
                {0.0,0.0,15.0,0.0,0.0,0.0,0.0,0.0,69.0,74.0,27.0,0.0,0.0,0.0,77.0,61.0,0.0,75.0,0.0,33.0,0.0,0.0,88.0,0.0,18.0,0.0,31.0,0.0,11.0,0.0,81.0,7.0,10.0,32.0,0.0,50.0,0.0,0.0,8.0,0.0,0.0,78.0,0.0,45.0,0.0,0.0,0.0,57.0,81.0,86.0},
                {0.0,0.0,61.0,0.0,0.0,0.0,0.0,75.0,0.0,16.0,0.0,6.0,42.0,63.0,0.0,61.0,44.0,0.0,31.0,83.0,82.0,86.0,17.0,0.0,0.0,48.0,60.0,46.0,0.0,0.0,19.0,0.0,61.0,32.0,0.0,0.0,0.0,3.0,70.0,0.0,83.0,0.0,0.0,84.0,74.0,0.0,59.0,0.0,29.0,75.0},
                {91.0,44.0,97.0,0.0,1.0,33.0,52.0,54.0,0.0,0.0,0.0,0.0,9.0,0.0,3.0,0.0,0.0,0.0,0.0,39.0,86.0,25.0,0.0,0.0,0.0,69.0,0.0,23.0,0.0,0.0,93.0,42.0,0.0,0.0,88.0,29.0,0.0,68.0,55.0,0.0,0.0,0.0,0.0,60.0,88.0,0.0,96.0,0.0,0.0,0.0},
                {0.0,28.0,0.0,81.0,0.0,0.0,0.0,0.0,41.0,95.0,0.0,0.0,59.0,44.0,35.0,38.0,85.0,33.0,46.0,27.0,34.0,0.0,0.0,0.0,93.0,16.0,0.0,0.0,0.0,51.0,58.0,68.0,75.0,0.0,76.0,0.0,48.0,0.0,3.0,14.0,0.0,87.0,6.0,0.0,60.0,26.0,0.0,0.0,100.0,0.0},
                {65.0,0.0,63.0,0.0,0.0,0.0,0.0,33.0,94.0,0.0,22.0,52.0,52.0,0.0,5.0,0.0,85.0,45.0,65.0,28.0,36.0,83.0,29.0,0.0,0.0,57.0,4.0,0.0,96.0,0.0,71.0,0.0,0.0,63.0,20.0,53.0,0.0,89.0,0.0,0.0,0.0,85.0,0.0,0.0,3.0,0.0,27.0,86.0,0.0,97.0},
                {90.0,43.0,14.0,0.0,16.0,0.0,0.0,96.0,28.0,0.0,88.0,0.0,0.0,82.0,0.0,7.0,0.0,28.0,82.0,0.0,0.0,0.0,0.0,67.0,75.0,0.0,74.0,65.0,0.0,19.0,21.0,15.0,0.0,0.0,40.0,26.0,0.0,0.0,0.0,0.0,45.0,0.0,19.0,69.0,61.0,0.0,0.0,41.0,0.0,0.0},
                {11.0,0.0,58.0,0.0,0.0,0.0,0.0,81.0,0.0,0.0,22.0,0.0,19.0,0.0,0.0,0.0,65.0,48.0,33.0,0.0,88.0,0.0,14.0,0.0,87.0,0.0,0.0,97.0,17.0,0.0,0.0,0.0,0.0,59.0,15.0,51.0,0.0,72.0,95.0,12.0,23.0,71.0,39.0,0.0,96.0,45.0,71.0,0.0,0.0,39.0},
                {98.0,0.0,0.0,0.0,0.0,45.0,89.0,5.0,84.0,18.0,19.0,62.0,41.0,0.0,0.0,0.0,85.0,0.0,0.0,0.0,36.0,46.0,20.0,0.0,58.0,9.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,77.0,0.0,97.0,0.0,0.0,18.0,41.0,0.0,0.0,0.0,0.0,32.0,52.0,77.0,5.0,0.0,0.0},
                {51.0,70.0,3.0,25.0,0.0,0.0,0.0,0.0,93.0,15.0,0.0,0.0,32.0,22.0,11.0,35.0,0.0,3.0,0.0,15.0,47.0,0.0,1.0,0.0,91.0,0.0,44.0,0.0,72.0,0.0,0.0,72.0,18.0,0.0,5.0,0.0,81.0,0.0,0.0,0.0,94.0,72.0,73.0,49.0,64.0,0.0,0.0,5.0,0.0,20.0},
                {0.0,0.0,0.0,16.0,0.0,0.0,0.0,0.0,54.0,71.0,0.0,0.0,20.0,0.0,0.0,82.0,70.0,28.0,0.0,81.0,0.0,0.0,96.0,0.0,62.0,14.0,0.0,0.0,0.0,0.0,71.0,0.0,72.0,0.0,0.0,38.0,57.0,0.0,0.0,0.0,0.0,0.0,56.0,0.0,0.0,0.0,8.0,1.0,67.0,20.0},
                {52.0,55.0,85.0,0.0,0.0,0.0,0.0,100.0,53.0,70.0,0.0,0.0,7.0,75.0,0.0,92.0,31.0,0.0,53.0,81.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,73.0,0.0,51.0,0.0,0.0,0.0,12.0,0.0,0.0,52.0,0.0,77.0,0.0,0.0,70.0,28.0,0.0,5.0,20.0,0.0,95.0,0.0,27.0},
                {14.0,68.0,0.0,0.0,67.0,0.0,19.0,19.0,0.0,0.0,12.0,0.0,97.0,4.0,0.0,0.0,0.0,0.0,0.0,0.0,51.0,91.0,56.0,64.0,69.0,78.0,0.0,0.0,0.0,0.0,0.0,0.0,46.0,0.0,0.0,61.0,0.0,0.0,0.0,72.0,92.0,71.0,26.0,0.0,0.0,3.0,5.0,81.0,71.0,0.0},
                {0.0,0.0,0.0,42.0,37.0,41.0,51.0,9.0,0.0,0.0,0.0,0.0,9.0,0.0,0.0,0.0,86.0,46.0,0.0,0.0,0.0,18.0,38.0,0.0,98.0,38.0,0.0,9.0,0.0,0.0,99.0,0.0,95.0,18.0,0.0,53.0,13.0,98.0,0.0,54.0,0.0,0.0,75.0,4.0,0.0,21.0,0.0,44.0,0.0,22.0},
                {14.0,0.0,0.0,30.0,83.0,17.0,92.0,87.0,77.0,0.0,0.0,0.0,0.0,82.0,70.0,0.0,57.0,0.0,0.0,0.0,0.0,97.0,0.0,63.0,0.0,0.0,11.0,57.0,18.0,0.0,13.0,0.0,46.0,0.0,43.0,84.0,20.0,0.0,41.0,0.0,15.0,46.0,46.0,39.0,59.0,20.0,0.0,0.0,25.0,32.0},
                {99.0,93.0,30.0,0.0,93.0,0.0,36.0,94.0,0.0,0.0,0.0,0.0,0.0,0.0,42.0,98.0,0.0,0.0,7.0,64.0,22.0,39.0,0.0,94.0,30.0,60.0,44.0,0.0,1.0,0.0,0.0,97.0,0.0,14.0,98.0,0.0,0.0,8.0,70.0,56.0,61.0,68.0,0.0,44.0,38.0,58.0,0.0,0.0,27.0,42.0},
                {0.0,0.0,29.0,3.0,0.0,0.0,25.0,5.0,97.0,2.0,0.0,0.0,21.0,0.0,32.0,0.0,0.0,0.0,0.0,0.0,19.0,42.0,21.0,22.0,37.0,0.0,0.0,0.0,0.0,0.0,92.0,0.0,0.0,0.0,0.0,0.0,0.0,83.0,33.0,0.0,0.0,16.0,0.0,0.0,0.0,0.0,0.0,43.0,0.0,17.0},
                {54.0,0.0,0.0,41.0,0.0,90.0,90.0,70.0,0.0,57.0,0.0,98.0,0.0,69.0,0.0,0.0,55.0,0.0,24.0,69.0,2.0,0.0,76.0,83.0,0.0,46.0,70.0,42.0,0.0,0.0,0.0,0.0,96.0,0.0,0.0,0.0,36.0,40.0,0.0,50.0,0.0,12.0,0.0,0.0,0.0,18.0,30.0,58.0,22.0,0.0},
                {0.0,0.0,45.0,0.0,65.0,0.0,15.0,3.0,0.0,0.0,8.0,91.0,22.0,0.0,0.0,0.0,0.0,50.0,8.0,0.0,0.0,0.0,7.0,95.0,0.0,83.0,0.0,0.0,70.0,31.0,0.0,7.0,0.0,89.0,1.0,0.0,0.0,80.0,0.0,0.0,70.0,87.0,45.0,0.0,84.0,90.0,72.0,80.0,0.0,0.0},
                {0.0,0.0,94.0,0.0,0.0,0.0,0.0,70.0,0.0,0.0,54.0,0.0,0.0,3.0,0.0,0.0,0.0,59.0,0.0,67.0,72.0,0.0,65.0,0.0,0.0,89.0,22.0,5.0,0.0,0.0,35.0,17.0,32.0,0.0,0.0,0.0,78.0,49.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,65.0,75.0,72.0,0.0,70.0},
                {44.0,0.0,0.0,56.0,0.0,15.0,0.0,0.0,62.0,61.0,14.0,0.0,0.0,30.0,5.0,0.0,66.0,10.0,0.0,0.0,22.0,0.0,69.0,0.0,56.0,89.0,0.0,0.0,36.0,62.0,0.0,0.0,17.0,0.0,33.0,22.0,0.0,8.0,26.0,0.0,0.0,0.0,23.0,72.0,60.0,0.0,65.0,0.0,50.0,98.0},
                {0.0,58.0,55.0,69.0,4.0,0.0,99.0,0.0,61.0,0.0,0.0,0.0,50.0,74.0,0.0,44.0,0.0,70.0,0.0,58.0,55.0,0.0,0.0,83.0,89.0,0.0,16.0,0.0,21.0,0.0,0.0,0.0,0.0,0.0,98.0,0.0,0.0,0.0,8.0,11.0,0.0,27.0,69.0,0.0,75.0,0.0,0.0,0.0,0.0,0.0},
                {0.0,47.0,0.0,0.0,0.0,63.0,69.0,44.0,0.0,0.0,0.0,0.0,72.0,0.0,84.0,42.0,0.0,0.0,70.0,0.0,26.0,44.0,0.0,91.0,0.0,95.0,0.0,3.0,0.0,2.0,0.0,11.0,22.0,63.0,50.0,0.0,0.0,67.0,0.0,0.0,0.0,77.0,63.0,0.0,26.0,0.0,36.0,3.0,0.0,0.0},
                {0.0,0.0,59.0,9.0,53.0,0.0,0.0,0.0,0.0,48.0,21.0,72.0,95.0,0.0,0.0,0.0,0.0,39.0,0.0,6.0,0.0,76.0,58.0,71.0,51.0,1.0,0.0,0.0,0.0,26.0,0.0,0.0,0.0,0.0,15.0,94.0,21.0,0.0,0.0,56.0,0.0,0.0,68.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},
                {0.0,0.0,0.0,0.0,43.0,0.0,21.0,28.0,56.0,0.0,0.0,0.0,48.0,100.0,11.0,0.0,97.0,7.0,64.0,0.0,94.0,37.0,0.0,7.0,62.0,94.0,0.0,16.0,95.0,0.0,0.0,0.0,0.0,82.0,53.0,0.0,0.0,58.0,100.0,0.0,27.0,21.0,0.0,0.0,97.0,0.0,49.0,0.0,48.0,64.0},
                {99.0,4.0,17.0,74.0,64.0,0.0,38.0,0.0,0.0,12.0,63.0,7.0,61.0,0.0,13.0,10.0,0.0,55.0,0.0,0.0,57.0,0.0,0.0,24.0,38.0,11.0,0.0,0.0,5.0,73.0,0.0,61.0,51.0,0.0,72.0,0.0,0.0,0.0,0.0,60.0,0.0,44.0,0.0,92.0,0.0,0.0,0.0,0.0,0.0,0.0},
                {0.0,6.0,91.0,0.0,74.0,0.0,51.0,86.0,32.0,54.0,0.0,73.0,97.0,29.0,2.0,8.0,17.0,0.0,0.0,24.0,0.0,0.0,0.0,0.0,21.0,0.0,10.0,0.0,62.0,0.0,0.0,68.0,21.0,48.0,0.0,77.0,0.0,0.0,0.0,0.0,0.0,91.0,54.0,0.0,15.0,99.0,0.0,0.0,67.0,43.0},
                {0.0,0.0,0.0,62.0,75.0,87.0,67.0,98.0,100.0,0.0,0.0,31.0,4.0,0.0,49.0,30.0,73.0,0.0,99.0,0.0,92.0,49.0,0.0,85.0,73.0,63.0,47.0,0.0,21.0,0.0,88.0,36.0,35.0,89.0,0.0,48.0,4.0,0.0,0.0,87.0,52.0,0.0,0.0,38.0,0.0,62.0,0.0,0.0,36.0,0.0},
        };

        // la variation de d apporte de gros changements sur le rmse. d étant la dimensions des matrices u et v, si il est petit par rapport à la taille de M il fait croitre le temps de calculs
        // je propose qu'on fixe donc d = sqrt(M.length * M[0].length);
        // Remarque: avec un d petit on obtient souvent un rmse plus petit. et avec un d plus grand, rmse constant.
        //int d = M[0].length * M.length;
        int[] fine = recommend(M, 70);

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

    public static boolean testMatrix(double[][] M, double[][] U, double[][] V) {
        return isMatrix(M) && isMatrix(U) && isMatrix(V);
    }

    // le test ismatrix me semble de trop car il revient dans la procédure de update element à chaque fois.
    public static double updateUElem(double[][] M, double[][] U, double[][] V, int r, int s) {
        if (testMatrix(M, U, V)) {
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
        } else {
            return 0;
        }
    }

    public static double updateVElem(double[][] M, double[][] U, double[][] V, int r, int s) {
        if (testMatrix(M, U, V)) {
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
        double[][] U1 = copyMatrix(U);
        double rmseOld;
        double rmseNew;
        //do {
        // rmseOld = rmse(M, multiplyMatrix(U1, V));
        for (int li = 0; li < l; li++) {
            for (int co = 0; co < c; co++) {
                U1[li][co] = updateUElem(M, U1, V, li, co);
            }
        }
        // rmseNew = rmse(M, multiplyMatrix(U1, V));
        // }while (Math.abs(rmseNew - rmseOld) > Math.pow(10, (-6)));
        return U1;
    }

    public static double[][] optimizeV(double[][] M, double[][] U, double[][] V) {
        int l = V.length;
        int c = V[0].length;
        double[][] V1 = copyMatrix(V);
        double rmseOld;
        double rmseNew;
        // do  {
        //  rmseOld = rmse(M, multiplyMatrix(U, V1));
        for (int li = 0; li < l; li++) {
            for (int co = 0; co < c; co++) {
                V1[li][co] = updateVElem(M, U, V1, li, co);
            }
        }
        //   rmseNew = rmse(M, multiplyMatrix(U, V1));
        // }while(Math.abs(rmseNew - rmseOld) > Math.pow(10, (-6)));
        return V1;
    }

//j'ai modifié le recommend pour qu'il affiche un compteur durant les calculs
// et réglé le bug qui rendait l'itération du optimizeU,V impossible. 
// donc le rmse est proche de 0 maintenant.
// il nous reste à définir le nombre de matrices à tester. j'ai mis 20 aléatoirement.
// 50 me semble être une bonne solution mais elle est très chère en temps.
    public static int[] recommend(double[][] M, int d) {

        double sommeM = 0.0;
        int    nbM = 0;
        int    nbPointsDeparts = 20;

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
            int i = 0;
            double tmpRmse;
            double Rmse = 0;
            uMatrix = createMatrix(M.length, d, v, v);
            vMatrix = createMatrix(d,M[0].length, v ,v);
            // déclration du nombre aléatoire altérant le prochain v.
            double nbRand = nbAleatoire(-v,v);

            do{
                tmpRmse = Rmse;
                uMatrix = optimizeU(M, uMatrix,vMatrix);
                vMatrix = optimizeV(M, uMatrix, vMatrix);
                P = multiplyMatrix(uMatrix ,vMatrix);
                Rmse = rmse(M,P);
                ++i;
                System.out.println("matrice no "+ (c+1) +" nombre d'itération : "+ i);
            }while(Math.abs((tmpRmse - Rmse))  > Math.pow(10,(-6)));
            if(c == 0 ||  rmse(M,minP) > rmse(M,P))
            {
                minUMatrix = copyMatrix(uMatrix);
                minVMatrix = copyMatrix(vMatrix);
                minP = multiplyMatrix(minUMatrix,minVMatrix);
            }
            v = Math.sqrt(( sommeM/nbM )/d) + nbRand;
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
        System.out.println("la matrice sélectionnée à un rmse de "+rmse(M,minP));
        return recomendation;
    }
}

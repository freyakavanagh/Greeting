package org.example;

public class FilmClassifications {

    public static String availableClassifications(int ageOfViewer) {
        String classifications; //changed name for clarity
        if (ageOfViewer < 12) {
            classifications = "U & PG films are available.";
        } else if (ageOfViewer < 15) {
            classifications = "U, PG & 12 films are available.";
        } else if (ageOfViewer < 18) {
            classifications = "U, PG, 12 & 15 films are available.";
        } else
            classifications = "All films are available.";


        return classifications;
    }

    public static void main(String[] args) {
        int ageOfViewer = 11;
        System.out.println(availableClassifications(ageOfViewer)); //added print statement
    }
}

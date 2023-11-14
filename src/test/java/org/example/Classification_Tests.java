package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Classification_Tests {

    @ParameterizedTest
    @ValueSource(ints ={0,11})
    @DisplayName("Check for U & PG")
    public void CheckForUAndPG(int ageOfViewer) {
        Assertions.assertEquals("U & PG films are available.", FilmClassifications.availableClassifications(ageOfViewer));
    }

    @ParameterizedTest
    @ValueSource(ints ={12,14})
    @DisplayName("Check for U, PG & 12")
    public void CheckForUPGAnd12(int ageOfViewer) {
        Assertions.assertEquals("U, PG & 12 films are available.", FilmClassifications.availableClassifications(ageOfViewer));
    }

    @ParameterizedTest
    @ValueSource(ints ={15,17})
    @DisplayName("Check for U, PG, 12 and 15")
    public void CheckForUPG12And15(int ageOfViewer) {
        Assertions.assertEquals("U, PG, 12 & 15 films are available.", FilmClassifications.availableClassifications(ageOfViewer));
    }

    @ParameterizedTest
    @ValueSource(ints ={18})
    @DisplayName("Check for all films")
    public void CheckForAllFilms(int ageOfViewer) {
        Assertions.assertEquals("All films are available.", FilmClassifications.availableClassifications(ageOfViewer));
    }

}

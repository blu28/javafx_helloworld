package com.example.helloworld;

import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest extends ApplicationTest {

    @Override
    public void start(Stage stage) throws Exception {
        new App().start(stage);
    }

    @Test
    void appShowsLabelAndQuitButton() {
        String labelText = lookup(".label").queryLabeled().getText();
        assertEquals("Hello World!", labelText);

        assertNotNull(lookup("quit").queryButton());
    }
}
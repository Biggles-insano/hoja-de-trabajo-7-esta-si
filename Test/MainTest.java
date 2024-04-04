import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testMain() throws IOException {
        String input = "house\ncasa\nchien\nsalir\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = "Árbol BST en inglés:\n[Association: key=dog, value=, left=[Association: key=house, value=, left=null, right=null], right=null]\nÁrbol BST en español:\n[Association: key=perro, value=, left=[Association: key=casa, value=, left=null, right=null], right=null]\nÁrbol BST en francés:\n[Association: key=chien, value=, left=null, right=null]\nIngrese una palabra para buscar en los árboles BST (o 'salir' para terminar):\nResultado de la búsqueda:\nInglés: [Association: key=house, value=, left=null, right=null]\nEspañol: [Association: key=casa, value=, left=null, right=null]\nFrancés: [Association: key=chien, value=, left=null, right=null]\nIngrese una palabra para buscar en los árboles BST (o 'salir' para terminar):\nIngrese una palabra para buscar en los árboles BST (o 'salir' para terminar):\nIngrese una palabra para buscar en los árboles BST (o 'salir' para terminar):\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}

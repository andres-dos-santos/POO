import br.com.project.gui.Window;
import br.com.project.gui.buttons.Play;
import br.com.project.videos.*;

public class App {
    public static void main(String[] args) throws Exception {
        Film film = new Film();
        Documentary documentary = new Documentary();
        Novel novel = new Novel();
        Serie serie = new Serie();

        Window window = new Window();

        Play play = new Play();
    }
}

package BIBLIOTECA;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, !");
        ElementiBiblioteca e1 = new Libro("mein kampf", "adolfo", "politico", 5000, true);
        System.out.println(e1.getTitolo());
    }
}

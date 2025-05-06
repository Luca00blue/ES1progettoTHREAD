public class App {
    public static void main(String[] args) throws Exception {
  
    
    corridore c1 = new corridore("Lucas");
    corridore c2 = new corridore("Diego");
    corridore c3 = new corridore("Aless");
    corridore c4 = new corridore("Giova");

    c1.start();
    c2.start();
    c3.start();
    c4.start();

    c1.join();
    c2.join();
    c3.join();
    c4.join();
    System.out.println("gara finita");
    }
}



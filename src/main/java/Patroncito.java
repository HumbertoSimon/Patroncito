
public class Patroncito {

    public static void find(String string, String finder) {
        int tru = 0;
        int founded = 0;

        for (int a = 0; a < string.length(); a++) {
            tru = 0;
            if (string.charAt(a) == finder.charAt(0)) {
                for (int h = 0; h < finder.length(); h++) {
                    if (a + h >= string.length()) {
                        System.out.println("<---------------------------------------------------------------------->");
                        a = string.length();
                        break;
                    }
                    if (finder.charAt(h) == string.charAt(a + h)) {
                        tru++;
                        if (tru == finder.length()) {
                            System.out.println("Lo encontre, en el lugar: " + a);
                            founded++;
                        }
                    }

                }
            }
        }
        System.out.println("Lo encontre " + founded + " veces");
    }

    public static void main(String[] args) {
        String Vettel = "1010101";
        String Sebastian = "1110010001101110100011001111000110001110001110001110100011010001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001101000111110101010100111100011000";
        int tru = 0;
        int Founded = 0;

        Patroncito.find(Sebastian, Vettel);

    }
}

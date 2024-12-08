public class ColoredText {
    public static void main(String[] args) {
        // Reset code
        final String RESET = "\033[0m";

        // Text color codes
        final String RED = "\033[31m";
        final String GREEN = "\033[32m";
        final String YELLOW = "\033[33m";
        final String BLUE = "\033[34m";
        final String MAGENTA = "\033[35m";
        final String CYAN = "\033[36m";
        final String WHITE = "\033[37m";

        // Background color codes
        final String RED_BACKGROUND = "\033[41m";
        final String GREEN_BACKGROUND = "\033[42m";

        // Print colored text
        System.out.println(RED + "This is red text" + RESET);
        System.out.println(GREEN + "This is green text" + RESET);
        System.out.println(YELLOW + "This is yellow text" + RESET);
        System.out.println(BLUE + "This is blue text" + RESET);
        System.out.println(MAGENTA + "This is magenta text" + RESET);
        System.out.println(CYAN + "This is cyan text" + RESET);
        System.out.println(WHITE + "This is white text" + RESET);

        // Print text with colored background
        System.out.println(RED_BACKGROUND + "This has a red background" + RESET);
        System.out.println(GREEN_BACKGROUND + "This has a green background" + RESET);

        // Combining styles
        System.out.println("\033[1m" + RED + "Bold and red text" + RESET);
    }
}

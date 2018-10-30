import array.SimpleSummater;
/**
 * Main application entry point
 */
public final class Main {
    private Main() {
    }
    /**
     * here's going on main job of summater
     * @param args - console arguments
     */
    public static void main(final String[] args) {
        SimpleSummater summater = new SimpleSummater();
        final int[] array = {10, 20, 1, 25};
        System.out.println(summater.sum(array));
    }
}
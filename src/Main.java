/**
 * This is our is 247 Project
 * <p>
 * Graphics objects which are provided as arguments to the paint
 * and update methods of Components are automatically disposed
 * by the system when those methods return.  Programmers should,
 * for efficiency, call the dispose method when finished using
 * a Graphics object only if it was created directly from a
 * Component or another Graphics object.
 *
 * @see       #create(int, int, int, int)
 * @see       #finalize()
 * @see       Component#getGraphics()
 * @see       Component#paint(Graphics)
 * @see       Component#update(Graphics)
 * @since     1.0
 */


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
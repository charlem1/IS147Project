/**
 * Dispose of the system resources used by this graphics context.
 * The Graphics context cannot be used after being disposed of.
 * While the finalization process of the garbage collector will
 * also dispose of the same system resources, due to the number
 * of Graphics objects that can be created in short time frames
 * it is preferable to manually free the associated resources
 * using this method rather than to rely on a finalization
 * process which may not happen for a long period of time.
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
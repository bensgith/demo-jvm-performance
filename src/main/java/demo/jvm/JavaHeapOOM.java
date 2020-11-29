package demo.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * Java Heap OOM demo
 * VM Options: -Xmx5M
 *
 * @author Benjamin L
 */
public class JavaHeapOOM {

    static final byte[] data = new byte[1024 * 1024];

    public static void main(String[] args) {
        List<JavaHeapOOM> list = new ArrayList<JavaHeapOOM>();
        while (true) {
            list.add(new JavaHeapOOM());
        }
    }
}

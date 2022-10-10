import java.util.ArrayList;
import java.util.List;

import java.awt.Image;
import java.awt.Toolkit;

/**
 * ゲーム内の様々な画像を管理するメゾット群
 */
public class ImageManager {

    private static List<Image> images = new ArrayList<>();

    public static void imageLoad(String path) {
       images.add(Toolkit.getDefaultToolkit().getImage(path));
    }
    public static void imageLoad(String[] paths) {
        for (String path : paths) {
            images.add(Toolkit.getDefaultToolkit().getImage(path));
        }
    }
    public static Image getImage(int index) {
        return images.get(index);
    }
}

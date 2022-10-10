import java.util.ArrayList;
import java.util.List;

import java.awt.Image;
import java.awt.Toolkit;

/**
 * ゲーム内の様々な画像を管理するメゾット群
 */
public class ImageManager {
    /**
     * 画像を格納するリスト
     */
    private static List<Image> images = new ArrayList<>();

    /**
     * 指定されたパスの画像を読み込み格納する
     */
    public static void imageLoad(String path) {
       images.add(Toolkit.getDefaultToolkit().getImage(path));
    }
    /**
     * 指定されたパス(複数)の画像を読み込み格納する
     */
    public static void imageLoad(String[] paths) {
        for (String path : paths) {
            images.add(Toolkit.getDefaultToolkit().getImage(path));
        }
    }
    /**
     * 格納された順番を指定してその時の画像を返す
     */
    public static Image getImage(int index) {
        return images.get(index);
    }

    private ImageManager(){}
}

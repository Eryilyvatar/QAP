package guru.qa.io;

import javax.swing.*;

public interface View {
    ClassLoader CLASS_LOADER = View.class.getClassLoader();
    String APP_NAME = "QAP";
    Icon DEER_ICON = new ImageIcon(CLASS_LOADER.getResource("icon/deer.png"));
    Icon SANTA_ICON = new ImageIcon(CLASS_LOADER.getResource("icon/sad_santa.png"));
}

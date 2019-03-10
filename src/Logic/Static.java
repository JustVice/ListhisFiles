package Logic;

import java.awt.Image;
import java.awt.Toolkit;

public class Static {

    public static String program_name = "ListhisFiles", version = "Beta 0.3";
    public static String folderForDataName = "ListhisFiles";
    public static String globalFolderForData = "Just Vice";
    public static String DataPath = System.getenv("APPDATA") + "\\" + globalFolderForData + "\\" + folderForDataName + "\\UserData.txt";
    public static String DataFolderPath = System.getenv("APPDATA") + "\\" + globalFolderForData + "\\" + folderForDataName;
    public static String txt_file_with_results = "ListhisFiles results";
    public static String mother_path = System.getProperty("user.dir");
    public static Data data = new Data();
    public static Run run;

    public static Image getIconImage() {
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("IMG/iconLogo.png"));
    }

}

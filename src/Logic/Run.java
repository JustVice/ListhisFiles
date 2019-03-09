package Logic;

import UI.DefaultFrame;
import UI.Test_room;
import java.io.File;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Run {

    public Run() {
        normalRun();
    }

    private void normalRun() {
        Static.data.LoadData();
        DefaultFrame df = new DefaultFrame();
        df.setVisible(true);
    }
    
    private void openTestRoom(){
    Test_room test_room = new Test_room();
    }
    
    public static void BuildTxtFile(String path, String txtFileName, String extension, String content) {
        /*"\r\n" to jump between lines*/
        System.out.print("writing...");
        File file;
        if (!path.equals("here")) {
            file = new File(path + "\\" + txtFileName + extension);
        } else {
            file = new File(System.getProperty("user.dir") + "\\" + txtFileName + extension);
        }
        try {
            String frase = content;
            if (frase.equals("")) {
                frase = "No content.";
            }
            FileWriter escritura = new FileWriter(file.getPath());
            for (int i = 0; i < frase.length(); i++) {
                escritura.write(frase.charAt(i));
            }
            System.out.println("done");
            escritura.close();
        } catch (Exception ex) {
            System.out.println("Error\n" + ex);
        }
    }

}

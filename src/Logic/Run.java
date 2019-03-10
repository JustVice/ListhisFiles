package Logic;

import UI.DefaultFrame;
import UI.Test_room;
import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

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
    
        public static void openFile(String file_path) {
        try {
            Desktop.getDesktop().open(new File(file_path));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
        
        /**
     * 0=Error 1=Message 2=Alert 3=What
     *
     * @param type
     * @param message
     * @param title
     */
    public void message(String message, String title, int type) {
        switch (type) {
            case 0:/*Error*/
                JOptionPane.showMessageDialog(null, message, title, 0);
                break;
            case 1:/*Message*/
                JOptionPane.showMessageDialog(null, message, title, 1);
                break;
            case 2:/*Alert*/
                JOptionPane.showMessageDialog(null, message, title, 2);
                break;
            case 3:/*What*/
                JOptionPane.showMessageDialog(null, message, title, 3);
                break;

            default:
                throw new AssertionError();
        }
    }

}

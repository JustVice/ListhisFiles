package Logic;

import java.io.File;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadFiles {

    private String render_text = "";

    public ReadFiles(String path, boolean files, boolean dirs, boolean normal_txt) {
        File file = new File(path);
        String[] files_list = file.list();
        for (int i = 0; i < files_list.length; i++) {
            if (files && dirs) {
                render_text += files_list[i] + "\n";
            }
            if (files && !dirs) {
                render_text += files_list[i] + "\n";
            }
        }
        BuildTxtFile("here", "ListhisFiles results", ".txt", render_text);
    }

    public void BuildTxtFile(String path, String txtFileName, String extension, String content) {
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

    private boolean is_there_a_dot(String text) {
        StringBuilder sb = new StringBuilder(text);
        while (sb.length() != 0) {
            if (sb.charAt(0) == '.') {
                return true;
            } else {
                sb.deleteCharAt(0);
            }
        }
        return false;
    }

}

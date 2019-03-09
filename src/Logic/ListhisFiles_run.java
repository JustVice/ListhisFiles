package Logic;

import java.io.File;
import java.util.LinkedList;

public class ListhisFiles_run {

    private String render_text = "";
    private LinkedList<String> list_ready = new LinkedList<String>();

    public ListhisFiles_run(boolean files, boolean dirs, boolean normal_txt) {
        File file = new File(Static.mother_path);
        String[] raw_list_of_names = file.list();

        if (files && dirs) {
            for (int i = 0; i < raw_list_of_names.length; i++) {
                list_ready.add(raw_list_of_names[i]);
            }
        }

        if (files && !dirs) {
            String path_review = "";
            for (int i = 0; i < 10; i++) {
                path_review = System.getProperty("user.dir") + "\\" + raw_list_of_names[i];
                File file_review = new File(path_review);
                if (file_review.isFile()) {
                    //System.out.println("File name: " + raw_list_of_names[i]);
                    list_ready.add(raw_list_of_names[i]);
                }
            }
        }

        if (!files && dirs) {
            String path_review = "";
            for (int i = 0; i < 10; i++) {
                path_review = System.getProperty("user.dir") + "\\" + raw_list_of_names[i];
                File file_review = new File(path_review);
                if (file_review.isDirectory()) {
                    //System.out.println("Dir name: " + raw_list_of_names[i]);
                    list_ready.add(raw_list_of_names[i]);
                }
            }
        }

        for (int i = 0; i < list_ready.size(); i++) {
            if (list_ready.get(i) != Static.txt_file_with_results + ".txt" && list_ready.get(i) != Static.program_name + ".jar") {
                list_ready.remove(i);
            }
        }

        Static.run.BuildTxtFile(Static.mother_path, Static.txt_file_with_results, ".txt", renderText_builder(normal_txt));
    }

    private String renderText_builder(boolean normal_txt) {
        for (int i = 0; i < list_ready.size(); i++) {
            render_text += list_ready.get(i) + spacing(normal_txt);
        }
        return render_text;
    }

    public void run(String path, boolean files, boolean dirs, boolean normal_txt) {
        File file = new File("");
        String[] files_list = file.list();
        String spacing = spacing(true);
        for (int i = 0; i < files_list.length; i++) {

        }
        Static.run.BuildTxtFile("here", "ListhisFiles results", ".txt", render_text);
    }

    private String spacing(boolean normal_text) {
        //Gives the proper spacing that a normal notepad or notepad++ needs.
        if (normal_text) {
            return "\n\n";
        } else {
            return "\n";
        }
    }

    private boolean is_there_a_dot(String text) {
        //DEPRECATED METHOD.
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

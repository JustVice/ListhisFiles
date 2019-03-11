package Logic;

import java.io.File;
import java.util.LinkedList;

public class ListhisFiles_run {

    private String render_text = "";
    private LinkedList<String> list_ready = new LinkedList<String>();

    //<editor-fold desc="Construcctor Run">
    public ListhisFiles_run(boolean files, boolean dirs, boolean normal_txt, boolean open_file_after_buildTxtFile) {
        File file = new File(Static.mother_path);
        String[] raw_list_of_names = file.list();

        if (files && dirs) {
            System.out.println("Files and dirs");
            for (int i = 0; i < raw_list_of_names.length; i++) {
                list_ready.add(raw_list_of_names[i]);
            }
        }

        if (files && !dirs) {
            System.out.println("Just files selected");
            String path_review = "";
            for (int i = 0; i < raw_list_of_names.length; i++) {
                path_review = System.getProperty("user.dir") + "\\" + raw_list_of_names[i];
                File file_review = new File(path_review);
                if (file_review.isFile()) {
                    //System.out.println("File name: " + raw_list_of_names[i]);
                    list_ready.add(raw_list_of_names[i]);
                }
            }
        }

        if (!files && dirs) {
            System.out.println("Just dirs selected");
            String path_review = "";
            for (int i = 0; i < raw_list_of_names.length; i++) {
                path_review = System.getProperty("user.dir") + "\\" + raw_list_of_names[i];
                File file_review = new File(path_review);
                if (file_review.isDirectory()) {
                    //System.out.println("Dir name: " + raw_list_of_names[i]);
                    list_ready.add(raw_list_of_names[i]);
                }
            }
        }

            //System.out.println("lorem 2: " + Static.program_name + ".jar");
            for (int i = 0; i < list_ready.size(); i++) {
                System.out.println("testing: " + list_ready.get(i));
                //System.out.println("Lorem: "+ Static.txt_file_with_results + ".txt");
                if (list_ready.get(i).equals(Static.txt_file_with_results + ".txt")) {
                    //Static.run.message("remove", "remove", 1);
                    System.out.println("remove");
                    list_ready.remove(i);
                }
                if (list_ready.get(i).equals(Static.program_name + ".jar")) {
                    //Static.run.message("remove", "remove", 1);
                    System.out.println("remove");
                    list_ready.remove(i);
                }
            }
        
        Static.run.BuildTxtFile(Static.mother_path, Static.txt_file_with_results, ".txt", renderText_builder(normal_txt));
        if (open_file_after_buildTxtFile) {
            Static.run.openFile(Static.mother_path + "//" + Static.txt_file_with_results + ".txt");
        }
    }

    //</editor-fold>
    //<editor-fold desc="Methods">
    private String renderText_builder(boolean normal_txt) {
        for (int i = 0; i < list_ready.size(); i++) {
            if (i + 1 != list_ready.size()) {
                render_text += list_ready.get(i) + "\r\n";
            } else {
                render_text += list_ready.get(i);
            }
        }
        return render_text;
    }
    //</editor-fold>

    //<editor-fold desc="Deprecated code">
    private String spacing(boolean normal_text) {
        //Gives the proper spacing that a normal notepad or notepad++ needs.
        if (normal_text) {
            return "\r\n";
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

    public void run(String path, boolean files, boolean dirs, boolean normal_txt) {
        File file = new File("");
        String[] files_list = file.list();
        String spacing = spacing(true);
        for (int i = 0; i < files_list.length; i++) {

        }
        Static.run.BuildTxtFile("here", "ListhisFiles results", ".txt", render_text);
    }

    //</editor-fold>
}

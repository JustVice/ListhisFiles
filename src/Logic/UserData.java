package Logic;

import java.io.Serializable;

public class UserData implements Serializable {

    private static final long serialVersionUID = 3934850892384098147L;

    public Boolean print_for_normal = true, print_for_notepad = false, open_file_aften_run = true, scan_files = true, _scan_folders = false;

    public UserData() {
    }

    //<editor-fold desc="GET AND SET">
    public Boolean getPrint_for_normal() {
        return print_for_normal;
    }

    public void setPrint_for_normal(Boolean print_for_normal) {
        this.print_for_normal = print_for_normal;
    }

    public Boolean getPrint_for_notepad() {
        return print_for_notepad;
    }

    public void setPrint_for_notepad(Boolean print_for_notepad) {
        this.print_for_notepad = print_for_notepad;
    }

    public Boolean getOpen_file_aften_run() {
        return open_file_aften_run;
    }

    public void setOpen_file_aften_run(Boolean open_file_aften_run) {
        this.open_file_aften_run = open_file_aften_run;
    }

    public Boolean getScan_files() {
        return scan_files;
    }

    public void setScan_files(Boolean scan_files) {
        this.scan_files = scan_files;
    }

    public Boolean getScan_folders() {
        return _scan_folders;
    }

    public void setScan_folders(Boolean _scan_folders) {
        this._scan_folders = _scan_folders;
    }

    //</editor-fold>

}

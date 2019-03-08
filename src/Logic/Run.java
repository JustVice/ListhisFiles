package Logic;

import UI.DefaultFrame;

public class Run {

    public Run() {
        Static.data.LoadData();
        openDefaultFrame();
    }

    private void openDefaultFrame() {
        DefaultFrame df = new DefaultFrame();
        df.setVisible(true);
    }

}

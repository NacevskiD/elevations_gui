import java.util.ArrayList;

/**
 * Created by we4954cp on 11/9/2016.
 */
public class Controller {

    static GUI gui;
    static DB db;

    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.startApp();

    }

    private void startApp() {

        db = new DB();
        db.createTable();
        ArrayList<String> allData = db.fetchAllRecords();
        gui = new GUI(this);
        gui.setListData(allData);
    }


    ArrayList<String> getAllData() {
        return db.fetchAllRecords();
    }

    void addRecordToDatabase(String placename, double elevation) {
        db.addRecord(placename, elevation);
    }

}

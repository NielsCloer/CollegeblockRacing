module com.example.collegeblock_racing {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.collegeblock_racing to javafx.fxml;
    exports com.example.collegeblock_racing;
}
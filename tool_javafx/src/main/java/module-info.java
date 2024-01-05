module com.ferryman.tool_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ferryman.tool_javafx to javafx.fxml;
    exports com.ferryman.tool_javafx;
}
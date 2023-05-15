module com.qqw.rc_car_4g {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.qqw.rc_car_4g to javafx.fxml;
    exports com.qqw.rc_car_4g;
}
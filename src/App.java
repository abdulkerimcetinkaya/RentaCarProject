import core.Db;
import core.Helper;
import java.sql.Connection;
import view.LoginView;

public class App {
    public static void main(String[] args) {
        Helper.setTheme();
        try {
            // Test veritabanı bağlantısı
            Connection conn = Db.getInstance();
            // Login ekranını aç
            LoginView loginView = new LoginView();
        } catch (RuntimeException e) {
            Helper.showMsg("Sistem başlatılamadı: " + e.getMessage());
        }
    }
}

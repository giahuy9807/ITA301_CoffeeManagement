package dao;

import dal.DBContext;
import java.sql.*;
import model.User;

public class UserDAO extends DBContext {

    public User login(String email, String password) {

        String sql = """
                SELECT u.UserID, u.FullName, u.Email, s.Value AS RoleName
                FROM [User] u
                JOIN Setting s ON u.RoleID = s.SettingID
                WHERE u.Email=? AND u.PasswordHash=? 
                AND u.IsActive=1 AND s.Type='Role'
                """;

        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new User(
                        rs.getInt("UserID"),
                        rs.getString("FullName"),
                        rs.getString("Email"),
                        rs.getString("RoleName")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}

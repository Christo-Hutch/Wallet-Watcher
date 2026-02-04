package com.walletwatcher.infrastructure.persistence.database;

import com.walletwatcher.core.domain.Account;
import com.walletwatcher.core.ports.output.AccountRepository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlAccountRepository implements AccountRepository{
    private static final String URL = "jdbc:sqlite:com/walletwatcher/infrastructure/persistence/database/WalletWatcher.db";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            System.out.println("SQLite Driver not found on classpath!");
        }
        
        return DriverManager.getConnection(URL);
    }

    public static void initialiseDatabase() {
        String currentAccountTable = "CREATE TABLE IF NOT EXISTS current_accounts (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name TEXT NOT NULL," +
                "desc TEXT NOT NULL," +
                "balanceInPence INTEGER NOT NULL);";

        try (Connection conn = getConnection(); Statement stmt = conn.createStatement()) {
            stmt.execute(currentAccountTable);
            System.out.println("Database initialised and 'Current Account' table created.");
        } catch (SQLException e) {
            System.err.println("Database initialisation failed: " + e.getMessage());
        }
    }
    
    @Override
    public void save(Account account) {
        // Code for inserting account data here
        System.out.println("Saving account to SQL database: " + account.getAccountName());
    }
}
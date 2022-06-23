import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("tutdb","postgres","1234");

        //db.createTable(conn, "employee");
        //db.insert_row(conn, "employee", "Basil", "Antartics");
        //db.insert_row(conn, "employee", "Ric", "Narnia");

        //db.update_name(conn, "employee", "Ric", "RicFazeres");

        //db.search_by_name(conn, "employee", "Basil");
        //db.search_by_id(conn, "employee", 2);

        //db.delete_row_by_name(conn, "employee", "RicFazeres");
        //db.delete_row_by_id(conn, "employee", 4);

        //db.read_data(conn, "employee");

        //db.createTable(conn, "sol");
        //db.insert_row(conn, "sol", "Ric", "Antartics");
        //db.read_data(conn, "sol");

        //db.delete_table(conn, "sol");
    }
}

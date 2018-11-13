package delizia.Controler;

import delizia.Model.ConnectDB;
import delizia.View.ViewDeliziaPanel;
import delizia.View.ViewDeliziaReservation;
import delizia.View.ViewDeliziaConsumo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DeliziaRegister {

    //For Query in the actions of the database
    public static ResultSet rs;
    public static PreparedStatement ps;

    //For the table
    public static DefaultTableModel mimodel;

    //Action Clear input of the form
    public static void clear() {
        ViewDeliziaReservation.inputHours.setSelectedIndex(0);
        ViewDeliziaReservation.inputEvent.setText(null);
        ViewDeliziaReservation.inputNit.setText(null);
        ViewDeliziaReservation.inputName.setText(null);
        ViewDeliziaReservation.inputNumPersons.setText(null);
        ViewDeliziaReservation.inputNumTable.setValue(1);
    }

    //Action save register in database
    public static void saveReservation() {
        Connection con = null;
        try {
            con = ConnectDB.connect();
            ps = con.prepareStatement("INSERT INTO reservations(name, num_person, consumo_asigned, table_asigned) VALUES (?, ?, ?, ?)");
            ps.setString(5, ViewDeliziaReservation.inputName.getText());
            ps.setInt(6, Integer.parseInt(ViewDeliziaReservation.inputNumPersons.getText()));
            ps.setInt(4, Integer.parseInt(ViewDeliziaReservation.inputNit.getText()));
            ps.setString(2, ViewDeliziaReservation.inputHours.getSelectedItem().toString());
            ps.setString(3, ViewDeliziaReservation.inputEvent.getText());
            
            ps.setInt(7, Integer.parseInt(ViewDeliziaReservation.inputNumTable.getValue().toString()));
            ps.setInt(8, ViewDeliziaReservation.consumo);

            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Reservación Realizada");
                clear();

                //For Date
                java.util.Date date = new java.util.Date();
                DateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd");
                Date filter_date = Date.valueOf(dateFormat.format(date));
                table(filter_date, "");
            } else {
                JOptionPane.showMessageDialog(null, "Erro al Reservación Realizada");
                clear();
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void table(Date filter_date, String filter_name) {
        try {
            String[] titulos = {"ID", "NOMBRE", "N.PERSONAS", "MESA", "CONSUMO"};
            String[] registros = new String[5];
            mimodel = new DefaultTableModel(null, titulos);
            Connection miConeccion = ConnectDB.connect();
            String sql;
            sql = "SELECT reservations.id_rev, reservations.name, reservations.num_person, reservations.table_asigned, consumo.total_cost FROM reservations, consumo WHERE (reservations.id_rev = consumo.id_cons) AND (reservations.name LIKE '%" + filter_name + "%')";
            PreparedStatement miStatement = miConeccion.prepareStatement(sql);
            ResultSet miResultset = miStatement.executeQuery(sql);
            while (miResultset.next()) {
                registros[0] = miResultset.getString("id_rev");
                registros[1] = miResultset.getString("name");
                registros[2] = miResultset.getString("num_person");
                registros[3] = miResultset.getString("table_asigned");
                registros[4] = miResultset.getString("total_cost");
                mimodel.addRow(registros);
            }
            ViewDeliziaPanel.table_view_register.setModel(mimodel);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void consutTable(Date filter_date, int numTable) {
        try {
            Connection miConeccion = ConnectDB.connect();
            String sql = "";
            sql = "SELECT consumo, nombre FROM reservaciones WHERE( fecha ='" + filter_date + "') AND (no_mesa LIKE '%" + numTable + "%')";
            ps = miConeccion.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                ViewDeliziaConsumo.label_Succes.setVisible(true);
                ViewDeliziaConsumo.label_Danger.setVisible(false);
                ViewDeliziaConsumo.backgroundLabel_Succes.setVisible(true);
                ViewDeliziaConsumo.backgroundLabel_Danger.setVisible(false);
                ViewDeliziaConsumo.label_Name.setText(rs.getString("nombre"));
                ViewDeliziaConsumo.inputConsumoC.setEnabled(true);
                ViewDeliziaConsumo.btn_addConsumo.setEnabled(true);
            } else {
                ViewDeliziaConsumo.label_Succes.setVisible(false);
                ViewDeliziaConsumo.label_Danger.setVisible(true);
                ViewDeliziaConsumo.backgroundLabel_Succes.setVisible(false);
                ViewDeliziaConsumo.backgroundLabel_Danger.setVisible(true);
                ViewDeliziaConsumo.label_Name.setText("- - - - - - - - - - - - - - - - - ");
                ViewDeliziaConsumo.inputConsumoC.setEnabled(false);
                ViewDeliziaConsumo.btn_addConsumo.setEnabled(false);
            }
            miConeccion.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void updateConsumo(int numTable) {
        try {
            Connection miConeccion = ConnectDB.connect();
            String sqlSelect;
            sqlSelect = "SELECT consumo FROM reservaciones";
            ps = miConeccion.prepareStatement(sqlSelect);
            String sqlUpdate;
            sqlUpdate = "UPDATE reservaciones SET  consumo=? where no_mesa LIKE '%" + numTable + "%'";
            ps = miConeccion.prepareStatement(sqlUpdate);
            int respuesta = ps.executeUpdate();

            int firstConsumo = Integer.parseInt(rs.getString("consumo"));
            int secondConsumo = Integer.parseInt(ViewDeliziaConsumo.inputConsumoC.getText());
            int newConsumo = firstConsumo + secondConsumo;
            System.out.println(newConsumo);

            ps.setInt(1, newConsumo);
            ps.setInt(2, Integer.parseInt(ViewDeliziaConsumo.inputTableC.getText()));

            if (respuesta > 0) {
                ViewDeliziaConsumo.label_Succes.setVisible(true);
                ViewDeliziaConsumo.backgroundLabel_Succes.setVisible(true);
                ViewDeliziaConsumo.label_Succes.setText("Actualizado nuevo consumo!");

                ViewDeliziaConsumo.label_Danger.setVisible(false);
                ViewDeliziaConsumo.backgroundLabel_Danger.setVisible(false);
            } else {
                ViewDeliziaConsumo.label_Danger.setText("Consumo no actualizado!");
                ViewDeliziaConsumo.label_Danger.setVisible(true);
                ViewDeliziaConsumo.backgroundLabel_Danger.setVisible(true);

                ViewDeliziaConsumo.label_Succes.setVisible(false);
                ViewDeliziaConsumo.backgroundLabel_Succes.setVisible(false);
            }

            miConeccion.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

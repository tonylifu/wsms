package wsms.com.data;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import com.mysql.jdbc.PreparedStatement;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;

public class PrintReport extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	java.sql.Connection conn = SQLConnection.DbConnector();
	PreparedStatement pat = null;
	ResultSet rs = null;
	
	public PrintReport() throws HeadlessException{
		
	}
	
	public void showReport(String report) {

		try {
			JasperReport jasperReport = JasperCompileManager.compileReport(report);
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, conn);
			JRViewer viewer = new JRViewer(jasperPrint);
			viewer.setOpaque(true);
			viewer.setVisible(true);
			
			this.add(viewer);
			
			this.setSize(900, 500);
			this.setVisible(true);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(rootPane, e.getMessage());
		}
	}
	
}

package wsms.com.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import wsms.com.entity.StudentPayments;

public class TotalPaymentDueBulkUpdate extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@FXML private TextField bulkTotalPayDue;
	@FXML private Button returnTotalBulkPayout;
	
	@FXML public void bulkSetTotalPayDueForAll(ActionEvent event) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory
				("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		CriteriaBuilder cb = emfactory.getCriteriaBuilder();
		CriteriaUpdate<StudentPayments> crit = cb.createCriteriaUpdate(StudentPayments.class);
		Root<StudentPayments> payments = crit.from(StudentPayments.class);
		crit.set(payments.get("totalPaymentDue"), Double.parseDouble(bulkTotalPayDue.getText()));
		Predicate pb = cb.equal(payments.get("paymentBy"), "Admin");
		//Predicate pb2 = cb.equal(payments.get("paymentBy"), null);
		Predicate pb3 = cb.equal(payments.get("paymentBy"), "");
		crit.where(cb.or(pb,pb3));
		Query query = entitymanager.createQuery(crit);
		query.executeUpdate();
		
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			primaryStage.setTitle("Student Payment Details");
			GridPane borderPane = (GridPane)FXMLLoader.load(getClass().getResource("bulkTotalPayDue.fxml"));
			Scene scene = new Scene(borderPane,600,400);
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}

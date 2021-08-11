package wsms.com.controller;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.print.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class HelloWorldPrinter implements Printable, ActionListener {
	
	String tid, acct, name, stdClass, amt, date, balance, description, payType;
	
	public HelloWorldPrinter(String tid, String acct, String name, String stdClass, String amt, 
			String date, String balance, String description, String payType) {
		this.tid = tid;
		this.acct = acct;
		this.name = name;
		this.stdClass = stdClass;
		this.amt = amt;
		this.date = date;
		this.balance = balance;
		this.description = description;
		this.payType = payType;
	}


    public int print(Graphics g, PageFormat pf, int page) throws PrinterException {

        if (page > 0) { /* We have only one page, and 'page' is zero-based */
            return NO_SUCH_PAGE;
        }

        /* User (0,0) is typically outside the imageable area, so we must
         * translate by the X and Y values in the PageFormat to avoid clipping
         */
        Graphics2D g2d = (Graphics2D)g;
        //g2d.translate(pf., pf.getHeight());
        g2d.translate(pf.getImageableX(), pf.getImageableY());

        /* Now we perform our rendering */
        File file = new File("C:\\images\\kusaki.jpg");
        FileInputStream imgStream = null;
		try {
			imgStream = new FileInputStream(file.getAbsolutePath());
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        //Image img = new Image(imgStream);
        BufferedImage img = null;
        try {
        	img = ImageIO.read(imgStream);
        }
        catch(IOException e) {
        	e.printStackTrace();
        }
        
        //barcode image
        File fileBarcode = new File("C:\\BarCode\\receipt\\barcode.png");
        FileInputStream imgStream2 = null;
		try {
			imgStream2 = new FileInputStream(fileBarcode.getAbsolutePath());
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        //Image img = new Image(imgStream);
        BufferedImage img2 = null;
        try {
        	img2 = ImageIO.read(imgStream2);
        }
        catch(IOException e) {
        	e.printStackTrace();
        }
       
        //g.setColor(Color.BLACK.darker());
        
        g.drawImage(img, 1, 5, 40, 40, null);
        
        g.drawLine(1, 55, 200, 55);
        
        g.drawString("KUSAKI COLLEGE YANDEV", 46, 30);
        
        g.drawString("Date: "+ this.date, 1, 80);
        
        g.drawString("TID: "+this.tid, 1, 110);
        
        g.drawString("Student ID: "+this.acct, 1, 140);
        
        g.drawString("Name: "+this.name, 1, 170);
        
        g.drawString("Class: "+this.stdClass, 1, 200);
        
        g.drawString("Description: "+this.description, 1, 230);
        
        g.drawString("Amount Paid: "+this.amt, 1, 260);
        
        g.drawString("Balance: "+this.balance, 1, 290);
        
        g.drawString("Payment Mode: "+this.payType, 1, 320);
        
       // g.drawLine(10, 300, 266, 300);
       // g.fillRect(1, 340, 200, 10);
        
        g.drawImage(img2, 1, 340, 140, 20, null);

        /* tell the caller that this page is part of the printed document */
        return PAGE_EXISTS;
    }

    public void actionPerformed(ActionEvent e) {
         PrinterJob job = PrinterJob.getPrinterJob();
         job.setPrintable(this);
         boolean ok = job.printDialog();
         if (ok) {
             try {
                  job.print();
                  
             } catch (PrinterException ex) {
              /* The job did not successfully complete */
             }
         }
    }

//    public static void main(String args[]) {
//
//        UIManager.put("swing.boldMetal", Boolean.FALSE);
//        JFrame f = new JFrame("Receipt Printer");
//        f.addWindowListener(new WindowAdapter() {
//           public void windowClosing(WindowEvent e) {System.exit(0);}
//        });
//        JButton printButton = new JButton("Click HERE to Print Receipt");
//        printButton.addActionListener(new HelloWorldPrinter());
//        f.add("Center", printButton);
//        f.pack();
//        f.setVisible(true);
//    }
}
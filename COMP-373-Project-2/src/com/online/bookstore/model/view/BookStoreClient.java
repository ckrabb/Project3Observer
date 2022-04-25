package com.online.bookstore.model.view;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.online.bookstore.model.customer.Address;
import com.online.bookstore.model.customer.Customer;
import com.online.bookstore.model.order.Order;
import com.online.bookstore.model.order.OrderDetail;
import com.online.bookstore.model.product.Book;
import com.online.bookstore.model.service.CustomerService;
//
import com.online.bookstore.model.payment.Payment;
//

public class BookStoreClient {
			
		public static void main (String args[]) throws Exception {
			System.out.println("***************** Application Context instantiated! ******************");
	        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
	        System.out.println("***************** Application Context instantiated! ******************");

	        //Spring to inject the right object implementation in CustomerService for customer using Setter Injection
	        //Also, bootstrapping the CustomerService instantiation using factory
	        CustomerService customerService = (CustomerService) context.getBean("customerService");
	     
	        Customer customer = customerService.getCustomer();
			customer.setFirstName("Michael");
	        customer.setLastName("Gerard");
	        customer.setCustomerId("AY2345");
	        
	        //Spring to inject the right object implementation in Customer object for BillingAddress using Setter Injection
	        Address billingAddress = customer.getBillingAddress();
	        
	        billingAddress.setStreet("500 West Madison St.");
	        billingAddress.setUnit("Suite 1000");
	        billingAddress.setCity("Chicago");
	        billingAddress.setState("IL");
	        billingAddress.setZip("66610");	               
	        
	        /**********************************************************************/
	        //Bootstrapping the Order instantiation using factory
	        Order order1 = (Order) context.getBean("order");
	        
	        order1.setOrderId("XX-66734");

	        //Associate the order with the customer
	        customer.addOrder(order1);
	        
	        //order detail contains products ordered
	        OrderDetail orderDetail1 = (OrderDetail) context.getBean("orderDetail");
	        //First product
	        Book product1 = orderDetail1.getBook();
			product1.setId("BF-7898");
	        product1.setISBN("234-89675-27690");
	        product1.setTitle("Patterns of Enterprise Application Architecture");
	        product1.setAuthor("Folwer, Martin");
	        product1.setPrice(50.99);
	        orderDetail1.setQuantity(1);
	        //Add product to order
	        order1.addProduct(orderDetail1);
	        
	        //Second order detail
	        OrderDetail orderDetail2 = (OrderDetail) context.getBean("orderDetail");
	        //Second product
	        Book product2 = orderDetail2.getBook();
	        product2.setId("BF-2345");
	        product2.setISBN("892-12345-93667");
	        product2.setTitle("Web Application Architecture");
	        product2.setAuthor("Shklar, Leon");
	        product2.setPrice(45.99);
	        orderDetail2.setQuantity(1);
	        //Add product to order
	        order1.addProduct(orderDetail2);

			//Add Payment ID, Card Info, Date
			Payment payment1 = order1.getPayment();
			payment1.setPaymentID("615123");
			payment1.setPaymentCardNumber("XXXX-XXXX-XXXX-9041");
			payment1.setPaymentCardType("American Express");
			payment1.setPaymentDate("03-24-2022");

	        //finish order	        
	        order1.confirmOrder();
	        order1.orderPayed();
	        
	        // NOTE: To cancel the request, un-comment the following line.
	        //order.cancel(); Then, comment out the next 2 lines.
	        order1.orderSendOut();
	        order1.orderDelivered();

	        
	        // Print out an order summary
        	System.out.println("\tCustomer Name: \t\t\t" + customer.getFirstName() + " " + customer.getLastName() + "\n");
        	System.out.println("\tBilling Address:\t" + customer.getBillingAddress().getStreet() + 
        		"\n\t\t\t\t" + customer.getBillingAddress().getUnit() + 
        		"\n\t\t\t\t" + customer.getBillingAddress().getCity() + ", " + 
        		customer.getBillingAddress().getState() + " " + customer.getBillingAddress().getZip() +
        		"\n");
	        List<Order> orders = customer.getOrders();
	        for (Order order : orders) {        
	        	// Format order output
	        	System.out.println("\n\t" +"+++++++++++++++++++++++++++++++++");
	        	System.out.println("\tOrder Id: \t\t" + order.getOrderId() + "\n");
	        	System.out.println("\tOrder status: \t\t" + order.getOrderState() + "\n");

	        	System.out.println("\tOrder Items: ");
	        	List<OrderDetail> orderLines = order.getOrderDetails();
	        	for (OrderDetail line : orderLines) {
	        		System.out.println("\t\t\t\t" + line.getBook().getTitle() + "\t" + 
	        			line.getBook().getPrice() + " x " + line.getQuantity());
	        	}
	        	double orderTotal = order.getOrderTotal();
		        System.out.println("\n\tOrder Total:\t\t" + orderTotal);
				System.out.println("\n\t" +"+++++++++++++++++++++++++++++++++");

				//Print Payment information: ID, Card info, and Card Type, Payment Date
				System.out.println("\n\tPayment ID:\t\t" + order.getPayment().getPaymentID());
				System.out.println("\n\tPayment Date:\t\t" + order.getPayment().getPaymentDate());
				System.out.println("\n\tPayment Credit Card Type:\t\t" + order.getPayment().getPaymentCardType());
				System.out.println("\n\tPayment Credit Card Number:\t\t" + order.getPayment().getPaymentCardNumber());
			}
		}


}

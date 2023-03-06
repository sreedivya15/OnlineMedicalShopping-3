package com.medical.service;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import com.medical.entity.Order;
import com.medical.repository.OrderRepository;
@SpringBootTest
class OrderServiceImplTest {
    @Mock
	OrderRepository orderRepository;
	@InjectMocks
	OrderServiceImpl orderService;
     @Test
	//@Disabled
     @DisplayName(" add orders")
	void testinsertOrder()throws Exception{
	//given
	    Order sampleInput = new Order("dolo", "hemanth","23-01-2023", 1,"delivered");
		Order expectedOutput = new Order("dolo", "hemanth","23-02-2023", 1,"delivered");
		BDDMockito.given(orderService.insertOrder(sampleInput)).willReturn(expectedOutput);
		// when 
		Order actualOutput = orderService.insertOrder(sampleInput);
		 //verify 
		assertEquals(expectedOutput, actualOutput);
	}
	@Test
	//@Disabled
	@DisplayName("Get all orders")
	void testGetAllOrders() throws Exception {
		Order order1=new Order("dolo", "hemanth","23-01-2023", 1,"delivered");
		Order order2=new Order("dolo", "hemanth","23-01-2023", 1,"delivered");
		List<Order> sampleOutput = new ArrayList<>();
		sampleOutput.add(order1);
		sampleOutput.add(order2);
		BDDMockito.given(orderService.getAllOrders()).willReturn(sampleOutput);
		//when
		List<Order> actualOutput = orderService.getAllOrders();
		//verify
		assertEquals(sampleOutput,actualOutput);
		assertSame(sampleOutput.add(order1),actualOutput.add(order2));
	}
	@Test
	//@Disabled
	@DisplayName("update orders")
	void testUpdateOrderbyId() throws Exception {
	    //given
	 	    Order sampleInput = new Order("dolo", "hemanth","23-01-2023", 1,"delivered");
	 		Order expectedOutput = new Order("dolo", "hemanth","23-01-2023", 1,"delivered");
	 		BDDMockito.given(orderService.insertOrder(sampleInput)).willReturn(expectedOutput);
	 		// when 
	 		Order actualOutput = orderService.insertOrder(sampleInput);
	 		 //verify 
	 		assertEquals(expectedOutput, actualOutput);
	 	}
}
/*	@Test
	@Disabled
	void testDeleteOrderById() {
		fail("Not yet implemented");
	}
	@Test
	@Disabled
	void testGetAllOrdersByUserName() {
		fail("Not yet implemented");
	}
	
}
*/
	
package ru.demo.bankrupts;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.xml.ws.soap.SOAPFaultException;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ru.demo.bankrupts.soap.bindings.DebtorCodeType;
import ru.demo.bankrupts.soap.bindings.DebtorRegisterItem;

@SpringBootTest
class DemoApplicationTests {
	static final Logger log = LoggerFactory.getLogger(DemoApplicationTests.class);

	@Test
	void testWebService() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SoapConfig.class);
		ItemController controllerToTest = context.getBean(ItemController.class);

		DebtorRegisterItem debtorByIdBankrupt = controllerToTest.getDebtorByIdBankrupt(138895);
		log.info("debtorByIdBankrupt.getBankruptId=" + debtorByIdBankrupt.getBankruptId()); // http://127.0.0.1:8080/getDebtorByIdBankrupt/138895
		assertTrue(debtorByIdBankrupt.getBankruptId() == 138895);

		assertNotNull(controllerToTest.getArbitrManagerRegister(null));
		assertNotNull(controllerToTest.getCompanyTradeOrganizerRegister(null));
		assertNotNull(controllerToTest.getDebtorByIdBankrupt(138895));
		assertNotNull(controllerToTest.getDebtorMessagesContentForPeriodByIdBankrupt(0, null));
		assertNotNull(controllerToTest.getDebtorRegister(null));
		assertNotNull(controllerToTest.getDebtorReportsContentForPeriodByIdBankrupt(0, null));
		assertNotNull(controllerToTest.getDebtorsByLastPublicationPeriod("2020-08-01", "2020-08-02"));
		assertNotNull(controllerToTest.getMessageContent(1666740));
		assertNotNull(controllerToTest.getMessageIds("2020-08-01", "2020-08-02"));
		assertNotNull(controllerToTest.getSroRegister("2023-03-12"));
		assertNotNull(controllerToTest.getTradeMessageContent(4901487));
		assertNotNull(controllerToTest.getTradeMessages("2020-08-01", "2020-08-02"));
		assertNotNull(controllerToTest.searchDebtorByCode(DebtorCodeType.SNILS, "42603540444"));
		assertThrows(SOAPFaultException.class, () -> controllerToTest.getTradeMessagesByTrade("2020-08-01",
				"2020-08-02", "272E9D76FD3F47F0A225D41AA22CF4A1", ""));

		context.close();
	}

}

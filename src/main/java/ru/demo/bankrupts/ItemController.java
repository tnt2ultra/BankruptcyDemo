package ru.demo.bankrupts;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ru.demo.bankrupts.soap.bindings.AMList;
import ru.demo.bankrupts.soap.bindings.ArrayOfInt;
import ru.demo.bankrupts.soap.bindings.ArrayOfTradePlace;
import ru.demo.bankrupts.soap.bindings.DebtorCodeType;
import ru.demo.bankrupts.soap.bindings.DebtorList;
import ru.demo.bankrupts.soap.bindings.DebtorRegisterItem;
import ru.demo.bankrupts.soap.bindings.SROList;
import ru.demo.bankrupts.soap.bindings.TradeOrganizerList;

@RestController
public class ItemController {
	static final Logger log = LoggerFactory.getLogger(ItemController.class);

	@Autowired
	SoapClient soapClient;

	@GetMapping("/getDebtorMessagesContentForPeriodByIdBankrupt/{id}/{date}")
	public String getDebtorMessagesContentForPeriodByIdBankrupt(@PathVariable int id, @PathVariable String date) {
		log.info("getDebtorMessagesContentForPeriodByIdBankrupt id=" + id + " date=" + date);
		String response = soapClient.getDebtorMessagesContentForPeriodByIdBankrupt(id, asXMLGregorianCalendar(date));
		return "<xmp>" + response + "</xmp>";
	}

	@GetMapping("/getDebtorRegister/{date}")
	public DebtorList getDebtorRegister(@PathVariable String date) {
		log.info("getDebtorRegister date=" + date);
		DebtorList response = soapClient.getDebtorRegister(asXMLGregorianCalendar(date));
		return response;
	}

	@GetMapping("/getTradeMessagesByTrade/{dateStart}/{dateEnd}/{id}/{inn}")
	public ArrayOfTradePlace getTradeMessagesByTrade(@PathVariable String dateStart, @PathVariable String dateEnd,
			@PathVariable String id, @PathVariable String inn)
	{
		log.info(
				"getTradeMessagesByTrade dateStart=" + dateStart + " dateEnd=" + dateEnd + " id=" + id + " inn=" + inn);
		ArrayOfTradePlace response = soapClient.getTradeMessagesByTrade(asXMLGregorianCalendar(dateStart),
				asXMLGregorianCalendar(dateEnd), id, inn);
		return response;
	}

	@GetMapping("/getDebtorsByLastPublicationPeriod/{dateStart}/{dateEnd}")
	public DebtorList getDebtorsByLastPublicationPeriod(@PathVariable String dateStart, @PathVariable String dateEnd) {
		log.info("getDebtorsByLastPublicationPeriod dateStart=" + dateStart + " dateEnd=" + dateEnd);
		DebtorList response = soapClient.getDebtorsByLastPublicationPeriod(asXMLGregorianCalendar(dateStart),
				asXMLGregorianCalendar(dateEnd));
		return response;
	}

	@GetMapping("/getTradeMessages/{dateStart}/{dateEnd}")
	public ArrayOfTradePlace getTradeMessages(@PathVariable String dateStart, @PathVariable String dateEnd) {
		log.info("getTradeMessages dateStart=" + dateStart + " dateEnd=" + dateEnd);
		ArrayOfTradePlace response = soapClient.getTradeMessages(asXMLGregorianCalendar(dateStart),
				asXMLGregorianCalendar(dateEnd));
		return response;
	}

	@GetMapping("/getMessageIds/{dateStart}/{dateEnd}")
	public ArrayOfInt getMessageIds(@PathVariable String dateStart, @PathVariable String dateEnd) {
		log.info("getMessageIds dateStart=" + dateStart + " dateEnd=" + dateEnd);
		ArrayOfInt response = soapClient.getMessageIds(asXMLGregorianCalendar(dateStart),
				asXMLGregorianCalendar(dateEnd));
		return response;
	}

	@GetMapping("/getMessageContent/{id}")
	public String getMessageContent(@PathVariable int id) {
		log.info("getMessageContent id=" + id);
		String response = soapClient.getMessageContent(id);
		return "<xmp>" + response + "</xmp>";
	}

	@GetMapping("/getTradeMessageContent/{id}")
	public String getTradeMessageContent(@PathVariable int id) {
		log.info("getTradeMessageContent id=" + id);
		String response = soapClient.getTradeMessageContent(id);
		return "<xmp>" + response + "</xmp>";
	}

	@GetMapping("/getCompanyTradeOrganizerRegister/{date}")
	public TradeOrganizerList getCompanyTradeOrganizerRegister(@PathVariable String date) {
		log.info("getCompanyTradeOrganizerRegister date=" + date);
		TradeOrganizerList response = soapClient.getCompanyTradeOrganizerRegister(asXMLGregorianCalendar(date));
		return response;
	}

	@GetMapping("/searchDebtorByCode/{type}/{value}")
	public DebtorList searchDebtorByCode(@PathVariable DebtorCodeType type, @PathVariable String value) {
		log.info("searchDebtorByCode dateStart=" + type + " dateEnd=" + value);
		DebtorList response = soapClient.searchDebtorByCode(type, value);
		return response;
	}

	@GetMapping("/getArbitrManagerRegister/{date}")
	public AMList getArbitrManagerRegister(@PathVariable String date) {
		log.info("getArbitrManagerRegister date=" + date);
		AMList response = soapClient.getArbitrManagerRegister(asXMLGregorianCalendar(date));
		return response;
	}

	@GetMapping("/getDebtorByIdBankrupt/{id}")
	public DebtorRegisterItem getDebtorByIdBankrupt(@PathVariable int id) {
		log.info("getDebtorByIdBankrupt id=" + id);
		DebtorRegisterItem response = soapClient.getDebtorByIdBankrupt(id);
		return response;
	}

	@GetMapping("/getDebtorReportsContentForPeriodByIdBankrupt/{id}/{date}")
	public String getDebtorReportsContentForPeriodByIdBankrupt(@PathVariable int id, @PathVariable String date) {
		log.info("getDebtorReportsContentForPeriodByIdBankrupt id=" + id + " date=" + date);
		String response = soapClient.getDebtorReportsContentForPeriodByIdBankrupt(id, asXMLGregorianCalendar(date));
		return "<xmp>" + response + "</xmp>";
	}

	@GetMapping("/getSroRegister/{date}")
	public SROList getSroRegister(@PathVariable String date) {
		log.info("getSroRegister date=" + date);
		SROList response = soapClient.getSroRegister(asXMLGregorianCalendar(date));
		return response;
	}

	private XMLGregorianCalendar asXMLGregorianCalendar(String date) {
		if (date == null || date.isEmpty()) {
			return null;
		}
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
		Date startDate = null;
		try {
			startDate = format.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		java.util.GregorianCalendar calDate = new java.util.GregorianCalendar();
		calDate.setTime(startDate);
		javax.xml.datatype.XMLGregorianCalendar calendar = null;
		javax.xml.datatype.DatatypeFactory factory = null;
		try {
			factory = javax.xml.datatype.DatatypeFactory.newInstance();
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		calendar = factory.newXMLGregorianCalendar(
				calDate.get(java.util.GregorianCalendar.YEAR),
				calDate.get(java.util.GregorianCalendar.MONTH) + 1,
				calDate.get(java.util.GregorianCalendar.DAY_OF_MONTH),
				calDate.get(java.util.GregorianCalendar.HOUR_OF_DAY), 
				calDate.get(java.util.GregorianCalendar.MINUTE),
				calDate.get(java.util.GregorianCalendar.SECOND), 
				calDate.get(java.util.GregorianCalendar.MILLISECOND),
				0);
		return calendar;
	}

}

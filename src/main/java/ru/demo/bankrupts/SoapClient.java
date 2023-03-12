package ru.demo.bankrupts;

import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import ru.demo.bankrupts.soap.bindings.AMList;
import ru.demo.bankrupts.soap.bindings.ArrayOfInt;
import ru.demo.bankrupts.soap.bindings.ArrayOfTradePlace;
import ru.demo.bankrupts.soap.bindings.DebtorCodeType;
import ru.demo.bankrupts.soap.bindings.DebtorList;
import ru.demo.bankrupts.soap.bindings.DebtorRegisterItem;
import ru.demo.bankrupts.soap.bindings.IMessageService;
import ru.demo.bankrupts.soap.bindings.SROList;
import ru.demo.bankrupts.soap.bindings.TradeOrganizerList;

@Service
@Component
public class SoapClient {
	private static final Logger log = LoggerFactory.getLogger(SoapClient.class);

	@Autowired
	private IMessageService port;

	public String getDebtorMessagesContentForPeriodByIdBankrupt(
			int _getDebtorMessagesContentForPeriodByIdBankrupt_idBankrupt,
			XMLGregorianCalendar _getDebtorMessagesContentForPeriodByIdBankrupt_startDate)
	{
		log.info("Invoking getDebtorMessagesContentForPeriodByIdBankrupt...");
		String _getDebtorMessagesContentForPeriodByIdBankrupt__return = port
				.getDebtorMessagesContentForPeriodByIdBankrupt(
						_getDebtorMessagesContentForPeriodByIdBankrupt_idBankrupt,
						_getDebtorMessagesContentForPeriodByIdBankrupt_startDate);
		log.info("getDebtorMessagesContentForPeriodByIdBankrupt.result="
				+ _getDebtorMessagesContentForPeriodByIdBankrupt__return);
		return _getDebtorMessagesContentForPeriodByIdBankrupt__return;
	}

	public DebtorList getDebtorRegister(XMLGregorianCalendar _getDebtorRegister_date) {
		log.info("Invoking getDebtorRegister...");
		DebtorList _getDebtorRegister__return = port.getDebtorRegister(_getDebtorRegister_date);
		log.info("getDebtorRegister.result=" + _getDebtorRegister__return);
		return _getDebtorRegister__return;
	}

	public ArrayOfTradePlace getTradeMessagesByTrade(XMLGregorianCalendar _getTradeMessagesByTrade_startFrom,
			XMLGregorianCalendar _getTradeMessagesByTrade_endTo, String _getTradeMessagesByTrade_id,
			String _getTradeMessagesByTrade_tradePlaceInn)
	{
		log.info("Invoking getTradeMessagesByTrade...");
		ArrayOfTradePlace _getTradeMessagesByTrade__return = port.getTradeMessagesByTrade(
				_getTradeMessagesByTrade_startFrom, _getTradeMessagesByTrade_endTo, _getTradeMessagesByTrade_id,
				_getTradeMessagesByTrade_tradePlaceInn);
		log.info("getTradeMessagesByTrade.result=" + _getTradeMessagesByTrade__return);
		return _getTradeMessagesByTrade__return;
	}

	public DebtorList getDebtorsByLastPublicationPeriod(
			XMLGregorianCalendar _getDebtorsByLastPublicationPeriod_startDate,
			XMLGregorianCalendar _getDebtorsByLastPublicationPeriod_endDate)
	{
		log.info("Invoking getDebtorsByLastPublicationPeriod...");
		DebtorList _getDebtorsByLastPublicationPeriod__return = port.getDebtorsByLastPublicationPeriod(
				_getDebtorsByLastPublicationPeriod_startDate, _getDebtorsByLastPublicationPeriod_endDate);
		log.info("getDebtorsByLastPublicationPeriod.result=" + _getDebtorsByLastPublicationPeriod__return);
		return _getDebtorsByLastPublicationPeriod__return;
	}

	public ArrayOfTradePlace getTradeMessages(XMLGregorianCalendar _getTradeMessages_startFrom,
			XMLGregorianCalendar _getTradeMessages_endTo)
	{
		log.info("Invoking getTradeMessages...");
		ArrayOfTradePlace _getTradeMessages__return = port.getTradeMessages(_getTradeMessages_startFrom,
				_getTradeMessages_endTo);
		log.info("getTradeMessages.result=" + _getTradeMessages__return);
		return _getTradeMessages__return;
	}

	public ArrayOfInt getMessageIds(XMLGregorianCalendar _getMessageIds_startDate,
			XMLGregorianCalendar _getMessageIds_endDate)
	{
		log.info("Invoking getMessageIds...");
		ArrayOfInt _getMessageIds__return = port.getMessageIds(_getMessageIds_startDate, _getMessageIds_endDate);
		log.info("getMessageIds.result=" + _getMessageIds__return);
		return _getMessageIds__return;
	}

	public String getMessageContent(int _getMessageContent_id) {
		log.info("Invoking getMessageContent...");
		String _getMessageContent__return = port.getMessageContent(_getMessageContent_id);
		log.info("getMessageContent.result=" + _getMessageContent__return);
		return _getMessageContent__return;
	}

	public String getTradeMessageContent(int _getTradeMessageContent_idTradeMessage) {
		log.info("Invoking getTradeMessageContent...");
		String _getTradeMessageContent__return = port.getTradeMessageContent(_getTradeMessageContent_idTradeMessage);
		log.info("getTradeMessageContent.result=" + _getTradeMessageContent__return);
		return _getTradeMessageContent__return;
	}

	public TradeOrganizerList getCompanyTradeOrganizerRegister(
			XMLGregorianCalendar _getCompanyTradeOrganizerRegister_date)
	{
		log.info("Invoking getCompanyTradeOrganizerRegister...");
		TradeOrganizerList _getCompanyTradeOrganizerRegister__return = port
				.getCompanyTradeOrganizerRegister(_getCompanyTradeOrganizerRegister_date);
		log.info("getCompanyTradeOrganizerRegister.result=" + _getCompanyTradeOrganizerRegister__return);
		return _getCompanyTradeOrganizerRegister__return;
	}

	public DebtorList searchDebtorByCode(DebtorCodeType _searchDebtorByCode_codeType,
			String _searchDebtorByCode_codeValue)
	{
		log.info("Invoking searchDebtorByCode...");
		DebtorList _searchDebtorByCode__return = port.searchDebtorByCode(_searchDebtorByCode_codeType,
				_searchDebtorByCode_codeValue);
		log.info("searchDebtorByCode.result=" + _searchDebtorByCode__return);
		return _searchDebtorByCode__return;
	}

	public AMList getArbitrManagerRegister(XMLGregorianCalendar _getArbitrManagerRegister_date) {
		log.info("Invoking getArbitrManagerRegister...");
		AMList _getArbitrManagerRegister__return = port.getArbitrManagerRegister(_getArbitrManagerRegister_date);
		log.info("getArbitrManagerRegister.result=" + _getArbitrManagerRegister__return);
		return _getArbitrManagerRegister__return;
	}

	public DebtorRegisterItem getDebtorByIdBankrupt(int _getDebtorByIdBankrupt_idBankrupt) {
		log.info("Invoking getDebtorByIdBankrupt...");
		DebtorRegisterItem _getDebtorByIdBankrupt__return = port
				.getDebtorByIdBankrupt(_getDebtorByIdBankrupt_idBankrupt);
		log.info("getDebtorByIdBankrupt.result=" + _getDebtorByIdBankrupt__return);
		return _getDebtorByIdBankrupt__return;
	}

	public String getDebtorReportsContentForPeriodByIdBankrupt(
			int _getDebtorReportsContentForPeriodByIdBankrupt_idBankrupt,
			XMLGregorianCalendar _getDebtorReportsContentForPeriodByIdBankrupt_startDate)
	{
		log.info("Invoking getDebtorReportsContentForPeriodByIdBankrupt...");
		String _getDebtorReportsContentForPeriodByIdBankrupt__return = port
				.getDebtorReportsContentForPeriodByIdBankrupt(_getDebtorReportsContentForPeriodByIdBankrupt_idBankrupt,
						_getDebtorReportsContentForPeriodByIdBankrupt_startDate);
		log.info("getDebtorReportsContentForPeriodByIdBankrupt.result="
				+ _getDebtorReportsContentForPeriodByIdBankrupt__return);
		return _getDebtorReportsContentForPeriodByIdBankrupt__return;
	}

	public SROList getSroRegister(XMLGregorianCalendar _getSroRegister_date) {
		log.info("Invoking getSroRegister...");
		SROList _getSroRegister__return = port.getSroRegister(_getSroRegister_date);
		log.info("getSroRegister.result=" + _getSroRegister__return);
		return _getSroRegister__return;
	}

}


package ru.demo.bankrupts.soap.bindings;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.5.5
 * 2023-03-12T19:13:14.474+03:00
 * Generated source version: 3.5.5
 *
 */
public final class IMessageService_BasicHttpBindingIMessageService_Client {

    private static final QName SERVICE_NAME = new QName("http://tempuri.org/", "MessageService");

    private IMessageService_BasicHttpBindingIMessageService_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = MessageService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        MessageService ss = new MessageService(wsdlURL, SERVICE_NAME);
        IMessageService port = ss.getBasicHttpBindingIMessageService();

        {
        System.out.println("Invoking getDebtorMessagesContentForPeriodByIdBankrupt...");
        int _getDebtorMessagesContentForPeriodByIdBankrupt_idBankrupt = 0;
        javax.xml.datatype.XMLGregorianCalendar _getDebtorMessagesContentForPeriodByIdBankrupt_startDate = null;
        java.lang.String _getDebtorMessagesContentForPeriodByIdBankrupt__return = port.getDebtorMessagesContentForPeriodByIdBankrupt(_getDebtorMessagesContentForPeriodByIdBankrupt_idBankrupt, _getDebtorMessagesContentForPeriodByIdBankrupt_startDate);
        System.out.println("getDebtorMessagesContentForPeriodByIdBankrupt.result=" + _getDebtorMessagesContentForPeriodByIdBankrupt__return);


        }
        {
        System.out.println("Invoking getDebtorRegister...");
        javax.xml.datatype.XMLGregorianCalendar _getDebtorRegister_date = null;
        ru.demo.bankrupts.soap.bindings.DebtorList _getDebtorRegister__return = port.getDebtorRegister(_getDebtorRegister_date);
        System.out.println("getDebtorRegister.result=" + _getDebtorRegister__return);


        }
        {
        System.out.println("Invoking getTradeMessagesByTrade...");
        javax.xml.datatype.XMLGregorianCalendar _getTradeMessagesByTrade_startFrom = null;
        javax.xml.datatype.XMLGregorianCalendar _getTradeMessagesByTrade_endTo = null;
        java.lang.String _getTradeMessagesByTrade_id = "";
        java.lang.String _getTradeMessagesByTrade_tradePlaceInn = "";
        ru.demo.bankrupts.soap.bindings.ArrayOfTradePlace _getTradeMessagesByTrade__return = port.getTradeMessagesByTrade(_getTradeMessagesByTrade_startFrom, _getTradeMessagesByTrade_endTo, _getTradeMessagesByTrade_id, _getTradeMessagesByTrade_tradePlaceInn);
        System.out.println("getTradeMessagesByTrade.result=" + _getTradeMessagesByTrade__return);


        }
        {
        System.out.println("Invoking getDebtorsByLastPublicationPeriod...");
        javax.xml.datatype.XMLGregorianCalendar _getDebtorsByLastPublicationPeriod_startDate = null;
        javax.xml.datatype.XMLGregorianCalendar _getDebtorsByLastPublicationPeriod_endDate = null;
        ru.demo.bankrupts.soap.bindings.DebtorList _getDebtorsByLastPublicationPeriod__return = port.getDebtorsByLastPublicationPeriod(_getDebtorsByLastPublicationPeriod_startDate, _getDebtorsByLastPublicationPeriod_endDate);
        System.out.println("getDebtorsByLastPublicationPeriod.result=" + _getDebtorsByLastPublicationPeriod__return);


        }
        {
        System.out.println("Invoking getTradeMessages...");
        javax.xml.datatype.XMLGregorianCalendar _getTradeMessages_startFrom = null;
        javax.xml.datatype.XMLGregorianCalendar _getTradeMessages_endTo = null;
        ru.demo.bankrupts.soap.bindings.ArrayOfTradePlace _getTradeMessages__return = port.getTradeMessages(_getTradeMessages_startFrom, _getTradeMessages_endTo);
        System.out.println("getTradeMessages.result=" + _getTradeMessages__return);


        }
        {
        System.out.println("Invoking getMessageIds...");
        javax.xml.datatype.XMLGregorianCalendar _getMessageIds_startDate = null;
        javax.xml.datatype.XMLGregorianCalendar _getMessageIds_endDate = null;
        ru.demo.bankrupts.soap.bindings.ArrayOfInt _getMessageIds__return = port.getMessageIds(_getMessageIds_startDate, _getMessageIds_endDate);
        System.out.println("getMessageIds.result=" + _getMessageIds__return);


        }
        {
        System.out.println("Invoking getMessageContent...");
        int _getMessageContent_id = 0;
        java.lang.String _getMessageContent__return = port.getMessageContent(_getMessageContent_id);
        System.out.println("getMessageContent.result=" + _getMessageContent__return);


        }
        {
        System.out.println("Invoking getTradeMessageContent...");
        int _getTradeMessageContent_idTradeMessage = 0;
        java.lang.String _getTradeMessageContent__return = port.getTradeMessageContent(_getTradeMessageContent_idTradeMessage);
        System.out.println("getTradeMessageContent.result=" + _getTradeMessageContent__return);


        }
        {
        System.out.println("Invoking getCompanyTradeOrganizerRegister...");
        javax.xml.datatype.XMLGregorianCalendar _getCompanyTradeOrganizerRegister_date = null;
        ru.demo.bankrupts.soap.bindings.TradeOrganizerList _getCompanyTradeOrganizerRegister__return = port.getCompanyTradeOrganizerRegister(_getCompanyTradeOrganizerRegister_date);
        System.out.println("getCompanyTradeOrganizerRegister.result=" + _getCompanyTradeOrganizerRegister__return);


        }
        {
        System.out.println("Invoking searchDebtorByCode...");
        ru.demo.bankrupts.soap.bindings.DebtorCodeType _searchDebtorByCode_codeType = null;
        java.lang.String _searchDebtorByCode_codeValue = "";
        ru.demo.bankrupts.soap.bindings.DebtorList _searchDebtorByCode__return = port.searchDebtorByCode(_searchDebtorByCode_codeType, _searchDebtorByCode_codeValue);
        System.out.println("searchDebtorByCode.result=" + _searchDebtorByCode__return);


        }
        {
        System.out.println("Invoking getArbitrManagerRegister...");
        javax.xml.datatype.XMLGregorianCalendar _getArbitrManagerRegister_date = null;
        ru.demo.bankrupts.soap.bindings.AMList _getArbitrManagerRegister__return = port.getArbitrManagerRegister(_getArbitrManagerRegister_date);
        System.out.println("getArbitrManagerRegister.result=" + _getArbitrManagerRegister__return);


        }
        {
        System.out.println("Invoking getDebtorByIdBankrupt...");
        int _getDebtorByIdBankrupt_idBankrupt = 0;
        ru.demo.bankrupts.soap.bindings.DebtorRegisterItem _getDebtorByIdBankrupt__return = port.getDebtorByIdBankrupt(_getDebtorByIdBankrupt_idBankrupt);
        System.out.println("getDebtorByIdBankrupt.result=" + _getDebtorByIdBankrupt__return);


        }
        {
        System.out.println("Invoking getDebtorReportsContentForPeriodByIdBankrupt...");
        int _getDebtorReportsContentForPeriodByIdBankrupt_idBankrupt = 0;
        javax.xml.datatype.XMLGregorianCalendar _getDebtorReportsContentForPeriodByIdBankrupt_startDate = null;
        java.lang.String _getDebtorReportsContentForPeriodByIdBankrupt__return = port.getDebtorReportsContentForPeriodByIdBankrupt(_getDebtorReportsContentForPeriodByIdBankrupt_idBankrupt, _getDebtorReportsContentForPeriodByIdBankrupt_startDate);
        System.out.println("getDebtorReportsContentForPeriodByIdBankrupt.result=" + _getDebtorReportsContentForPeriodByIdBankrupt__return);


        }
        {
        System.out.println("Invoking getSroRegister...");
        javax.xml.datatype.XMLGregorianCalendar _getSroRegister_date = null;
        ru.demo.bankrupts.soap.bindings.SROList _getSroRegister__return = port.getSroRegister(_getSroRegister_date);
        System.out.println("getSroRegister.result=" + _getSroRegister__return);


        }

        System.exit(0);
    }

}
package ru.demo.bankrupts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody 
@RequestMapping("/")
public class HomeController {

	@GetMapping
	public String home() {
		return "<h1>Examples</h1>"
				+ "<a href=\"/getDebtorMessagesContentForPeriodByIdBankrupt/138890/2020-08-01\">getDebtorMessagesContentForPeriodByIdBankrupt/{id}/{date}</a><br/>"
				+ "<a href=\"/getDebtorRegister/2020-08-01\">getDebtorRegister/{date}</a><br/>"
				+ "<a href=\"/getTradeMessagesByTrade/2020-08-01/2020-08-31/272E9D76FD3F47F0A225D41AA22CF4A1/3377362803\">getTradeMessagesByTrade/{dateStart}/{dateEnd}/{id}/{inn}</a><br/>"
				+ "<a href=\"/getDebtorsByLastPublicationPeriod/2020-08-01/2020-08-31\">getDebtorsByLastPublicationPeriod/{dateStart}/{dateEnd}</a><br/>"
				+ "<a href=\"/getTradeMessages/2020-08-01/2020-08-10\">getTradeMessages/{dateStart}/{dateEnd}</a><br/>"
				+ "<a href=\"/getMessageIds/2020-08-01/2020-11-07\">getMessageIds/{dateStart}/{dateEnd}</a><br/>"
				+ "<a href=\"/getMessageContent/1666740\">getMessageContent/{id}</a><br/>"
				+ "<a href=\"/getTradeMessageContent/4901487\">getTradeMessageContent/{id}</a><br/>"
				+ "<a href=\"/getCompanyTradeOrganizerRegister/2020-08-01\">getCompanyTradeOrganizerRegister/{date}</a><br/>"
				+ "<a href=\"/searchDebtorByCode/SNILS/42603540444\">searchDebtorByCode/{type}/{code}</a><br/>"
				+ "<a href=\"/getArbitrManagerRegister/2020-08-01\">getArbitrManagerRegister/{date}</a><br/>"
				+ "<a href=\"/getDebtorByIdBankrupt/138895\">getDebtorByIdBankrupt/{id}</a><br/>"
				+ "<a href=\"/getDebtorReportsContentForPeriodByIdBankrupt/138890/2020-08-01\">getDebtorReportsContentForPeriodByIdBankrupt/{id}/{date}</a><br/>"
				+ "<a href=\"/getSroRegister/2019-01-01\">getSroRegister/{date}</a><br/>"
				+ "";
	}

}

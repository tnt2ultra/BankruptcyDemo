# BankruptcyDemo
Example of a request to a EFRSB (bankrot service.fedresurs.ru)

Run and open http://127.0.0.1:8080/

1. getDebtorMessagesContentForPeriodByIdBankrupt/{id}/{date}
2. getDebtorRegister/{date}
3. getTradeMessagesByTrade/{dateStart}/{dateEnd}/{id}/{inn}
4. getDebtorsByLastPublicationPeriod/{dateStart}/{dateEnd}
5. getTradeMessages/{dateStart}/{dateEnd}
6. getMessageIds/{dateStart}/{dateEnd}
7. getMessageContent/{id}
8. getTradeMessageContent/{id}
9. getCompanyTradeOrganizerRegister/{date}
10. searchDebtorByCode/{type}/{code}
11. getArbitrManagerRegister/{date}
12. getDebtorByIdBankrupt/{id}
13. getDebtorReportsContentForPeriodByIdBankrupt/{id}/{date}
14. getSroRegister/{date}

using org.apache.cxf / cxf-codegen-plugin / 3.5.5

package ru.demo.bankrupts;

import java.net.MalformedURLException;

import org.apache.cxf.configuration.security.AuthorizationPolicy;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import ru.demo.bankrupts.soap.bindings.IMessageService;

@Configuration
@ComponentScan(basePackages = { "ru.demo.bankrupts" }, basePackageClasses = SoapClient.class)
public class SoapConfig {
	private static final Logger log = LoggerFactory.getLogger(SoapConfig.class);

	@Bean
	public IMessageService bankrotPort() throws MalformedURLException {
		log.info("bankrotPort started");
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(IMessageService.class);
//		factory.setAddress("https://services.fedresurs.ru/Bankruptcy/MessageService/WebService.svc"); // PROD
		factory.setAddress("https://services.fedresurs.ru/Bankruptcy/MessageServiceDemo/WebService.svc"); // TEST

		IMessageService port = (IMessageService) factory.create();

		Client client = ClientProxy.getClient(port);
		HTTPConduit httpConduit = (HTTPConduit) client.getConduit();

		AuthorizationPolicy authorization = httpConduit.getAuthorization();
		authorization.setAuthorizationType("Digest");
		authorization.setUserName("demowebuser"); // TEST
		authorization.setPassword("Ax!761BN"); // TEST

		log.info("bankrotPort " + port);
		return port;
	}

}

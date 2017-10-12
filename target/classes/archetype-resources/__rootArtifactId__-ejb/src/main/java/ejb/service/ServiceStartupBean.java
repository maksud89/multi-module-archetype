#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )

package ${package}.ejb.service;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import ${package}.api.Service;

@Singleton
@Startup
public class ServiceStartupBean {
	private final static Logger LOGGER = Logger.getLogger(ServiceStartupBean.class.toString());


    @PostConstruct
    void onServiceStart() {
    	LOGGER.info("PostConstrruct has been called");
    }

    @PreDestroy
    void onServiceStop() {
    	LOGGER.info("PreDestroy has been called");
    }

}

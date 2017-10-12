#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )

package ${package}.ejb;


import java.util.Date;

import javax.ejb.Stateless;
import ${package}.api.Service;



@Stateless
public class ServiceBean implements Service {


	 @Override
	    public String resolveDate() {
	        return new Date().toString();
	    }
}

#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )

package ${package}.api;

import javax.ejb.Local;

@Local
public interface Service {

    String resolveDate();

}
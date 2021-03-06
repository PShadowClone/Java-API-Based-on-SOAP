
package org.netbeans.j2ee.wsdl.flightservice.flightservicewsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import org.netbeans.xml.schema.flightservicetypes.FlightServiceResponse;
import org.netbeans.xml.schema.flightservicetypes.FlightServiceType;
import org.netbeans.xml.schema.flightservicetypes.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3.3-hudson-757-SNAPSHOT
 * Generated source version: 2.1
 * 
 */
@WebService(name = "FlightServiceWSDLPortType", targetNamespace = "http://j2ee.netbeans.org/wsdl/FlightService/FlightServiceWSDL")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FlightServiceWSDLPortType {


    /**
     * 
     * @param flightServiceInformation
     * @return
     *     returns org.netbeans.xml.schema.flightservicetypes.FlightServiceResponse
     */
    @WebMethod(operationName = "ReserveFlightTrip", action = "ReserveFlightTrip_action")
    @WebResult(name = "flightServiceInformation", partName = "flightServiceInformation")
    public FlightServiceResponse reserveFlightTrip(
        @WebParam(name = "flightServiceInformation", partName = "flightServiceInformation")
        FlightServiceType flightServiceInformation);

}

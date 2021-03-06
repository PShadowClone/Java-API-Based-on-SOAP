
package rca;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3.3-hudson-757-SNAPSHOT
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "RCAService1", targetNamespace = "RCA", wsdlLocation = "http://localhost:9080/RCAService1/casaPort1?wsdl")
public class RCAService1
    extends Service
{

    private final static URL RCASERVICE1_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(rca.RCAService1 .class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = rca.RCAService1 .class.getResource(".");
            url = new URL(baseUrl, "http://localhost:9080/RCAService1/casaPort1?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:9080/RCAService1/casaPort1?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        RCASERVICE1_WSDL_LOCATION = url;
    }

    public RCAService1(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RCAService1() {
        super(RCASERVICE1_WSDL_LOCATION, new QName("RCA", "RCAService1"));
    }

    /**
     * 
     * @return
     *     returns CompositeServiceWSDLPortType
     */
    @WebEndpoint(name = "casaPort1")
    public CompositeServiceWSDLPortType getCasaPort1() {
        return super.getPort(new QName("RCA", "casaPort1"), CompositeServiceWSDLPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CompositeServiceWSDLPortType
     */
    @WebEndpoint(name = "casaPort1")
    public CompositeServiceWSDLPortType getCasaPort1(WebServiceFeature... features) {
        return super.getPort(new QName("RCA", "casaPort1"), CompositeServiceWSDLPortType.class, features);
    }

}

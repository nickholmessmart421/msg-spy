//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.20 at 03:57:06 PM BST 
//


package pl.baczkowicz.mqspy.daemon.generated.configuration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.baczkowicz.mqspy.daemon.generated.configuration package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MqSpyDaemonConfiguration_QNAME = new QName("http://baczkowicz.pl/spy/daemon/configuration", "MqSpyDaemonConfiguration");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.baczkowicz.mqspy.daemon.generated.configuration
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MqSpyDaemonConfiguration }
     * 
     */
    public MqSpyDaemonConfiguration createMqSpyDaemonConfiguration() {
        return new MqSpyDaemonConfiguration();
    }

    /**
     * Create an instance of {@link DaemonJmsConnectionDetails }
     * 
     */
    public DaemonJmsConnectionDetails createDaemonJmsConnectionDetails() {
        return new DaemonJmsConnectionDetails();
    }

    /**
     * Create an instance of {@link Connectivity }
     * 
     */
    public Connectivity createConnectivity() {
        return new Connectivity();
    }

    /**
     * Create an instance of {@link RemoteControl }
     * 
     */
    public RemoteControl createRemoteControl() {
        return new RemoteControl();
    }

    /**
     * Create an instance of {@link HttpListener }
     * 
     */
    public HttpListener createHttpListener() {
        return new HttpListener();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MqSpyDaemonConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://baczkowicz.pl/spy/daemon/configuration", name = "MqSpyDaemonConfiguration")
    public JAXBElement<MqSpyDaemonConfiguration> createMqSpyDaemonConfiguration(MqSpyDaemonConfiguration value) {
        return new JAXBElement<MqSpyDaemonConfiguration>(_MqSpyDaemonConfiguration_QNAME, MqSpyDaemonConfiguration.class, null, value);
    }

}
